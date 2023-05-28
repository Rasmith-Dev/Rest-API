package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Courses;
import com.example.demo.service.CourseService;

@RestController
public class restcontroller {
	
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/home")
	public String show()
	{
		return "rest home url";
	}
	
	@GetMapping("/Courses")
	public List<Courses> getCourses()
	{
		return this.courseService.getCourses();
	}

	@GetMapping("/Courses/{courseId}")
	public Courses getCourse(@PathVariable String courseId )
	{
		return this.courseService.getCourse(Integer.parseInt(courseId));
	}
	
	@PostMapping("/Courses")
	public Courses addCourse(@RequestBody Courses course)
	{
		return this.courseService.addCourse(course);
	}
	
//	@PutMapping("/Courses") // this is not working put and post both are working same
//	public Courses updateCourse(@RequestBody Courses course)
//	{
//		return this.courseService.updateCourse(course);
//	}
	
	@PutMapping("/Courses/{courseId}") // this is not working put and post both are working same
	public Courses updateCourse(@PathVariable String courseId,@RequestBody Courses course)
	{
		return this.courseService.updateCourse(Integer.parseInt(courseId), course);
	}
	
	@DeleteMapping("/Courses/{courseId}")
	public String deleteCourse(@PathVariable String courseId )
	{
		return this.courseService.deleteCourse(Integer.parseInt(courseId));
	}
	
}
