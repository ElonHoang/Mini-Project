package com.spring.Student.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.Student.Model.Student;
import com.spring.Student.StudentDAO.StudentDAO;
import com.spring.Student.StudentDAO.StudentDAOImp;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class StudentController {
	@Autowired
	StudentDAO stdDAO;
	@GetMapping("/stds")
	public ResponseEntity<List<Student>> getAllStudents(@RequestParam(required = false) String title){
		try {
			List<Student> stdList = new ArrayList<>();
			//if(title == null) {
				stdDAO.selectAllStudent().forEach(stdList::add);
			//}else {
			//	stdDAO.selectAllStudent().forEach(stdList::add);
			//}
			if(stdList.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(stdList, HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@GetMapping("/stds/{id}")
	public ResponseEntity<Student> getStudentById(@PathVariable("id") Long Id){
		try{
				Student s = stdDAO.getStudentById(Id);
				return new ResponseEntity<>(s,HttpStatus.OK);		
		}catch(Exception e) {
			return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@PostMapping("/stds")
	public ResponseEntity<String> addStudents(@RequestBody Student std){
		try {
			stdDAO.addStudent(new Student(std.getId(),std.getName(),std.getAge(),std.getClassroom(),std.getAddress()));
			return new ResponseEntity<>("Student added !",HttpStatus.CREATED);
		}catch( Exception e) {
			return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@PutMapping("/stds/{id}")
	public ResponseEntity<String> updateStudent(@PathVariable("id") long id, @RequestBody Student std){
		//tudent s = stdDAO.getStudentById(id);
		if(id > 0) {
			stdDAO.editStudent(id,std);
//		}
//		if(s > 0) {
			return new ResponseEntity<>("Student edited !",HttpStatus.OK);
		}else {
			return new ResponseEntity<>("Student not edited !",HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@DeleteMapping("/stds/{id}")
	public ResponseEntity<String> deleteStudentById(@PathVariable("id") long id){
		try {
			long s = stdDAO.deleteStudent(id);
			if(s > 0) {
				return new ResponseEntity<>("Student deleted !",HttpStatus.OK);
			}else {
				return new ResponseEntity<>("Student delete failed !", HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}catch(Exception e) {
			return new ResponseEntity<>("Student delete failed !", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
