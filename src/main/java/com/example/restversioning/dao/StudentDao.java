package com.example.restversioning.dao;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;

import com.example.restversioning.dto.StudentV2;
import org.springframework.stereotype.Repository;

import com.example.restversioning.dto.Student;

@Repository
public class StudentDao {

	private List<Student> list;

	private List<StudentV2> list1;

	@PostConstruct
	public void init() {
		list = Arrays.asList(new Student(1111, "hemant", "sahu", "bangalore"),
				new Student(11221, "sarita", "shaw", "bangalore"), new Student(1141, "shiva", "sahu", "cg"),
				new Student(1711, "ruchi", "sahu", "korba"));

		list1 = Arrays.asList(new StudentV2(1111, "hemant", "bangalore"),
				new StudentV2(11221, "sarita", "bangalore"), new StudentV2(1141, "shiva", "cg"),
				new StudentV2(1711, "ruchi", "korba"));

	}

	public List<Student> getList() {

		return list;
	}
	public List<StudentV2> getList1() {

		return list1;
	}

}
