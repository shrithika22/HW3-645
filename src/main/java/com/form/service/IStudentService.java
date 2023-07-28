package com.form.service;

import java.util.List;

import com.form.entity.Student;

public interface IStudentService {
	
	Student addStudent(Student student);

	Student getStudentById(int id);

	void removeStudentByID(int id);

	void updateStudent(Student student);

	void insertStudentDao(Student student);
	
	List<Student> getAllStudents();

}
