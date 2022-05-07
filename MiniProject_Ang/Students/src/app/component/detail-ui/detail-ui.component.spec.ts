import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DetailUIComponent } from './detail-ui.component';

describe('DetailUIComponent', () => {
  let component: DetailUIComponent;
  let fixture: ComponentFixture<DetailUIComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DetailUIComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DetailUIComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
