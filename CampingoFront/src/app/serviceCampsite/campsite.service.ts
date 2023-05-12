import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CampsiteService {
  private apiUrl = 'http://localhost:8092/Campi/AUTH/auth/DetailCampsites/getAllCampsite';

  constructor(private http: HttpClient) { }

  getAllCampsite(): Observable<any> {
    return this.http.get(this.apiUrl);
  }
}

 