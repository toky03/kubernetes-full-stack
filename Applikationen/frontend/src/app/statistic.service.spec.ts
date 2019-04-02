import { TestBed } from '@angular/core/testing';

import { StatisticService } from './statistic.service';

describe('StatisticService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: StatisticService = TestBed.get(StatisticService);
    expect(service).toBeTruthy();
  });
});
