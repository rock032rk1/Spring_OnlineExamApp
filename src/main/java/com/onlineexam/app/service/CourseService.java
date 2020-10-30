package com.onlineexam.app.service;

import java.util.List;

import com.onlineexam.app.model.Course;

public interface CourseService {

	public int saveCourse(Course c);
	public List<Course> findAllCourse();
	public Course deleteCourse(Integer id);
}
