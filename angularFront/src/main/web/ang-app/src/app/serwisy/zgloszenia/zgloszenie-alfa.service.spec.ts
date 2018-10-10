import { TestBed } from '@angular/core/testing';

import { ZgloszenieAlfaSerwis } from './zgloszenieAlfaSerwis';

describe('ZgloszenieAlfaSerwis', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ZgloszenieAlfaSerwis = TestBed.get(ZgloszenieAlfaSerwis);
    expect(service).toBeTruthy();
  });
});
