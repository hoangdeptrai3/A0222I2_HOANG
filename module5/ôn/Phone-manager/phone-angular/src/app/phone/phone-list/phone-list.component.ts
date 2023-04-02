import { Component, OnInit } from '@angular/core';
import {PhoneService} from "../../service/phone.service";
import {CategoryService} from "../../service/category.service";
import {ActivatedRoute, ParamMap, Router} from "@angular/router";
import {Phone} from "../../model/phone";
import {Category} from "../../model/category";
import {FormBuilder, FormControl, FormGroup} from "@angular/forms";

@Component({
  selector: 'app-phone-list',
  templateUrl: './phone-list.component.html',
  styleUrls: ['./phone-list.component.css']
})
export class PhoneListComponent implements OnInit {
  phones : Phone[] = [];
  phone:Phone;
  searchs : FormGroup;
  categoryList : Category[] = [];
  config: any;
  constructor(private phoneService : PhoneService,
              private categoryService : CategoryService,
              private router : Router,
              private activeID : ActivatedRoute,
              private buildFormSearch : FormBuilder) {
    this.searchs = new FormGroup({
      name : new FormControl()
    })
  }

  ngOnInit(): void {
    console.log("aaaaa")
    this.getAll();
    this.getWithName('')
    this.getAll2();
  }
  getAll(){
    this.phoneService.getAll().subscribe(data=>{
      this.phones = data;
      this.config = {
        itemsPerPage: 3,
        currentPage: 1,
        totalItems: this.phones.length
      };
    })
  }
  getAll2(){
    this.categoryService.getAll2().subscribe(data=>{
      this.categoryList = data;
    })
  }

  delete(){
    this.phoneService.delete(this.phone.id).subscribe(data=>{
      this.ngOnInit();
    })
  }

  getInfo(itemp) {
    this.phone = itemp;
  }

  pageChanged(event: number) {
    this.config.currentPage = event;
  }
  getWithName(name){
    this.config = {
      itemsPerPage: 3,
      currentPage: 1,
      totalItems: this.phones.length
    };
    this.phoneService.getWithName(name).subscribe(sex=>{
      this.phones=sex;
      this.config = {
        itemsPerPage: 3,
        currentPage: 1,
        totalItems: this.phones.length
      };
      console.log(this.phones)
    })
  }

 searchForm(){
    this.getWithName(this.searchs.value.name);
 }
 reset(){
    this.searchs.reset();
    this.ngOnInit();
 }

}
