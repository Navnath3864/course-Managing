package com.springrest.springrest.service;

import java.util.List;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

import com.springrest.springrest.entities.Courses;
@Service
public class CourseServiceImpl  implements CourseService{
	
	List<Courses> list= new ArrayList<>();
	public CourseServiceImpl () {
		list.add(new Courses(1111,"java","this is java programming"));
		list.add(new Courses(2222,"DSA","this is Data Structure and Algorithms"));
		list.add(new Courses(3333,"c","this is c programming"));
		list.add(new Courses(4444,"python","this is python"));
		list.add(new Courses(5555,"SpringBoot","this is SpringBoot "));
			}
	@Override
	public List<Courses> getCourses() {
		// TODO Auto-generated method stub
		
		return list;
	}
	@Override
	public Courses findCoursById(long id) {
		// TODO Auto-generated method stub
		Courses c=null;
		for (Courses courses : list) {
			if(courses.getId()==id) {
				c=courses;
				break;
			}
		}
		
		return c;
	}
	@Override
	public Courses addCouses(Courses courses) {
		// TODO Auto-generated method stub
		list.add(courses);
		return courses;
	}
	

}
