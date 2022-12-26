import { Injectable } from '@angular/core';
import {Facility} from "../model/facility";

@Injectable({
  providedIn: 'root'
})
export class FacilityService {

  private facilities: Facility[] = [
    // tslint:disable-next-line:max-line-length
    {id: 1, name: 'ABS HOUSE', area: 350, price: 1000000, maximum: 10, image: '././assets/facility-img/FACILITY-IMG.jpg', type: 'vip'},
    // tslint:disable-next-line:max-line-length
    {id: 2, name: 'ABS HOUSE', area: 178, price: 2000000, maximum: 14, image: '././assets/facility-img/FACILITY-IMG.jpg', type: 'vip'},
    // tslint:disable-next-line:max-line-length
    {id: 3, name: 'ABS HOUSE', area: 250, price: 3000000, maximum: 12, image: '././assets/facility-img/FACILITY-IMG.jpg', type: 'vip'},
    // tslint:disable-next-line:max-line-length
    {id: 4, name: 'ABS HOUSE', area: 643, price: 4000000, maximum: 10, image: '././assets/facility-img/FACILITY-IMG.jpg', type: 'vip'},
    // tslint:disable-next-line:max-line-length
    {id: 5, name: 'ABS HOUSE', area: 100, price: 5000000, maximum: 10, image: '././assets/facility-img/FACILITY-IMG.jpg', type: 'vip'},
    // tslint:disable-next-line:max-line-length
    {id: 6, name: 'ABS HOUSE', area: 540, price: 6000000, maximum: 10, image: '././assets/facility-img/FACILITY-IMG.jpg', type: 'vip'},
    // tslint:disable-next-line:max-line-length
    {id: 7, name: 'ABS HOUSE', area: 205, price: 7000000, maximum: 10, image: '././assets/facility-img/FACILITY-IMG.jpg', type: 'vip'},
    // tslint:disable-next-line:max-line-length
    {id: 8, name: 'ABS HOUSE', area: 145, price: 8000000, maximum: 10, image: '././assets/facility-img/FACILITY-IMG.jpg', type: 'vip'}
  ];
  constructor() { }


  get facility(): Facility[] {
    return this.facilities;
  }

  set facility(value: Facility[]) {
    this.facilities = value;
  }
  findAll() {
    return this.facilities;
  }

  save(facility: Facility) {
    facility.image = facility.image.split('\\')[2];
    facility.image = `../../assets/facility-image/${facility.image}`;
    this.facilities.unshift(facility);
  }

  findById(id: number) {
    // @ts-ignore
    return this.facilities.filter(x => x.id === id)[0];
    // return this.facilities.indexOf(id - 1);
  }


}
