import {NgModule} from '@angular/core';
import {RouterModule, Routes} from "@angular/router";
import {ZgloszenieAlfaComponent} from "./ModulZgloszenia/komponenty/zgloszenie-alfa/zgloszenie-alfa.component";
import {AdministracjaMainComponent} from "./ModulAdministracja/komponenty/administracja-main/administracja-main.component";

const routes: Routes = [
  {path: 'zgloszenieAlfa', component: ZgloszenieAlfaComponent},
  {path: 'administracja', component: AdministracjaMainComponent}
  // {path: 'administracja', component: AdministracjaMainComponent, outlet:'adm'}//nazywane router outlety
];

@NgModule({
  imports: [RouterModule.forRoot(routes)
  ],
  exports: [RouterModule]
})
export class AppRoutingModule { }
