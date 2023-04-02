import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Product} from "../model/product";

@Injectable({
  providedIn: 'root'
})
export class ProductService {
private url = "http://localhost:3000/product";
  constructor(private http : HttpClient) { }
  getAllp():Observable<Product[]>{
    return this.http.get<Product[]>(this.url);
  }

  save(product):Observable<Product>{
    if (product.id){
      return this.http.put(this.url + '/' + product.id,product);
    }
    return this.http.post(this.url,product);
  }

  findByID(id) : Observable<Product>{
    return this.http.get<Product>(this.url + '/' + id);
  }

  delete(id){
    return this.http.delete<Product>(this.url + '/' +id);
  }
}
