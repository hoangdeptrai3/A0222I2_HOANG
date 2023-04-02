import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Category} from "../model/category";

@Injectable({
  providedIn: 'root'
})
export class CategoryService {
  private url = "http://localhost:3000/category";
  list : Category[] = [];
  constructor(private http : HttpClient) { }
  getAll2(){
    return this.http.get<Category[]>(this.url);
  }
}
