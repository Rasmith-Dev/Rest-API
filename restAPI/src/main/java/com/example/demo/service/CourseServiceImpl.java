package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Courses;

@Service
public class CourseServiceImpl implements CourseService {

	List<Courses> list;
	
	public CourseServiceImpl() {
		
		list = new ArrayList<>();
		list.add(new Courses(201, "java", "all core java concepts"));
		list.add(new Courses(202, "spring", "all spring concepts"));
		list.add(new Courses(203, "maven", "all maven concepts"));
	}
	
	@Override
	public List<Courses> getCourses() {
	
		return list;
	}

	@Override
	public Courses getCourse(int courseId) {
		Courses c = null;
		for(Courses course : list) {
			if(course.getId()==courseId) {
				c= course;
				break;
			}
			
		}
		return c;
	}

	@Override
	public Courses addCourse(Courses course) {
		list.add(course);
		return course;
	}

	
	@Override
	public Courses updateCourse(int courseId, Courses course) {
		Courses c = null;
		for(Courses courses : list) {
			if(courses.getId()==courseId) {
				c= course;

				int index = list.indexOf(courses);
		         
		        list.set(index, c);
				break;
			}
			
		}
		return c;
	}
	
	

	@Override
	public  void deleteCourse(int courseId) {
		Courses c = null;
		for(Courses course : list) {
			if(course.getId()==courseId) {
				list.remove(course);
				break;
			}			
		}
	}

	//youtuber method
	@Override
	public Courses updateCourses(Courses course) {
		
		list.forEach(e-> {
		if(e.getId() == course.getId()){
		e.setTitle(course.getTitle());
		e.setDescription(course.getDescription());
		}
		
		});
		
		return course;
	}
	}


