import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './navbar/navbar.component';
import { FooterComponent } from './footer/footer.component';
import { FacilityComponent } from './facility/facility.component';
import { EditFacilityComponent } from './edit-facility/edit-facility.component';
import { EditCustomerComponent } from './edit-customer/edit-customer.component';
import { CustomerUseFacilityComponent } from './customer-use-facility/customer-use-facility.component';
import { CustomerListComponent } from './customer-list/customer-list.component';
import { ContractListComponent } from './contract-list/contract-list.component';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    FooterComponent,
    FacilityComponent,
    EditFacilityComponent,
    EditCustomerComponent,
    CustomerUseFacilityComponent,
    CustomerListComponent,
    ContractListComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
