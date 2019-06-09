import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { FetchNumberService } from './fetch-number.service';
import { StatisticService } from './statistic.service';
import { MaterialModule } from './material/material.module';
import { HttpClientModule } from '@angular/common/http';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { NgxChartsModule } from '@swimlane/ngx-charts';
import { APP_BASE_HREF } from '@angular/common';

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    MaterialModule,
    HttpClientModule,
    NgxChartsModule,
    BrowserAnimationsModule
  ],
  providers: [FetchNumberService, StatisticService, { provide: APP_BASE_HREF, useValue: window['_app_base'] || '/' }],
  bootstrap: [AppComponent]
})
export class AppModule { }
