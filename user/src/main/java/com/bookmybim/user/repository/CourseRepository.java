package com.bookmybim.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookmybim.user.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {

}
