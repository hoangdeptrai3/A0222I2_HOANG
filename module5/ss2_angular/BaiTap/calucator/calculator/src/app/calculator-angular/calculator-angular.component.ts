import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-calculator-angular',
  templateUrl: './calculator-angular.component.html',
  styleUrls: ['./calculator-angular.component.css']
})
export class CalculatorAngularComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }
  result = '0';

  currvalue = '';


  writetoinput(value:string){
    if (this.currvalue == '0'){
      this.currvalue = value;
    }
    if (this.currvalue != '0'){
      this.currvalue += value;
    }
    this.result = this.currvalue ;
  }
  equals(){
    this.result = eval(this.result)
    this.currvalue = this.result
  }

  delete(){
    this.currvalue = "";
    this.result = '0';
  }

  backone(){
    this.result = this.result.substr(0,this.result.length-1);
    this.currvalue = this.result;
  }
}

