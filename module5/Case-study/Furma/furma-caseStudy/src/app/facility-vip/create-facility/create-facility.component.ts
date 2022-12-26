import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {FacilityService} from "../../service/facility.service";

@Component({
  selector: 'app-create-facility',
  templateUrl: './create-facility.component.html',
  styleUrls: ['./create-facility.component.css']
})
export class CreateFacilityComponent implements OnInit {
  facilityFormCreate: FormGroup;

  constructor(private facilityService: FacilityService, private formBuilder: FormBuilder) { }

  ngOnInit(): void {
    this.facilityFormCreate = this.formBuilder.group(
      {
        name: ['', [Validators.required, Validators.pattern('^\\D+$')]],
        area: ['', [Validators.required, Validators.min(0)]],
        price: ['', [Validators.required]],
        maximum: ['', [Validators.required, Validators.min(0)]],
        image: ['', [Validators.required]],
        type: ['', [Validators.required]]
      });
  }

  createFacility() {
    if (this.facilityFormCreate.valid) {
      this.facilityService.save(this.facilityFormCreate.value);
      document.getElementById('modelId').click();
    } else {
      alert('Tạo thông tin không thành công');
    }
  }
}
