import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'
import { ProjectformComponent } from './projectform/projectform.component';
import Project from './bugform/project';


const BASE_URL="http://localhost:8042/project"
@Injectable()
export default class ProjectService {

  constructor(private http:HttpClient) { }

sendSaveRequest(project:Project){
return this.http.post(BASE_URL,project,{headers:{
  "content-type":"application/json","Access-Control-Allow-Origin":"*"
}});
}
}
