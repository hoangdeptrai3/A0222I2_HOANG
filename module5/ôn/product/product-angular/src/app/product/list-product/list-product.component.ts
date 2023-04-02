import { Component, OnInit } from '@angular/core';
import {ProductService} from "../../service/product.service";
import {CategoryService} from "../../service/category.service";
import {Product} from "../../model/product";
import {Category} from "../../model/category";
import {ActivatedRoute, ParamMap, Router} from "@angular/router";

@Component({
  selector: 'app-list-product',
  templateUrl: './list-product.component.html',
  styleUrls: ['./list-product.component.css']
})
export class ListProductComponent implements OnInit {
  products : Product[] = [];
  categorys: Category[] = [];
  product : Product;
  config:any;
  constructor(private productService : ProductService,
              private categoryService : CategoryService,
              private router : Router,
              private actiID : ActivatedRoute) { }

  ngOnInit(): void {
    this.getAllP();
    this.getAllS();
    // this.actiID.paramMap.subscribe((pa : ParamMap)=>{
    //   this.delete(pa.get('id'))
    // })
  }

  getAllP(){
    this.productService.getAllp().subscribe(data=>{
      this.products = data;
      this.config = {
        itemsPerPage: 3,
        currentPage: 1,
        totalItems: this.products.length
      };
    })
  }
  getAllS(){
    this.categoryService.getAlls().subscribe(data=>{
      this.categorys = data;
    })
  }
  delete(){
    this.productService.delete(this.product.id).subscribe(data=>{
      // this.router.navigateByUrl('/list')
      this.ngOnInit();
    })
  }

  getInfo(itemp) {
    this.product = itemp;

  }

  pageChanged(event: number) {
    this.config.currentPage = event;
  }
}
