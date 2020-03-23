package com.example.demo.model;

public class CertReq {

	public CertReq() {
	}

	private String department;

	private String matNo;

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getMatNo() {
		return matNo;
	}

	public void setMatNo(String matNo) {
		this.matNo = matNo;
	}

	@Override
	public String toString() {
		return "CertReq [department=" + department + ", matNo=" + matNo + "]";
	}

}
