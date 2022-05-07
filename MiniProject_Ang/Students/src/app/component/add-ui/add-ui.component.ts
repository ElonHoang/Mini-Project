import { Component, OnInit } from '@angular/core';
import { Students } from 'src/app/models/students.model';
import { StudentService } from 'src/app/services/student.service';
import { Router } from '@angular/router';
@Component({
  selector: 'app-add-ui',
  templateUrl: './add-ui.component.html',
  styleUrls: ['./add-ui.component.css']
})
export class AddUIComponent implements OnInit {
std: Students = new Students();
  constructor(private stdService : StudentService, private router: Router) { }

  ngOnInit(): void {
      
  }

  saveStudent(){
    this.stdService.createStudent(this.std).subscribe(data => {
      console.log(data);
      this.goToStudentsList();
    },);
   // error => console.log(error));
  }
    goToStudentsList(){
      this.router.navigate(['/stds']);
    }
    onSubmit(){
      console.log(this.std);
      this.saveStudent();
    }
  }


