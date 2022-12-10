import { Component, OnInit } from '@angular/core';
import {FormCreate} from "../../model/form-create";
import {FormControl, FormGroup, Validators} from "@angular/forms";

@Component({
  selector: 'app-register-component',
  templateUrl: './register-component.component.html',
  styleUrls: ['./register-component.component.css']
})
export class RegisterComponentComponent implements OnInit {
  formCreates : FormCreate ={};
  formCreate  : FormGroup;
  constructor() {
    this.formCreate = new FormGroup({
      id : new FormControl("",[Validators.required,Validators.min(0)]),
      name : new FormControl("",[Validators.minLength(5)]),
      age : new FormControl(),
      gender : new FormControl()
    });
  }

  ngOnInit(): void {
  }

  submitForm(){
    this.formCreates = {};

  }

}
