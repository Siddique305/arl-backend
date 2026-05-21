import { Routes } from '@angular/router';
import { Home } from './home/home';
import { Login } from './auth/login/login';

export const routes: Routes = [
    {
        path: '',
        redirectTo:'login',
        pathMatch:'full'
    },
    {
        path: 'home',
        component:Home,
        title:'Home'
    },
    {
        path: 'login',
        component:Login,
        title:'Login'
    }
    ,
    {
        path: '**',
        component:Login,
        title:'404 Not Found'
    }
];
