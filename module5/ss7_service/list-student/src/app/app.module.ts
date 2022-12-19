import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ListStudentComponent } from './list-student/list-student.component';
import { TimelinesComponent } from './timelines/timelines.component';
import { YoutubePlaylistComponent } from './youtube-playlist/youtube-playlist.component';
import { CreateStudentComponent } from './create-student/create-student.component';
import {ReactiveFormsModule} from "@angular/forms";
// import { ProductComponent } from './service/service/product/product.component';
import {ProductService} from "./service/service/product.service";
import { ProductListComponent } from './product/product-list/product-list.component';
import { ProductCreateComponent } from './product/product-create/product-create.component';


let ProductComponent;

@NgModule({
  declarations: [
    AppComponent,
    ListStudentComponent,
    TimelinesComponent,
    YoutubePlaylistComponent,
    CreateStudentComponent,
    ProductComponent,
    ProductListComponent,
    ProductCreateComponent,

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
