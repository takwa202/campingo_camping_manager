import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import Popper from 'popper.js';
import 'bootstrap/dist/js/bootstrap.min.js';
@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {
 
  constructor(public router: Router) { }

  ngOnInit(): void {
  }

}
