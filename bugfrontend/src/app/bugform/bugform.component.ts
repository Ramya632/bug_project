import { Component, OnInit } from '@angular/core';

import Project from '../bugform/project';
import  BugService from '../bug.service';
import Bug from './bug';

@Component({
  selector: 'app-bugform',
  templateUrl: './bugform.component.html',
  styleUrls: ['./bugform.component.css']
})
export class BugformComponent implements OnInit {
  bug: Bug = new Bug();
  constructor(private bugService: BugService) { }
  save() {
    console.log(this.bug);
    const promise = this.bugService.sendSaveRequest(this.bug);
    promise.subscribe(function(response){
      console.log(response);
    })
  }
  ngOnInit(): void {
  }

}
