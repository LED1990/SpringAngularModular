import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppComponent} from './app.component';
import {HttpClient} from "@angular/common/http";
import {ZgloszeniaModule} from "./ModulZgloszenia/zgloszeniaMod/zgloszenia.module";
import {AppRoutingModule} from './app-routing.module';
import {AdministracjaModule} from "./ModulAdministracja/administracjaMod/administracja.module";

@NgModule({
  declarations: [
    AppComponent,
  ],
  imports: [
    BrowserModule,
    ZgloszeniaModule,
    AppRoutingModule,
    AdministracjaModule
  ],
  providers: [HttpClient],
  bootstrap: [AppComponent]
})
export class AppModule { }
