import { Component, OnInit } from '@angular/core';
import { interval } from 'rxjs';
import { InfracaoService } from '../infracao.service';
import { Infracao } from './infracao';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  infracoes : Infracao[] = [];
  constructor(private infracaoService : InfracaoService) { }

  ngOnInit(): void {
    
    var obs$ = interval(3000)
      obs$.subscribe(
        r => this.infracaoService.getInfracoes()
        .subscribe(resp => this.infracoes = resp)
      )
      
   
    
  }



}
