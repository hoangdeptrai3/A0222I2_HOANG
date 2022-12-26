import {Component, Input, OnInit} from '@angular/core';

@Component({
  selector: 'app-delete-cus',
  templateUrl: './delete-cus.component.html',
  styleUrls: ['./delete-cus.component.css']
})
export class DeleteCusComponent implements OnInit {
  @Input('inputCode')
  code: string;

  constructor() { }

  ngOnInit(): void {
  }

}
