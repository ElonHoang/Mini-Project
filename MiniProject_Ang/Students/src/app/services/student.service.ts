import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Students } from '../models/students.model';
const baseUrl = "http://localhost:8080/api/stds";
@Injectable({
  providedIn: 'root'
})
export class StudentService {


  constructor(private http: HttpClient) { }
  getAllStudent(): Observable<Students[]>{
    return this.http.get<Students[]>(`${baseUrl}`);
  }
  createStudent(data: Students): Observable<Students>{
    return this.http.post(`${baseUrl}`, data);
  }
  updateStudent(id: any, data: Students): Observable<Students>{
    return this.http.put(`${baseUrl}/${id}`, data);
  }
  // deleteAll(): Observable<Students>{
  //   return this.http.delete(baseUrl);
  // }
  deleteStudentById(id:any):Observable<Students>{
    return this.http.delete(`${baseUrl}/${id}`);
  }
  getStudentById(id: any) : Observable<Students>
{
  return this.http.get<Students>(`${baseUrl}/${id}`);
}
}
