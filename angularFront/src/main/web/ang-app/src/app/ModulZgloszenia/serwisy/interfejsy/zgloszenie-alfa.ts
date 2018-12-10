import {TypZgloszenia} from "../Enumy/typ-zgloszenia.enum";
import {Pacjent} from "./Wspolne/pacjent";
import {Choroba} from "./Wspolne/choroba";

export interface ZgloszenieAlfa {
  id: number;
  izolacja: boolean;
  ciaza: boolean;
  numerZgloszenia: string;
  typZgloszenia: TypZgloszenia;
  pacjent: Pacjent;
  choroba: Choroba[];
}
