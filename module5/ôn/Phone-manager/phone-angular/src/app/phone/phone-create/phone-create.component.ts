import { Component, OnInit } from '@angular/core';
import {PhoneService} from "../../service/phone.service";
import {CategoryService} from "../../service/category.service";
import {ActivatedRoute, ParamMap, Router} from "@angular/router";
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {Phone} from "../../model/phone";
import {Category} from "../../model/category";

@Component({
  selector: 'app-phone-create',
  templateUrl: './phone-create.component.html',
  styleUrls: ['./phone-create.component.css']
})
export class PhoneCreateComponent implements OnInit {
  formPhone : FormGroup;
  phones : Phone = {} ;
  categoryList : Category[] = [];

  constructor(private phoneService : PhoneService,
              private categoryService : CategoryService,
              private router : Router,
              private active : ActivatedRoute,
              private formBuild : FormBuilder) { }

  ngOnInit(): void {
    this.categoryService.getAll2().subscribe(data=>{
      this.categoryList = data
    });
    this.buildFormPhone();
    if (this.router.url.includes("/phone/create")){
      return;
    }
    this.active.paramMap.subscribe((pa : ParamMap)=>{
      const activeID = pa.get("id");
      this.phoneService.findByID(activeID).subscribe(data=>{
        this.phones = data;
        this.buildFormPhone();
      });
    });
  }

  submitPhone(){
    this.phones = this.formPhone.value;
    this.phoneService.save(this.phones).subscribe(data=>{
      this.router.navigateByUrl("/list")
    })
  }

  buildFormPhone(){
    this.formPhone = this.formBuild.group({
      id:[this.phones === undefined ? "":this.phones.id],
      name:[this.phones === undefined ? "":this.phones.name,[Validators.required,Validators.minLength(3)]],
      price:[this.phones === undefined ? "":this.phones.price,[Validators.required,Validators.min(1)]],
      category:[this.phones === undefined ? "" : this.phones.category,[Validators.required]]
    })
  }

}
