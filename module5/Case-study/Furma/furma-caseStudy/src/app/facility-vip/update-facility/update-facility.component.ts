import {Component, Input, OnInit, SimpleChanges} from '@angular/core';
import {Facility} from "../../model/facility";
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {FacilityService} from "../../service/facility.service";

@Component({
  selector: 'app-update-facility',
  templateUrl: './update-facility.component.html',
  styleUrls: ['./update-facility.component.css']
})
export class UpdateFacilityComponent implements OnInit {
  facilityFormEdit: FormGroup;
  @Input('editFacility') facility: Facility;

  constructor(private facilityService: FacilityService) { }

  ngOnInit(): void {}

  ngOnChanges(changes: SimpleChanges): void {
    this.facilityFormEdit = new FormGroup(
      {
        name: new FormControl(this.facility.name, [Validators.required]),
        area: new FormControl(this.facility.area, [Validators.required]),
        price: new FormControl(this.facility.price, [Validators.required]),
        maximum: new FormControl(this.facility.maximum, [Validators.required]),
        type: new FormControl(this.facility.type)
      });
  }

  editFacility() {}
}
