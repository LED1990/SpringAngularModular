import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AdministracjaMainComponent } from './administracja-main.component';

describe('AdministracjaMainComponent', () => {
  let component: AdministracjaMainComponent;
  let fixture: ComponentFixture<AdministracjaMainComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AdministracjaMainComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AdministracjaMainComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
