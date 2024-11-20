package com.auth.login.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.auth.login.entities.Student;


@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

	Optional<Student> findByUserName(String userName);
}
