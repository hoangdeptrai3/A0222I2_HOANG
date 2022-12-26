import { Component, OnInit } from '@angular/core';
import {CustomerService} from "../service/customer.service";
import {Customer} from "../model/customer";

@Component({
  selector: 'app-customer-vip',
  templateUrl: './customer-vip.component.html',
  styleUrls: ['./customer-vip.component.css']
})
export class CustomerVipComponent implements OnInit {
  customers: Customer[] | undefined;
  codeCustomer: string | undefined;

  constructor(private customerService: CustomerService) { }

  ngOnInit(): void {
    this.getAllCustomer();
  }

  private getAllCustomer() {
    this.customers = this.customerService.customer;
  }

  deleteCustomer(id: number, code: string) {
    this.codeCustomer = code;
  }
}
