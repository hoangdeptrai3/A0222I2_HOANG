import { Component, OnInit } from '@angular/core';
import {Category} from "../../model/category";
import {Product} from "../../model/product";
import {CategoryService} from "../../service/category.service";
import {ProductService} from "../../service/product.service";
import {ActivatedRoute, ParamMap, Router} from "@angular/router";
import {FormBuilder, FormGroup} from "@angular/forms";

@Component({
  selector: 'app-update-product',
  templateUrl: './update-product.component.html',
  styleUrls: ['./update-product.component.css']
})


export class UpdateProductComponent implements OnInit {
  categoryList : Category[] = [];
  products : Product = {};
  productForm : FormGroup;
  constructor(private categoryService : CategoryService,
              private productService : ProductService,
              private router : Router,
              private active : ActivatedRoute,
              private formBuild : FormBuilder) { }

  ngOnInit(): void {
  this.categoryService.getAlls().subscribe(data=>{
    this.categoryList = data
  })
    this.buildFormProduct();
    if (this.router.url.includes('/product/create')){
      return;
    }
    this.active.paramMap.subscribe((pa : ParamMap)=>{
      const activeID = pa.get("id");
      this.productService.findByID(activeID).subscribe(data=>{
        this.products = data;
        this.buildFormProduct();
      })
    })

  }

  submitProduct(){
    this.products = this.productForm.value;
    this.productService.save(this.products).subscribe(data=>{
     this.router.navigateByUrl('/list')
    })
  }

  buildFormProduct(){
    this.productForm = this.formBuild.group({
      id:[this.products == undefined ? "" : this.products.id],
      name:[this.products == undefined ? "" : this.products.name],
      price:[this.products == undefined ? "" : this.products.price],
      category:[this.products == undefined ? "" : this.products.category],
    })
  }

}
