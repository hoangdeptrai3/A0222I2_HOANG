import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { BodyComponent } from './body/body.component';
import { FooterComponent } from './footer/footer.component';
import { CustomerVipComponent } from './customer-vip/customer-vip.component';
import { ContractVipComponent } from './contract-vip/contract-vip.component';
import { FacilityVipComponent } from './facility-vip/facility-vip.component';
import { CreateContractVipComponent } from './contract-vip/create-contract-vip/create-contract-vip.component';
import {ReactiveFormsModule} from "@angular/forms";
import { DeleteCusComponent } from './customer-vip/delete-cus/delete-cus.component';
import { UpdateCusComponent } from './customer-vip/update-cus/update-cus.component';
import { CreateFacilityComponent } from './facility-vip/create-facility/create-facility.component';
import { DeleteFacilityComponent } from './facility-vip/delete-facility/delete-facility.component';
import { UpdateFacilityComponent } from './facility-vip/update-facility/update-facility.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    BodyComponent,
    FooterComponent,
    CustomerVipComponent,
    ContractVipComponent,
    FacilityVipComponent,
    CreateContractVipComponent,
    DeleteCusComponent,
    UpdateCusComponent,
    CreateFacilityComponent,
    DeleteFacilityComponent,
    UpdateFacilityComponent
  ],
    imports: [
        BrowserModule,
        AppRoutingModule,
        ReactiveFormsModule
    ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
