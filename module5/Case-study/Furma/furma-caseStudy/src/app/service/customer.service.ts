import { Injectable } from '@angular/core';
import {Customer} from "../model/customer";

@Injectable({
  providedIn: 'root'
})
export class CustomerService {
  private customers: Customer[] = [
    // tslint:disable-next-line:max-line-length
    {id: 1, code: 'KH-0001', name: 'nguyen A', dob: '2000-12-06', gender: 0, cccd: '231340370', phone: '0326459876', email: 'an@gmail.com', type: 'diamond', address: 'Đà Nẵng'},
    // tslint:disable-next-line:max-line-length
    {id: 2, code: 'KH-0002', name: 'nguyen B', dob: '2000-12-06', gender: 1, cccd: '231340370', phone: '0326489876', email: 'bn@gmail.com', type: 'gold', address: 'Đà Nẵng'},
    // tslint:disable-next-line:max-line-length
    {id: 3, code: 'KH-0003', name: 'nguyen C', dob: '2000-12-06', gender: 2, cccd: '231340370', phone: '0378959876', email: 'cn@gmail.com', type: 'silver', address: 'Đà Nẵng'},
    // tslint:disable-next-line:max-line-length
    {id: 4, code: 'KH-0004', name: 'nguyen D', dob: '2000-12-06', gender: 2, cccd: '231340370', phone: '0698749876', email: 'dn@gmail.com', type: 'diamond', address: 'Đà Nẵng'},
  ];
  constructor() { }


  get customer(): Customer[] {
    return this.customers;
  }

  set customer(value: Customer[]) {
    this.customers = value;
  }

  save(customer: Customer) {
    this.customers.unshift(customer);
  }
}
