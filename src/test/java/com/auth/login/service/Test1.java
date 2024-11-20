package com.auth.login.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.auth.login.entities.Student;
import com.auth.login.repository.StudentRepository;

public class Test1 {
	@Autowired
	private StudentRepository studentRepository;
	
	@Test
	void testAddCategory() {
		System.out.println("testing add student method");
				Student student = new Student();
				student.setFirstName("test1");
				studentRepository.save(student);
	}
}
