package com.auth.login.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auth.login.dto.StudentDto;
import com.auth.login.entities.Student;
import com.auth.login.repository.StudentRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepository studentRepository;
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public Student saveStudent(StudentDto studentDto) {
		return studentRepository.save(modelMapper.map(studentDto, Student.class));
	}

	@Override
	public Student findByUserName(String userName) {
		// TODO Auto-generated method stub
		return studentRepository.findByUserName(userName).orElseThrow();
	}
}
