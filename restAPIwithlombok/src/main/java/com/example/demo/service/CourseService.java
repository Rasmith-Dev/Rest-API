package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.entities.Courses;

public interface CourseService {
	
	public List<Courses> getCourses();

	public Courses getCourse(int courseId);

	public Courses addCourse(Courses course);

//	public Courses updateCourse(Courses course);
	public Courses updateCourse(int courseId, Courses course);

	public String deleteCourse(int courseId);

}
