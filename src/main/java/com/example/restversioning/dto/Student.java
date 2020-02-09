package com.example.restversioning.dto;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonFilter("BeanFilter")
@JsonIgnoreProperties(ignoreUnknown=true)
public class Student {
	
	private Integer id;
	private String firstName;
	private String lastName;
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
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public Student(Integer id, String firstName, String lastName, String addr) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.addr = addr;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(Integer id, String firstName, String addr) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", addr=" + addr + "]";
	}
	
	

}
