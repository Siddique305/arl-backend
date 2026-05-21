import { Component, inject, OnInit } from '@angular/core';
import { MatButtonModule } from '@angular/material/button';
import { MatIconModule } from '@angular/material/icon';
import { MatToolbarModule } from '@angular/material/toolbar';
import { Login } from '../auth/login/login';
import { MatDialog } from '@angular/material/dialog';
import { Router } from '@angular/router';
import { LoginService } from '../services/login-service';


@Component({
  selector: 'app-header',
  imports: [MatToolbarModule, MatButtonModule, MatIconModule],
  templateUrl: './header.html',
  styleUrl: './header.scss',
})
export class Header implements OnInit {
  
  readonly dialog = inject(MatDialog);
  constructor(private router:Router, private loginService: LoginService){}
  
ngOnInit(): void {

  }

logout(){
  this.loginService.logout()
  this.router.navigate(['login'])
}

}
