import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LogOutPopup } from './log-out-popup';

describe('LogOutPopup', () => {
  let component: LogOutPopup;
  let fixture: ComponentFixture<LogOutPopup>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [LogOutPopup]
    })
    .compileComponents();

    fixture = TestBed.createComponent(LogOutPopup);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
