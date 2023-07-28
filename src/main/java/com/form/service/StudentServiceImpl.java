package com.form.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.form.entity.Student;

@Service
public class StudentServiceImpl implements IStudentService {
	
	@Autowired
	@Qualifier("sql")
	private IStudentService studentSer;

	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeStudentByID(int id) {
		// TODO Auto-generated method stub
		studentSer.removeStudentByID(id);
		
	}

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		studentSer.updateStudent(student);	
	}

	@Override
	public void insertStudentDao(Student student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
//		List<Student> StudentList = studentRepo.findAll();
//		return StudentList;
		return studentSer.getAllStudents();
	}

	@Override
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		studentSer.addStudent(student);
		return student;
	}

}
