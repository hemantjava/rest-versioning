package com.example.restversioning.dto;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class StudentV2 {

	private Integer id;
	private String firstName;
	private String addr;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}

	public StudentV2() {
		super();
	}
	public StudentV2(Integer id, String firstName, String addr) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", addr=" + addr + "]";
	}
	
	

}
