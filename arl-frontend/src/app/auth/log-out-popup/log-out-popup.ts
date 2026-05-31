import { Component } from '@angular/core';
import { MatButtonModule } from '@angular/material/button';
import { MatDialogModule } from "@angular/material/dialog";

@Component({
  selector: 'app-log-out-popup',
  imports: [MatDialogModule, MatButtonModule],
  templateUrl: './log-out-popup.html',
  styleUrl: './log-out-popup.scss',
})
export class LogOutPopup {

}
