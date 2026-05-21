import { Injectable } from '@angular/core';
import { BehaviorSubject } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class LoginService {
  private isLoggedIn = new BehaviorSubject<boolean>(false)
  loginStatus$ = this.isLoggedIn.asObservable()

  login(){
    localStorage.setItem('isLoggedIn','true')
    this.isLoggedIn.next(true)
  }

  logout(){
    localStorage.removeItem('isLoggedIn')
    this.isLoggedIn.next(false)
  }


  
}
