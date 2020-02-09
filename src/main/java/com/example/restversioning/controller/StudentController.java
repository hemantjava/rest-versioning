package com.example.restversioning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.restversioning.dao.StudentDao;
import com.example.restversioning.dto.Student;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentDao dao;

//-------------------------------URI------------------------------------------------------------
	//http://localhost:8081/student/list/v1
	@GetMapping("/list/v1")
	public ResponseEntity<?> getStudentListUriV1() {
		List<Student> studentList = dao.getList();
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("id", "firstName", "lastName",
				"addr");
		FilterProvider provider = new SimpleFilterProvider().addFilter("BeanFilter", filter);
		MappingJacksonValue jacksonValue = new MappingJacksonValue(studentList);
		jacksonValue.setFilters(provider);
		return new ResponseEntity<>(jacksonValue, HttpStatus.OK);
	}

	//http://localhost:8081/student/list/v2
	@GetMapping("/list/v2")
	public ResponseEntity<?> getStudentListURiV2() {

		List<Student> studentList = dao.getList();
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("id", "firstName", "addr");
		FilterProvider provider = new SimpleFilterProvider().addFilter("BeanFilter", filter);
		MappingJacksonValue jacksonValue = new MappingJacksonValue(studentList);
		jacksonValue.setFilters(provider);
		return new ResponseEntity<>(jacksonValue, HttpStatus.OK);

	}
//-------------------------------------------Param-----------------------------------------------------------	
	//http://localhost:8081/student/list/param?version=1
	@GetMapping(value="/list/param",params="version=1")
	public ResponseEntity<?> getStudentListParamV1() {
		List<Student> studentList = dao.getList();
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("id", "firstName", "lastName",
				"addr");
		FilterProvider provider = new SimpleFilterProvider().addFilter("BeanFilter", filter);
		MappingJacksonValue jacksonValue = new MappingJacksonValue(studentList);
		jacksonValue.setFilters(provider);
		return new ResponseEntity<>(jacksonValue, HttpStatus.OK);
	}

	//http://localhost:8081/student/list/param?version=2
	@GetMapping(value ="/list/param",params="version=2" )
	public ResponseEntity<?> getStudentListParamV2() {

		List<Student> studentList = dao.getList();
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("id", "firstName", "addr");
		FilterProvider provider = new SimpleFilterProvider().addFilter("BeanFilter", filter);
		MappingJacksonValue jacksonValue = new MappingJacksonValue(studentList);
		jacksonValue.setFilters(provider);
		return new ResponseEntity<>(jacksonValue, HttpStatus.OK);

	}

	//---------------------------------------Header--------------------------------------------------------------	
	
		@GetMapping(value="/list/header",headers="x-api-version=1")
		public ResponseEntity<?> getStudentListHeaderV1() {
			List<Student> studentList = dao.getList();
			SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("id", "firstName", "lastName",
					"addr");
			FilterProvider provider = new SimpleFilterProvider().addFilter("BeanFilter", filter);
			MappingJacksonValue jacksonValue = new MappingJacksonValue(studentList);
			jacksonValue.setFilters(provider);
			return new ResponseEntity<>(jacksonValue, HttpStatus.OK);
		}

		@GetMapping(value ="/list/header",headers="x-api-version=2" )
		public ResponseEntity<?> getStudentListHeaderV2() {

			List<Student> studentList = dao.getList();
			SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("id", "firstName", "addr");
			FilterProvider provider = new SimpleFilterProvider().addFilter("BeanFilter", filter);
			MappingJacksonValue jacksonValue = new MappingJacksonValue(studentList);
			jacksonValue.setFilters(provider);
			//new ResponseEntity
			return new ResponseEntity<>(jacksonValue, HttpStatus.OK);

		}


}
