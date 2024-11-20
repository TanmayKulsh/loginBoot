package com.auth.login.service;

import com.auth.login.dto.StudentDto;
import com.auth.login.entities.Student;

public interface StudentService {
	Student saveStudent(StudentDto studentDto);
	Student findByUserName(String userName);
}
