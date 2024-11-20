package com.auth.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.auth.login.dto.StudentDto;
import com.auth.login.entities.Student;
import com.auth.login.service.StudentService;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping(value = "/auth")
public class AuthController {
	@Autowired
	private StudentService studentService;

	@PostMapping
	public Student signUp(@RequestBody StudentDto studentDto) {
		return studentService.saveStudent(studentDto);
	}

	@GetMapping("/{userName}/{password}")
	public Student signIn(@PathVariable String userName, @PathVariable String password) {
		return studentService.findByUserName(userName);
	}
	
	@PutMapping("path/{id}")
	public String updateStudent(@PathVariable String id, @RequestBody String entity) {
		//TODO: process PUT request
		
		return entity;
	}

}
