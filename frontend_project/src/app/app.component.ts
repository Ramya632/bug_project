import { Component } from '@angular/core';
import {NgForm} from '@angular/forms';
import {BugService} from './bug.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'frontend';
  bugDetails = null as any;
  bugToUpdate = {
    id:"",
    email:"",
    status:"",
    priority:""
  }

  constructor(private bugService:BugService) {
    this.getbugsDetails();
  }

  register(registerForm: NgForm) {
    this.bugService.addBug(registerForm.value).subscribe(
      (resp) => {
        console.log(resp);
        registerForm.reset();
        this.getbugsDetails();
      },
      (err) => {
        console.log(err);
      }
    );
  }

  getbugsDetails() {
    this.bugService.getbugs().subscribe(
      (resp) => {
        console.log(resp);
        this.bugDetails = resp;
      },
      (err) => {
        console.log(err);
      }
    );
  }

  deleteStudent(student: any) {
    this.bugService.deletebug(student.rollNumber).subscribe(
      (resp) => {
        console.log(resp);
        this.getbugsDetails();
      },
      (err) => {
        console.log(err);
      }
    );
  }

  






}
