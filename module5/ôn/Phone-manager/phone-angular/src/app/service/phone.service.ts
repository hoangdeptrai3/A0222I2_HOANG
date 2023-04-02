import { Injectable } from '@angular/core';
import {Phone} from "../model/phone";
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class PhoneService {
  phone : Phone[] = [];
  private url = "http://localhost:3000/phone";
  constructor(private http : HttpClient) { }

  getAll() : Observable<Phone[]>{
    return this.http.get<Phone[]>(this.url);
  }

  delete(id): Observable<Phone>{
    return this.http.delete<Phone>(this.url + '/' + id);
  }
  save(phones){
    if (phones.id){
      return this.http.put(this.url + '/' + phones.id,phones);
    }
    return this.http.post(this.url,phones);
  }
  findByID(id) : Observable<Phone>{
    return this.http.get<Phone>(this.url + '/' + id);
  }
  getWithName(name){
    return this.http.get<Phone[]>(`${this.url}?_order=desc&name_like=${name}`)
  }

}
