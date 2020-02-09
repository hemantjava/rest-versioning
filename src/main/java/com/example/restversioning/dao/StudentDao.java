package com.example.restversioning.dao;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import com.example.restversioning.dto.Student;

@Repository
public class StudentDao {

	private List<Student> list;

	@PostConstruct
	public void init() {
		list = Arrays.asList(new Student(1111, "hemant", "sahu", "bangalore"),
				new Student(11221, "sarita", "shaw", "bangalore"), new Student(1141, "shiva", "sahu", "cg"),
				new Student(1711, "ruchi", "sahu", "korba"));

	}

	public List<Student> getList() {

		return list;
	}

}
