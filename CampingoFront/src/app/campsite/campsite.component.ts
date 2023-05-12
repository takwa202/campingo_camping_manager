import { Component, OnInit } from '@angular/core';
import { CampsiteService } from '../serviceCampsite/campsite.service';



@Component({
  selector: 'app-campsite',
  templateUrl: './campsite.component.html',
  styleUrls: ['./campsite.component.css'],
  providers: [CampsiteService] // Ajoutez cette ligne
})
export class CampsiteComponent implements OnInit {

  dataArray:any
  constructor(private campsiteService: CampsiteService) { }

  ngOnInit(): void {
    this.campsiteService.getAllCampsite().subscribe(data => this.dataArray=data);

  }

}
