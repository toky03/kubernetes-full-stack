import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { RandomNumber } from './models/random-number';

@Injectable({
  providedIn: 'root'
})
export class FetchNumberService {

  constructor(private _http: HttpClient) { }

  getRandomNumber(): Observable<RandomNumber>{

    return this._http.get<RandomNumber>('randomNumber');
  }
}
