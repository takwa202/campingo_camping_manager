import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, throwError } from 'rxjs';
import { catchError, retry } from 'rxjs/operators';
import { User } from '../Model/user';

@Injectable({
  providedIn: 'root'
})
export class UserServiceService {
 // sender! : User;
  private apiUrl = 'http://localhost:8092/Campi/AUTH/auth/register';
  constructor(private http: HttpClient) { }
  
  
 

   public register(user : User ): Observable<User>{
   return this.http.post<User>(this.apiUrl, user); 
   
  }
}
 