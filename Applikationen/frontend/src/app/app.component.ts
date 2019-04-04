import { Component } from '@angular/core';
import { RandomNumber } from './models/random-number';
import { RandNumberImpl } from './impl/rand-number-impl';
import { PodStatistic } from './models/pod-statistic';
import { PodStatisticImpl } from './impl/pod-statistic-impl';
import { FetchNumberService } from './fetch-number.service';
import { StatisticService } from './statistic.service';
import { MatTableDataSource } from '@angular/material';
import { Series } from './models/series';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'ui-frontend';

  randomNumber: RandomNumber = new RandNumberImpl();
  statistics: PodStatistic[] = [new PodStatisticImpl()];
  datasource: any;
  multi: Series[];

  displayedColumns: string [] = ['id', 'counter'];

  // Graph
  view: any[] = [700, 400];
  showXAxis = true;
  showYAxis = true;
  gradient = false;
  showLegend = true;
  showXAxisLabel = true;
  xAxisLabel = 'Sum of all Calls';
  showYAxisLabel = true;
  yAxisLabel = 'Calls per Pod';
  timeline = true;
  colorScheme = {
    domain: ['#5AA454', '#A10A28', '#C7B42C', '#AAAAAA']
  };


  constructor(private fetchNumberService: FetchNumberService,
    private statisticService: StatisticService) {

    }

    getNewNumber(){
      this.fetchNumberService.getRandomNumber()
      .subscribe(
        data =>{this.randomNumber = data;});
    };

    getStatistics(){
      this.statisticService.getStatistics()
      .subscribe(
        data =>{ 
          this.datasource = new MatTableDataSource<PodStatistic>(data);});
    }

    getHistory(){
      this.statisticService.getHistory()
      .subscribe(
        data => {this.multi = data;})
    };

    buttonClick(){
      this.getNewNumber();
      this.getStatistics();
      this.getHistory();
    }

    ngOnInit(){
      this.buttonClick();
    }

}
