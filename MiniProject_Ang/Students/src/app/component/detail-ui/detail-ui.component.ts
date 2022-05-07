import { Component, OnInit } from '@angular/core';
import { Students } from 'src/app/models/students.model';
import { ActivatedRoute } from '@angular/router';
import { StudentService } from 'src/app/services/student.service';
@Component({
  selector: 'app-detail-ui',
  templateUrl: './detail-ui.component.html',
  styleUrls: ['./detail-ui.component.css']
})
export class DetailUIComponent implements OnInit {
  id :any
  std? : Students
  constructor(private router: ActivatedRoute, private stdService : StudentService) { }

  ngOnInit(): void {
    this.id = this.router.snapshot.params['id'];
    this.std = new Students();
    this.stdService.getStudentById(this.id).subscribe(data =>{
      this.std = data;
    });
  }

}
