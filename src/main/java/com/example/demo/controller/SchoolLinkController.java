package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.SchoolLinks;
import com.example.demo.service.SchoolLinksService;


@RestController
public class SchoolLinkController {

	@Autowired
	private SchoolLinksService schoolLinkService; 
//	FOR SUPER ADMIN
//	Add new institution to the service
	@PostMapping("/addInstitution")
	public SchoolLinks regSchUrl(@RequestBody SchoolLinks schoolLinks){	
		return schoolLinkService.createStudent(schoolLinks);
	} 
}
