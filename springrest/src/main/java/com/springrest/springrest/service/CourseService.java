package com.springrest.springrest.service;

import java.util.List;


import com.springrest.springrest.entities.Courses;

public interface CourseService {
	public List<Courses> getCourses();
	public Courses findCoursById(long id);
	public Courses addCouses(Courses courses);
}
