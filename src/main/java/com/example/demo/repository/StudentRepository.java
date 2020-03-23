package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Student;
import java.lang.String;
import java.util.List;


@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

	List<Student> findByMatNo(String matno);
}