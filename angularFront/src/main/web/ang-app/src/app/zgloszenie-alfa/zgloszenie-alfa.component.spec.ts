import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ZgloszenieAlfaComponent } from './zgloszenie-alfa.component';

describe('ZgloszenieAlfaComponent', () => {
  let component: ZgloszenieAlfaComponent;
  let fixture: ComponentFixture<ZgloszenieAlfaComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ZgloszenieAlfaComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ZgloszenieAlfaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
