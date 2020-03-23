package com.example.demo.service;

import java.io.IOException;
import java.util.List;

import com.example.demo.model.CertReq;
import com.example.demo.model.Student;


public interface StudentService {
	
	List <Student> getAllStudent();
	
	List<Student> getOneStudent(CertReq certReq);
	
	Student createStudent(Student student);
		
//	Super Admin
	String getStudentDpt(CertReq certReq) throws IOException;


}
