import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BootrapUsingComponent } from './bootrap-using.component';

describe('BootrapUsingComponent', () => {
  let component: BootrapUsingComponent;
  let fixture: ComponentFixture<BootrapUsingComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BootrapUsingComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BootrapUsingComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
