import { Injectable } from '@angular/core';
import {Contract} from "../model/contract";

@Injectable({
  providedIn: 'root'
})
export class ContractService {
  private contracts: Contract[] = [
    {id: 1, code: 'CH001', startDate: '2022-10-08', endDate: '2022-11-16', downPayment: 11000, totalPayment: 32000},
    {id: 2, code: 'CH002', startDate: '2022-11-16', endDate: '2022-11-16', downPayment: 11000, totalPayment: 32600},
    {id: 3, code: 'CH003', startDate: '2022-12-11', endDate: '2022-11-16', downPayment: 11000, totalPayment: 15400},
    {id: 4, code: 'CH004', startDate: '2022-09-03', endDate: '2022-11-16', downPayment: 11000, totalPayment: 48000},
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
