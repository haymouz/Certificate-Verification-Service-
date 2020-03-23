package com.example.demo.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String lName;
	private String OtherName;
	private String department;	
	private String faculty;
	private String refNo;
	private String certDate;
	private String matNo;
	private String session;
	private String classOfHonour;
	private String degree;
	private LocalDateTime dateCreated = LocalDateTime.now();
	
	public Student() {
			}
	
	public Student(String lName, String otherName, String department, String faculty, String refNo, String certDate,
			String matNo, String session, String classOfHonour, String degree, LocalDateTime dateCreated) {
		this.lName = lName;
		OtherName = otherName;
		this.department = department;
		this.faculty = faculty;
		this.refNo = refNo;
		this.certDate = certDate;
		this.matNo = matNo;
		this.session = session;
		this.classOfHonour = classOfHonour;
		this.degree = degree;
		this.dateCreated = dateCreated;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getOtherName() {
		return OtherName;
	}
	public void setOtherName(String otherName) {
		OtherName = otherName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	public String getRefNo() {
		return refNo;
	}
	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}
	public String getCertDate() {
		return certDate;
	}
	public void setCertDate(String certDate) {
		this.certDate = certDate;
	}
	public String getMatNo() {
		return matNo;
	}
	public void setMatNo(String matNo) {
		this.matNo = matNo;
	}
	public String getSession() {
		return session;
	}
	public void setSession(String session) {
		this.session = session;
	}
	public String getClassOfHonour() {
		return classOfHonour;
	}
	public void setClassOfHonour(String classOfHonour) {
		this.classOfHonour = classOfHonour;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public LocalDateTime getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(LocalDateTime dateCreated) {
		this.dateCreated = dateCreated;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", lName=" + lName + ", OtherName=" + OtherName + ", department=" + department
				+ ", faculty=" + faculty + ", refNo=" + refNo + ", certDate=" + certDate + ", matNo=" + matNo
				+ ", session=" + session + ", classOfHonour=" + classOfHonour + ", degree=" + degree + ", dateCreated="
				+ dateCreated + "]";
	}
}
