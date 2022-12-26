import { Injectable } from '@angular/core';
import {Contract} from "../model/contract";

@Injectable({
  providedIn: 'root'
})
export class ContractService {
  private contracts: Contract[] = [
    {id: 1, code: 'HD001', startDate: '2022-12-06', endDate: '2022-12-06', downPayment: 120000, totalPayment: 300000},
    {id: 2, code: 'HD002', startDate: '2022-12-06', endDate: '2022-12-06', downPayment: 560000, totalPayment: 620000},
    {id: 3, code: 'HD003', startDate: '2022-12-06', endDate: '2022-12-06', downPayment: 250000, totalPayment: 850000},
    {id: 4, code: 'HD004', startDate: '2022-12-06', endDate: '2022-12-06', downPayment: 350000, totalPayment: 360000},
  ];

  constructor() {
  }


  get contract(): Contract[] {
    return this.contracts;
  }

  set contract(value: Contract[]) {
    this.contracts = value;
  }

  save(contract: Contract) {
    this.contracts.unshift(contract);
  }
}
