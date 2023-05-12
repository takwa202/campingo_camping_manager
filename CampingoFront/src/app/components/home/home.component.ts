import { Component, OnInit } from '@angular/core';
import { CampsiteService } from '../../serviceCampsite/campsite.service';
import { Campsites } from 'src/app/modelCampsite/campsite';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  dataArray:Campsites[] = [];

  constructor(private campsiteService: CampsiteService) { }

  ngOnInit(): void {
    this.campsiteService.getAllCampsite().subscribe(data => this.dataArray=data);
    console.log(this.dataArray[0].imageData)
  }

}
