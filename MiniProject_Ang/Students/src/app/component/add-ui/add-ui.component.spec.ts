import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddUIComponent } from './add-ui.component';

describe('AddUIComponent', () => {
  let component: AddUIComponent;
  let fixture: ComponentFixture<AddUIComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddUIComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AddUIComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
