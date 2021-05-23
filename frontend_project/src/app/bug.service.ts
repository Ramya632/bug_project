import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class BugService {

  constructor(private http: HttpClient) { }

  API = 'http://localhost:8040';

  public addBug(bugData: any) {
    return this.http.post(this.API + '/bug', bugData);
  }

  public getbugs() {
    return this.http.get(this.API + '/bug');
  }

  public deletebug(id: any) {
    return this.http.delete(this.API + '/bug?id=' + id);
  }
}
