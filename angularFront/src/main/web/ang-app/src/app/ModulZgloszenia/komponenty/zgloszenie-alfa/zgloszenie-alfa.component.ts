import {Component, OnInit} from '@angular/core';
import {ZgloszenieAlfa} from "../../serwisy/interfejsy/zgloszenie-alfa";
import {ZgloszenieAlfaSerwis} from "../../serwisy/zgloszenieAlfaSerwis";
import {Choroba} from "../../serwisy/interfejsy/Wspolne/choroba";
import {Pacjent} from "../../serwisy/interfejsy/Wspolne/pacjent";

@Component({
  selector: 'app-zgloszenie-alfa',
  templateUrl: './zgloszenie-alfa.component.html',
  styleUrls: ['./zgloszenie-alfa.component.css']
})
export class ZgloszenieAlfaComponent implements OnInit {

  zgloszenieAlfa = {pacjent: {} as Pacjent, choroba: {} as Choroba} as ZgloszenieAlfa;

  constructor(private zgloszenieAlfaSerwis: ZgloszenieAlfaSerwis) { }

  ngOnInit() {
  }

  zapisZgloszenieAlfa(){
    this.zgloszenieAlfaSerwis.zapiszZgloszenieAlfa(this.zgloszenieAlfa).subscribe(
      value => {
        console.log('[POST] udało sie zapisać nowe zgłoszenie', value);
      }, error1 => {
        console.log('[POST] NIE!!! udało zapisać nowego zgłoszenia');
      },
      () => {
        console.log('[POST] KONIEC');
      }
    );
  }

}
