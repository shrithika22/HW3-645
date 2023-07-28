package com.form.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.RowMapper;


import com.form.entity.Student;
import com.form.service.IStudentService;

@Repository
@Qualifier("sql")
public class StudentServiceSql implements IStudentService {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
//	jdbcTemplate.execute("CREATE TABLE Student(" +
//	        "id SERIAL, first_name VARCHAR(255), last_name VARCHAR(255))");
	
	@Override
	public Student addStudent(Student student) {
		
		//jdbcTemplate.execute("CREATE TABLE Student(" +
		        //"id SERIAL, firstName VARCHAR(255), lastName VARCHAR(255), streetAddress VARCHAR(255), city VARCHAR(255), state VARCHAR(255), phone VARCHAR(255), email VARCHAR(255), zip VARCHAR(255), date VARCHAR(255), favourite VARCHAR(255), interest VARCHAR(255), likelihood VARCHAR(255), raffle VARCHAR(255), comments VARCHAR(255))");
		
		// TODO Auto-generated method stub
		final String sql = "INSERT INTO Student values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		final int id=student.getId();
		final String firstName= student.getFirstName();
		final String lastName = student.getLastName();
		final String streetAddress = student.getStreetAddress();
		final String city = student.getCity();
		final String zip = student.getZip();
		final String email=student.getEmail();
		final String phone = student.getPhone();
		final String state = student.getState();
		final String date = student.getDate();
		final String favourite = student.getFavourite();
		final String interest = student.getInterest();
		final String likelihood=student.getLikelihood();
		final String comments=student.getComments();
		final String raffle=student.getRaffle();
		
		  
		 
		jdbcTemplate.update(sql,new Object[] {id,firstName,lastName, streetAddress,city,state, phone, email, zip,date,favourite,interest,likelihood,raffle,comments});
		return null;
	}

	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeStudentByID(int id) {
		// TODO Auto-generated method stub
		final String sql = "DELETE from Student where id=?";
		
		jdbcTemplate.update(sql, id);

	}

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		final String sql = "UPDATE Student set favourite=? where id=?";
		
		final int id=student.getId();
//		final String firstName= student.getFirstName();
//		final String lastName = student.getLastName();
//		final String streetAddress = student.getStreetAddress();
//		final String city = student.getCity();
//		final String zip = student.getZip();
//		final String email=student.getEmail();
//		final String phone = student.getPhone();
//		final String state = student.getState();
//		final String date = student.getDate();
		final String favourite = student.getFavourite();
//		final String interest = student.getInterest();
//		final String likelihood=student.getLikelihood();
//		final String comments=student.getComments();
//		final String raffle=student.getRaffle();
		
		  
		 
		jdbcTemplate.update(sql,new Object[] {favourite,id});
		//return null;

	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		final String sql="SELECT * FROM db1.Student";
		
		List<Student> students = (List<Student>) jdbcTemplate.query(sql,new RowMapper<Student>() {
			
			public Student mapRow(ResultSet resultSet,int i) throws SQLException{
				
				Student student = new Student();
				student.setId(resultSet.getInt("id"));
				student.setFirstName(resultSet.getString("firstName"));
				student.setLastName(resultSet.getString("lastName"));
				student.setEmail(resultSet.getString("email"));
				student.setPhone(resultSet.getString("phone"));
				student.setStreetAddress(resultSet.getString("streetaddress"));
				student.setZip(resultSet.getString("zip"));
				student.setCity(resultSet.getString("city"));
				student.setDate(resultSet.getString("date"));
				student.setState(resultSet.getString("state"));
				student.setFavourite(resultSet.getString("favourite"));
				student.setInterest(resultSet.getString("interest"));
				student.setLikelihood(resultSet.getString("likelihood"));
				student.setComments(resultSet.getString("comments"));
				student.setRaffle(resultSet.getString("raffle"));
				return student;
			}
		 });
		return students;
	}

	@Override
	public void insertStudentDao(Student student) {
		// TODO Auto-generated method stub
		
	}

}
