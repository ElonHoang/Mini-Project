package com.spring.Student.StudentDAO;

import java.util.List;

import com.spring.Student.Model.Student;

public interface StudentDAO {
	public List<Student> selectAllStudent();
	public Student addStudent(Student s);
	public long editStudent(long id, Student l);
	public long deleteStudent(long s);
	public Student getStudentById(long id);
}
