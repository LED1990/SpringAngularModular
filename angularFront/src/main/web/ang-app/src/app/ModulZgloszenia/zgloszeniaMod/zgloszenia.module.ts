import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {ZgloszenieAlfaComponent} from "../komponenty/zgloszenie-alfa/zgloszenie-alfa.component";
import {HttpClientModule} from "@angular/common/http";
import {FormsModule} from "@angular/forms";

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    HttpClientModule,
  ],
  declarations: [
    ZgloszenieAlfaComponent
  ],
  exports:[ZgloszenieAlfaComponent]
})
export class ZgloszeniaModule { }
