import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { IndexUIComponent } from './component/index-ui/index-ui.component';
import { AddUIComponent } from './component/add-ui/add-ui.component';
import { DetailUIComponent } from './component/detail-ui/detail-ui.component';
import { UpdateUiComponent } from './component/update-ui/update-ui.component';

@NgModule({
  declarations: [
    AppComponent,
    IndexUIComponent,
    AddUIComponent,
    DetailUIComponent,
    UpdateUiComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
