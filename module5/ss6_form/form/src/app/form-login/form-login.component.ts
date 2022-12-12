import { Component, OnInit } from '@angular/core';
import {Login} from "../../model/login";
import {FormControl, FormGroup, Validators} from "@angular/forms";

@Component({
  selector: 'app-form-login',
  templateUrl: './form-login.component.html',
  styleUrls: ['./form-login.component.css']
})
export class FormLoginComponent implements OnInit {
  loginVip : Login = {};
  loginForm : FormGroup;
  constructor() {
    this.loginForm = new FormGroup({
      email : new FormControl("",[Validators.required,Validators.email]),
      password : new FormControl("",[Validators.required,Validators.minLength(6)])
    })
  }

  ngOnInit(): void {
  }
  submitForm(){
    this.loginVip = {};
  }

}
