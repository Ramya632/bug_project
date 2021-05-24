import { Component, OnInit } from '@angular/core';
import Project from '../bugform/project';
import ProjectService from '../project.service';

@Component({
  selector: 'app-projectform',
  templateUrl: './projectform.component.html',
  styleUrls: ['./projectform.component.css']
})
export class ProjectformComponent implements OnInit {
project:Project=new Project();
  constructor(private projectService:ProjectService) { }
save()
{
  console.log(this.project);
    const promise = this.projectService.sendSaveRequest(this.project);
    promise.subscribe(function(response){
      console.log(response);
    })
}
  ngOnInit(): void {
  }

}

