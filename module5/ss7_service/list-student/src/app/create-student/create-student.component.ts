import { Component, OnInit } from '@angular/core';
import {FormGroup} from "@angular/forms";
import {Student} from "../../model/student";

@Component({
  selector: 'app-create-student',
  templateUrl: './create-student.component.html',
  styleUrls: ['./create-student.component.css']
})
export class CreateStudentComponent implements OnInit {
  createStudentVip : Student = {};
  createStudent : FormGroup;
  constructor() {

  }

  ngOnInit(): void {
  }
  submitStudent(){
    this.createStudentVip = {};
  }

}
