import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {ListProductComponent} from "./product/list-product/list-product.component";
import {UpdateProductComponent} from "./product/update-product/update-product.component";


const routes: Routes = [{
  path:"list",
  component:ListProductComponent
},{
  path:"product/create",
  component:UpdateProductComponent
},{
  path:"product/edit/:id",
  component:UpdateProductComponent
},{
  path:"product/delete/:id",
  component:ListProductComponent
}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
