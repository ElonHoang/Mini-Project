import { Component, OnInit } from '@angular/core';
import { Students } from 'src/app/models/students.model';
import { StudentService } from 'src/app/services/student.service';
import { Router } from '@angular/router';
@Component({
  selector: 'app-index-ui',
  templateUrl: './index-ui.component.html',
  styleUrls: ['./index-ui.component.css']
})
export class IndexUIComponent implements OnInit {
stdArr?: Students[];
  constructor(private stdService : StudentService, private router: Router) { }
  ngOnInit(): void {
    this.getStudentS();
  }
private getStudentS(){
  this.stdService.getAllStudent().subscribe(data => {
    this.stdArr = data;
    console.log(this.stdArr);
  });
}
studentsDetail(id: number){
  this.router.navigate(['detail-ui', id]);
}
updateStudent(id: number){
  this.router.navigate(['update-ui',id]);
}
deleteStudent(id: number){
  this.stdService.deleteStudentById(id).subscribe(data => {
    console.log(data);
    this.getStudentS();
  })
}
}
