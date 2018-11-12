import {NgModule} from '@angular/core';
import {RouterModule, Routes} from "@angular/router";
import {ZgloszenieAlfaComponent} from "./ModulZgloszenia/komponenty/zgloszenie-alfa/zgloszenie-alfa.component";
import {AdministracjaMainComponent} from "./ModulAdministracja/komponenty/administracja-main/administracja-main.component";
import {ZgloszeniaComponent} from "./ModulZgloszenia/komponenty/zgloszenia/zgloszenia.component";

const routes: Routes = [
  //ekran głowny: mapowania kafelków
  {path: 'zgloszenia', component: ZgloszeniaComponent},
  {path: 'administracja', component: AdministracjaMainComponent},

  //ekran zgłoszeń: mapowania linków do zgłoszeń
  {path: 'zgloszenia/zgloszenieAlfa', component: ZgloszenieAlfaComponent},

  // {path: 'administracja', component: AdministracjaMainComponent, outlet:'adm'}//nazywane router outlety
];

@NgModule({
  imports: [RouterModule.forRoot(routes)
  ],
  exports: [RouterModule]
})
export class AppRoutingModule { }
