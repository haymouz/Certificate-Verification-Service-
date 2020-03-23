package com.example.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.SchoolLinks;
import com.example.demo.repository.SchoolLinksRepository;
import com.example.demo.service.SchoolLinksService;

@Service
public class SchoolLinksServiceImpl implements SchoolLinksService {

	@Autowired
	SchoolLinksRepository schoolLinksRepository;
	
	@Override
	public SchoolLinks createStudent(SchoolLinks schoolLinks) {
		return schoolLinksRepository.save(schoolLinks);
	}

}
