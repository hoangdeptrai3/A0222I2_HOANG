import { Component, OnInit } from '@angular/core';
import {Facility} from "../model/facility";
import {FacilityService} from "../service/facility.service";

@Component({
  selector: 'app-facility-vip',
  templateUrl: './facility-vip.component.html',
  styleUrls: ['./facility-vip.component.css']
})
export class FacilityVipComponent implements OnInit {
  facilities: Facility[] | undefined;
  facilityName: string | undefined;

  facility: Facility | undefined;
  constructor(private facilityService: FacilityService) { }

  ngOnInit(): void {
    this.getAllFacilities();
  }

  private getAllFacilities() {
    this.facilities = this.facilityService.findAll();
  }

  deleteFacility(id: number, name: string) {
    this.facilityName = name;
  }

  edit(id: number) {
    this.facility = this.facilityService.findById(id);
  }
}
