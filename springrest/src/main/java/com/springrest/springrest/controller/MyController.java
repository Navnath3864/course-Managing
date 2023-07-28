package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Courses;
import com.springrest.springrest.service.CourseService;


@RestController //REST- Representational state transfer (full form)
public class MyController {
	@Autowired
	private CourseService courseService;
	
	@GetMapping(value = "/home")
	public String home() {
		return "this is home page";
	}
	// get the course
	@GetMapping(value = "/courses")
	public List<Courses> getCourses(){
		
		return this.courseService.getCourses();
		
	}
	@GetMapping(value = "/courses/{id}")
	public Courses getCourseById(@PathVariable long id ){
		return this.courseService.findCoursById(id);
	}
	@PostMapping(value = "/courses")
	public Courses addCourses(@RequestBody Courses courses) {
		return this.courseService.addCouses(courses);
			
	}

}
