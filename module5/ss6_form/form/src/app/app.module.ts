import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { TodoAppComponent } from './todo-app/todo-app.component';
import {ReactiveFormsModule} from "@angular/forms";
import { RegisterComponentComponent } from './register-component/register-component.component';
import { FormLoginComponent } from './form-login/form-login.component';

@NgModule({
  declarations: [
    AppComponent,
    TodoAppComponent,
    RegisterComponentComponent,
    FormLoginComponent
  ],
    imports: [
        BrowserModule,
        ReactiveFormsModule
    ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
