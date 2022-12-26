import { Injectable } from '@angular/core';
import {Customer} from "../model/customer";

@Injectable({
  providedIn: 'root'
})
export class CustomerService {
  private customers: Customer[] = [
    {id: 1, code: 'KH-0001', name: 'Đỗ Lê Lận', dob: '2005-11-11', gender: 0, cccd: '25211216719', phone: '0702643642', email: 'hoang@gmail.com', type: 'vip', address: 'Đà Nẵng'},
    // tslint:disable-next-line:max-line-length
    {id: 2, code: 'KH-0002', name: 'Thái Quang Huy Hoàng', dob: '2005-11-11', gender: 1, cccd: '25211216719', phone: '0702643642', email: 'hoang@gmail.com', type: 'vip', address: 'Đà Nẵng'},
    // tslint:disable-next-line:max-line-length
    {id: 3, code: 'KH-0003', name: 'Nguễn Khải', dob: '2005-11-11', gender: 2, cccd: '25211216719', phone: '0702643642', email: 'hoang@gmail.com', type: 'vip', address: 'Đà Nẵng'},
    // tslint:disable-next-line:max-line-length
    {id: 4, code: 'KH-0004', name: 'Tần Minh Chieesn', dob: '2005-11-11', gender: 2, cccd: '25211216719', phone: '0702643642', email: 'hoang@gmail.com', type: 'vip', address: 'Đà Nẵng'},
  ];
  constructor() { }

  save(customer: Customer) {
    this.customers.unshift(customer);
  }
  get customer(): Customer[] {
    return this.customers;
  }

  set customer(value: Customer[]) {
    this.customers = value;
  }

}
