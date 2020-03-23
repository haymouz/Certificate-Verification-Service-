package com.example.demo.serviceimpl;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.CertReq;
import com.example.demo.model.SchoolLinks;
import com.example.demo.model.Student;
import com.example.demo.repository.SchoolLinksRepository;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	SchoolLinksRepository schoolLinksRepository;
	
	@Autowired
	StudentRepository studentRepository;

//	Get all students
	@Override
	public List<Student> getAllStudent() {
		return studentRepository.findAll();
	}
	
//	Add Student record 
	@Override
	public Student createStudent(Student student) {
		return studentRepository.save(student);
	}
	
//	Get student using mat no and dept from a particular department
	@Override
	public List<Student> getOneStudent(CertReq certReq) {
		return studentRepository.findByMatNo(certReq.getMatNo());
	}
	
//	FOR SUPER ADMIN, WS PROVIDER
//	Query users using mat no and dept
	@Override
	public String getStudentDpt(CertReq certReq) throws IOException {
		String department = certReq.getDepartment();
		List<SchoolLinks> urlObj = schoolLinksRepository.findByDept(department);
		
		OkHttpClient client = new OkHttpClient();
		Request request = new Request.Builder()
		.url(urlObj.get(0).getUrl())
		.get()
		.build();
		Response response = client.newCall(request).execute();
		String restresponse = response.body().string();
		return restresponse;
	}
	
}
