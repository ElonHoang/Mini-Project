package com.spring.Student.StudentDAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.Student.Model.Student;

public class StudentRowMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student s = new Student();
		s.setId(rs.getLong("Id"));
		s.setName(rs.getString("Name"));
		s.setAge(rs.getInt("Age"));
		s.setClassroom(rs.getString("ClassRoom"));
		s.setAddress(rs.getString("Address"));
		return s;
	}

}
