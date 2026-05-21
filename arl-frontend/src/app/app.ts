import { Component, inject, OnInit, signal } from '@angular/core';
import { MatBadgeModule } from '@angular/material/badge';
import { RouterOutlet } from '@angular/router';
import { Header } from './header/header';
import { Footer } from './footer/footer';
import { CommonModule } from '@angular/common';
import { LoginService } from './services/login-service';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet,MatBadgeModule,Header, Footer, CommonModule],
  templateUrl: './app.html',
  styleUrl: './app.scss'
})
export class App implements OnInit{
  isLoggedIn:boolean=false;
  protected readonly title = signal('arl-frontend');

  constructor(private loginService:LoginService){}

  ngOnInit(): void {
    this.loginService.loginStatus$.subscribe(status =>{this.isLoggedIn =status})
    this.isLoggedIn=Boolean(localStorage.getItem('isLoggedIn'))
  }
  

}

