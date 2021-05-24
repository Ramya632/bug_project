import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'
import Bug from './bugform/bug';

const BASE_URL="http://localhost:8042/bug"
@Injectable()
export default class BugService {

  constructor(private http:HttpClient) { }

sendSaveRequest(bug:Bug){
return this.http.post(BASE_URL,bug,{headers:{
  "content-type":"application/json","Access-Control-Allow-Origin":"*"
}});
}
}