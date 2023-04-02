import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {PhoneListComponent} from "./phone/phone-list/phone-list.component";
import {PhoneCreateComponent} from "./phone/phone-create/phone-create.component";


const routes: Routes = [
  {
  path: "list",
  component:PhoneListComponent
},{
  path:"phone/delete/:id",
    component:PhoneListComponent
  },{
  path:"phone/edit/:id",
    component:PhoneCreateComponent
  },{
  path:"phone/create",
    component:PhoneCreateComponent
  }];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
