import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-color-picker',
  templateUrl: './color-picker.component.html',
  styleUrls: ['./color-picker.component.css']
})
export class ColorPickerComponent implements OnInit {
  colorVip : String = "black";
  constructor() { }

  ngOnInit(): void {
  }
  color(color : String){
    switch (color){
      case "yellow":
        this.colorVip = "yellow";
        break;
      case "blue":
        this.colorVip = "blue";
        break;
      case "green":
        this.colorVip = "green";
        break;
    }
  }

}
