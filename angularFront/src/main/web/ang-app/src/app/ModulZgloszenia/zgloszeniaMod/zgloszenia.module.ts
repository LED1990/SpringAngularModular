import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {ZgloszenieAlfaComponent} from "../komponenty/zgloszenie-alfa/zgloszenie-alfa.component";
import {HttpClientModule} from "@angular/common/http";
import {FormsModule} from "@angular/forms";
import {ZgloszeniaComponent} from "../komponenty/zgloszenia/zgloszenia.component";
import {RouterModule} from "@angular/router";

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    HttpClientModule,
    RouterModule
  ],
  declarations: [
    ZgloszenieAlfaComponent,
    ZgloszeniaComponent
  ],
  exports:[]
})
export class ZgloszeniaModule { }
