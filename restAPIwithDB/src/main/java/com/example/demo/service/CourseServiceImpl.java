package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.DaoLayer;
import com.example.demo.entities.Courses;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private DaoLayer daoLayer;

	public CourseServiceImpl() {

	}

	@Override
	public List<Courses> getCourses() {

		return daoLayer.findAll();
	}

	@SuppressWarnings("deprecation")
	@Override
	public Courses getCourse(int courseId) {

		return daoLayer.getOne(courseId);
	}

	@Override
	public Courses addCourse(Courses course) {

		daoLayer.save(course);
		return course;
	}

	@Override
	public Courses updateCourse(int courseId, Courses course) {
		daoLayer.save(course);
		return course;
	}

	@SuppressWarnings("deprecation")
	@Override
	public void deleteCourse(int courseId) {
		Courses entity = daoLayer.getOne(courseId);
		daoLayer.delete(entity);
	}

}
