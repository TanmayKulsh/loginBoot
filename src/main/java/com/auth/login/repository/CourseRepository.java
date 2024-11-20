package com.auth.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.auth.login.entities.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

}
