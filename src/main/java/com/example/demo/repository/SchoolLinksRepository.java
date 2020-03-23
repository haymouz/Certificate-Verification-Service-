package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.SchoolLinks;
import java.lang.String;
import java.util.List;


public interface SchoolLinksRepository  extends JpaRepository<SchoolLinks, Long> {
	List<SchoolLinks> findByDept(String dept);
}
