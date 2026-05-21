import { Component, inject } from '@angular/core';
import { FormsModule} from '@angular/forms';
import { MatButtonModule } from '@angular/material/button';
import { MatDialogModule } from '@angular/material/dialog';
import { Router } from '@angular/router';
import { App } from '../../app';
import { LoginService } from '../../services/login-service';

@Component({
  selector: 'app-login',
  imports: [MatButtonModule, MatDialogModule, FormsModule],
  templateUrl: './login.html',
  styleUrl: './login.scss',
})
export class Login {
  email:String = ''
  password:String=''
  // isUserLoggedIn:boolean=false;
  private appService = inject(App)

  constructor(
    private router: Router,
    private loginService: LoginService
  ){

  }
  
  signIn(){
    console.log("Sign-In info ", this.email, this.password)
    if(this.email==="Admin" && this.password==="Admin@123"){
      this.loginService.login()
      this.router.navigate(['home'])
    }
    else{
      alert("Email or Password is incorrect. Please try again ")
      this.email=''
      this.password=''
    }
  }



}
