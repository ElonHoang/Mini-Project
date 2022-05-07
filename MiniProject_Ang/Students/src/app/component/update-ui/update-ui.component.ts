import { Component, OnInit } from '@angular/core';
import { StudentService } from 'src/app/services/student.service';
import { Students } from 'src/app/models/students.model';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-update-ui',
  templateUrl: './update-ui.component.html',
  styleUrls: ['./update-ui.component.css']
})
export class UpdateUiComponent implements OnInit {
id? :number
std : Students = new Students();
  constructor(private stdService : StudentService, 
    private aTiverouter : ActivatedRoute,
    private router : Router) { }

  ngOnInit(): void {
    this.id = this.aTiverouter.snapshot.params['id'];
    this.stdService.getStudentById(this.id).subscribe(data =>{
      this.std = data;
    },)
   // error => console.log(error));
  }
  onSubmit(){
    this.stdService.updateStudent(this.id,this.std).subscribe(data =>{
      this.goToStudentList();
    })
  }
    goToStudentList(){
      this.router.navigate(['/stds']);
    }
  }

