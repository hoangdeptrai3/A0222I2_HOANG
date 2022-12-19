import { Component, OnInit } from '@angular/core';
import {Student} from "../../model/student";

@Component({
  selector: 'app-list-student',
  templateUrl: './list-student.component.html',
  styleUrls: ['./list-student.component.css']
})
export class ListStudentComponent implements OnInit {
  student : Student = {};
  students : Student[] = [];
  constructor() {
    this.students.push({id : 1,name : "huy",age : 15,gender:0,point : 5});
    this.students.push({id : 2,name : "hoang",age : 15,gender:1,point : 6});
    this.students.push({id : 3,name : "Quang",age : 15,gender:0,point : 7});
    this.students.push({id : 4,name : "hoang",age : 15,gender:1,point : 8});
  }

  ngOnInit(): void {
  }

}
