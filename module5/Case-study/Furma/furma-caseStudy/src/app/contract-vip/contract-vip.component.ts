import { Component, OnInit } from '@angular/core';
import {ContractService} from "../service/contract.service";
import {Contract} from "../model/contract";

@Component({
  selector: 'app-contract-vip',
  templateUrl: './contract-vip.component.html',
  styleUrls: ['./contract-vip.component.css']
})
export class ContractVipComponent implements OnInit {

  contracts: Contract[] | undefined;

  constructor(private contractService: ContractService) { }

  ngOnInit(): void {
    this.getAllContract();
  }

  private getAllContract() {
    this.contracts = this.contractService.contract;
  }

}
