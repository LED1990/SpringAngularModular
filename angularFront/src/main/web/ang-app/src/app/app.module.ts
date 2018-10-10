import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import {FormsModule} from "@angular/forms";
import {UzytkownikComponent} from "./uzytkownik/uzytkownik.component";
import {UzytkownikService} from "./serwisy/uzytkownik/uzytkownik.service";
import {HttpClientModule, HttpClient} from "@angular/common/http";
import { ZgloszenieAlfaComponent } from './zgloszenie-alfa/zgloszenie-alfa.component';
import {ZgloszenieAlfaSerwis} from "./serwisy/zgloszenia/zgloszenieAlfaSerwis";

@NgModule({
  declarations: [
    AppComponent,
    UzytkownikComponent,
    ZgloszenieAlfaComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [UzytkownikService, HttpClient, ZgloszenieAlfaSerwis],
  bootstrap: [AppComponent]
})
export class AppModule { }
