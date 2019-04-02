import { TestBed } from '@angular/core/testing';

import { FetchNumberService } from './fetch-number.service';

describe('FetchNumberService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: FetchNumberService = TestBed.get(FetchNumberService);
    expect(service).toBeTruthy();
  });
});
