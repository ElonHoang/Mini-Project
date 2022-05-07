package com.spring.Student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.Student.Model.Student;
import com.spring.Student.StudentDAO.StudentDAO;
import com.spring.Student.StudentDAO.StudentDAOImp;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		//ConfigurableApplicationContext appl = 
				SpringApplication.run(DemoApplication.class, args);
//				StudentDAO s = new StudentDAOImp();
				System.out.println("OKe");
				//System.out.println(s.selectAllStudent());	
				//StudentDAO sdt = appl.getBean(StudentDAOImp.class);
		//sdt.selectAllStudent().forEach(System.out::println);
//		System.out.println("---------------------------------------");
//		System.out.println("---------------------------------------");
//		//employeeDao.updateEmployeeEmailById("kk.cs2021@gmail.com", 1);
//		//employeeDao.deleteEmployeeById(3);
//		System.out.println(getStudent());
				
				//Student s = new Student("h",11,"ggg","hhh");
//				StudentDAO std = new StudentDAOImp();
//				System.out.println(std.selectAllStudent());
//				std.deleteStudent(1L);
//	
	}
	

}
