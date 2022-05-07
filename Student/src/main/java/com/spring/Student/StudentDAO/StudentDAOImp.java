package com.spring.Student.StudentDAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring.Student.Model.Student;
@Repository
public class StudentDAOImp implements StudentDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate ;

	public JdbcTemplate getJdbcTemplate() {
		return this.jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbc) {
		this.jdbcTemplate = jdbc;
	}

	@Override 
//	public List<Student> selectAllStudent() {
//		String sql = "SELECT * FROM Students";
//		//System.out.println(getJdbcTemplate().query(sql, new StudentRowMapper()));
//		return getJdbcTemplate().query(sql, new StudentRowMapper());
//		
//	}
	public List<Student> selectAllStudent() {
		String sql = "SELECT * FROM Students";
		//System.out.println(getJdbcTemplate().query(sql, new StudentRowMapper()));
		return getJdbcTemplate().query(sql, (rs,row) -> {
			return new Student(rs.getLong("Id"), rs.getString("Name"),rs.getInt("Age"),rs.getString("ClassRoom"),rs.getString("Address"));
		});
		
	}
	@Override
//	public void addStudent(Student s) {
//		String sql = "INSERT INTO Students(Name, Age, ClassRoom, Address)"
//				+"VALUES(?, ?, ?, ?)";
//		int add = getJdbcTemplate().update(sql, s.getName(),s.getAge(),s.getClassroom(),s.getAddress());
//		if(add == 1) {
//			System.out.println("Insert OKe");
//		}
//	}
	
	public Student addStudent(Student s) {
		String sql = "INSERT INTO Students(Name, Age, ClassRoom, Address)"
				+"VALUES(?, ?, ?, ?)";
		int add = getJdbcTemplate().update(sql, s.getName(),s.getAge(),s.getClassroom(),s.getAddress());
		if(add == 1) {
			System.out.println("Insert OKe");
		}
		return s;
	}
	@Override
	public long editStudent(long id, Student s) {
		String sql = "UPDATE Students SET "
				+ " Name = ?, "
				+ " Age = ?, "
				+ " ClassRoom = ?, "
				+ " Address = ? "
				+ " WHERE Id = ? ";
		if(id != s.getId()) return 0;
		long update = getJdbcTemplate().update(sql,s.getName(),s.getAge(),s.getClassroom(),s.getAddress(),id);
		if(update == 1) {
			System.out.println("Student edited Oke !");
		}
		return update;
	}
	@Override
	public long deleteStudent(long s) {
		String sql = "DELETE FROM Students "
				+ " WHERE Id = ? "
				+ " LIMIT 1 ";
		long del = getJdbcTemplate().update(sql,s);
		if(del == 1) {
			System.out.println("Student deleted !");
		}
		return del;
	}
	@Override
//	public Student getStudentById(long id) {
//		String sql = "SELECT * FROM Students WHERE Id = ?";
//		return getJdbcTemplate().queryForObject(sql,new StudentRowMapper(),id);
//	}
	public Student getStudentById(long id) {
		String sql = "SELECT * FROM Students WHERE Id = ?";
		return getJdbcTemplate().queryForObject(sql,(rs, row) ->{
			return new Student(rs.getLong("Id"), rs.getString("Name"),rs.getInt("Age"),rs.getString("ClassRoom"),rs.getString("Address"));
		},id);
	}
}
