import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {BodyComponent} from "./body/body.component";
import {FacilityVipComponent} from "./facility-vip/facility-vip.component";
import {CustomerVipComponent} from "./customer-vip/customer-vip.component";
import {ContractVipComponent} from "./contract-vip/contract-vip.component";
import {CreateCusComponent} from "./customer-vip/create-cus/create-cus.component";
import {ReactiveFormsModule} from "@angular/forms";


const routes: Routes = [
  {
    path: '',
    component: BodyComponent},
  {
    path: 'facility',
    component: FacilityVipComponent
  },
  {
    path: 'customer',
    component: CustomerVipComponent
  },
  {
    path: 'contract',
    component: ContractVipComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes), ReactiveFormsModule],
  declarations: [
    CreateCusComponent
  ],
  exports: [RouterModule, CreateCusComponent]
})
export class AppRoutingModule { }
