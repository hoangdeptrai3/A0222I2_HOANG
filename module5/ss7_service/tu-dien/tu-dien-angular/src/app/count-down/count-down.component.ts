import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-count-down',
  templateUrl: './count-down.component.html',
  styleUrls: ['./count-down.component.css']
})
export class CountDownComponent implements OnInit {
  time:number = 0;
  interval;
  startCountDown(){
    this.interval = setInterval(()=>{
      this.time++
    },1000)
  }
  stopCountDown(){
    clearInterval(this.interval)
  }
  resetCountDown(){
    this.time=0;
  }
  constructor() { }

  ngOnInit(): void {
  }

}
