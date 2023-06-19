package com.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class StudentController
{
	@PostMapping(value = "/createstudent")	//http://localhost:9090/createstudent
	public Student addstudent(@RequestBody Student student)
	{	List<Student> studentlist = new ArrayList<>();
		studentlist.add(student);
		System.out.println(student);
		return student;
	}
	
	@PostMapping(value = "/createcourse")	//http://localhost:9090/createcourse
	public Course addcourse(@RequestBody Course course)
	{	List<Course> courselist = new ArrayList<>();
		courselist.add(course);
		System.out.println(course);
		return course;
	}
}