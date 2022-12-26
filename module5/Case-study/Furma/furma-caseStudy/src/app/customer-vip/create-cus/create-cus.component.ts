import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import { CustomerService } from 'src/app/service/customer.service';

@Component({
  selector: 'app-create-cus',
  templateUrl: './create-cus.component.html',
  styleUrls: ['./create-cus.component.css']
})
export class CreateCusComponent implements OnInit {
  customerFormCreate: FormGroup;

  constructor(private customerService: CustomerService, private formBuilder: FormBuilder) { }

  ngOnInit(): void {
    this.customerFormCreate = this.formBuilder.group(
      {
        code: ['', [Validators.required, Validators.pattern('^KH-\\d{4}$')]],
        name: ['', [Validators.required]],
        dob: ['', [Validators.required]],
        gender: [],
        cccd: ['', [Validators.required, Validators.pattern('^\\d{9}$')]],
        phone: ['', [Validators.required, Validators.pattern('^09[01]\\d{7}$')]],
        email: ['', [Validators.required, Validators.email]],
        type: [],
        address: ['', [Validators.required]]
      });
  }

  createCustomer() {
    if (this.customerFormCreate.valid) {
      this.customerService.save(this.customerFormCreate.value);
      document.getElementById('modelId').click();
    } else {
      alert('Tạo thông tin không thành công');
    }
  }
}
