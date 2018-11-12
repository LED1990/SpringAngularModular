import { Component, OnInit } from '@angular/core';
import {TypyZgloszen} from "./classes/typy-zgloszen";

@Component({
  selector: 'app-zgloszenia',
  templateUrl: './zgloszenia.component.html',
  styleUrls: ['./zgloszenia.component.css']
})
export class ZgloszeniaComponent implements OnInit {

  constructor() { }

  listaZgloszen = [
    new TypyZgloszen("zgloszenieAlfa", "Zgłoszenie ALFA"),
    new TypyZgloszen("zgloszenieBeta", "Zgłoszenie BETA"),
    new TypyZgloszen("zgloszenieGamma", "Zgłoszenie GAMMA"),
  ];

  ngOnInit() {
  }

}
