import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdateUiComponent } from './update-ui.component';

describe('UpdateUiComponent', () => {
  let component: UpdateUiComponent;
  let fixture: ComponentFixture<UpdateUiComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ UpdateUiComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(UpdateUiComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
