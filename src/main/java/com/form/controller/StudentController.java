package com.form.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.form.entity.Student;
import com.form.service.StudentServiceImpl;

@RestController
//@RequestMapping("/student")
//@CrossOrigin(origins="http://localhost:3000")
public class StudentController {

	@Autowired
	private StudentServiceImpl studentService;
	
	// Add Student
	//@CrossOrigin
//	@PostMapping("/add")
	@CrossOrigin
	@RequestMapping(value="/putstudents",method = RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public Student addStudent(@RequestBody Student student){
		//ResponseEntity<Object> response=null;
		studentService.addStudent(student);
		//response=new ResponseEntity<Object>(s,HttpStatus.CREATED);
		return student;
	}
	
	@CrossOrigin
	@RequestMapping(value="/Getstudents",method = RequestMethod.GET)

	public List<Student> getAllStudents(){
		return studentService.getAllStudents();
	}
	
	@RequestMapping(value="/students",method = RequestMethod.PUT, consumes=MediaType.APPLICATION_JSON_VALUE)
	public void updateStudent(@RequestBody Student student){
		studentService.updateStudent(student);
	}
 
	@RequestMapping(value ="students/{id}", method =RequestMethod.DELETE)	
	public void deleteStudent(@PathVariable("id")int id){
		studentService.removeStudentByID(id);
	}
}
