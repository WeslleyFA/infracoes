import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http'
import { Observable } from 'rxjs';
import { Infracao } from './home/infracao';

@Injectable({
  providedIn: 'root'
})
export class InfracaoService {
  baseUrl : String = "http://localhost:8080";
  constructor(private http : HttpClient) { }

  getInfracoes():Observable<Infracao[]>{
    return this.http.get<Infracao[]>(this.baseUrl+"/record")
  }

}
