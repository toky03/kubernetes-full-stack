import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { PodStatistic } from './models/pod-statistic';
import { Series } from './models/series';

@Injectable({
  providedIn: 'root'
})
export class StatisticService {

  constructor(private _http: HttpClient) { }

  getStatistics(): Observable<PodStatistic[]>{

    return this._http.get<PodStatistic[]>('statistics');
  }

  getHistory(): Observable<Series[]>{

    return this._http.get<Series[]>('history');
  }

}
