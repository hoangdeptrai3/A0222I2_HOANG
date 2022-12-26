import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {ContractService} from "../../service/contract.service";

@Component({
  selector: 'app-create-contract-vip',
  templateUrl: './create-contract-vip.component.html',
  styleUrls: ['./create-contract-vip.component.css']
})
export class CreateContractVipComponent implements OnInit {
  contractFromCreate: FormGroup;

  constructor(private contractService: ContractService, private formBuilder: FormBuilder) { }

  ngOnInit(): void {
    this.contractFromCreate = this.formBuilder.group(
      {
        code: [],
        startDate: [],
        endDate: [],
        downPayment: ['', [Validators.min(0)]],
        totalPayment: []
      });
  }

  createContract() {
    if (this.contractFromCreate.valid) {
      this.contractService.save(this.contractFromCreate.value);
      document.getElementById('modelId').click();
    } else {
      alert('Errors');
    }
  }
}

