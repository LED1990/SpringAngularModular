import {DaneOsobowe} from "./dane-osobowe";

export interface Pacjent {
  id: number;
  daneOsobowe: DaneOsobowe;
  wiek: number;
  dataUrodzenia: Date;
}
