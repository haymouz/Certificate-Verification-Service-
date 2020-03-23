package com.example.demo.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.CertReq;
import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;

	@RestController
	public class VerificationController {
	@Autowired
	private StudentService studentService;
	@Autowired
	StudentRepository studentRepository;
	
//	Add Student Certificate Record
	@PostMapping("/addStudentRec")
	public Student addStudent(@RequestBody Student student){	
		return studentService.createStudent(student);
	} 

//	Get All Students
	@GetMapping("/getAllStudents")
	public List<Student> student(){	
		return studentService.getAllStudent();
	}
	
//	Find record of student using mat no
	@PostMapping("/getStudentRecordMatno")
	public List<Student> studentDetailsMatno(@RequestBody CertReq certReq) throws IOException{	
		return studentService.getOneStudent(certReq);
	}

//	FOR SUPER ADMIN WS SERVICE PROVIDER
//	GET STUDENT USING MAT NO AND DEPT
	@PostMapping("/getStudentRecordUsingMatNo")
	public String studentRec(@RequestBody CertReq certReq) throws IOException{	
		return studentService.getStudentDpt(certReq);
	}

}