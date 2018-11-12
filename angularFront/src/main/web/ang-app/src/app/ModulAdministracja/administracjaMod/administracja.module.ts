import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {AdministracjaMainComponent} from "../komponenty/administracja-main/administracja-main.component";

@NgModule({
  imports: [
    CommonModule
  ],
  declarations: [AdministracjaMainComponent],
  exports: [AdministracjaMainComponent]
})
export class AdministracjaModule { }
