import {Injectable} from '@angular/core';
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {Observable} from "rxjs";
import {ZgloszenieAlfa} from "./interfejsy/zgloszenie-alfa";

//todo przerobic ten interfejs na taki ktory przyjmuje wszystkie typu zgloszen i wysyla do backendu
@Injectable()
export class ZgloszenieAlfaSerwis {

  private static readonly POST_ZGLOSZENIE_URL = '/api/zgloszenie/zapisz';
  private headers = new HttpHeaders({'Content-Type': 'application/json'});

  constructor(private http: HttpClient) { }

  zapiszZgloszenieAlfa(zgloszenieAlfa: ZgloszenieAlfa):Observable<any>{
    return this.http.post(ZgloszenieAlfaSerwis.POST_ZGLOSZENIE_URL, zgloszenieAlfa, {headers: this.headers});
  }
}
