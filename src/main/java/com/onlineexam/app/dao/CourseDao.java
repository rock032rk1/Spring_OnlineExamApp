package com.onlineexam.app.dao;

import java.util.List;

import com.onlineexam.app.model.Course;

public interface CourseDao {

	public int saveCourse(Course c);
	public List<Course> findAllCourse();
	public Course deleteCourse(Integer id);
}
