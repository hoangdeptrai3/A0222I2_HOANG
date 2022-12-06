import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CalculatorAngularComponent } from './calculator-angular.component';

describe('CalculatorAngularComponent', () => {
  let component: CalculatorAngularComponent;
  let fixture: ComponentFixture<CalculatorAngularComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CalculatorAngularComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CalculatorAngularComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
