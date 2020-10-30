package com.onlineexam.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineexam.app.dao.CourseDao;
import com.onlineexam.app.model.Course;
@Service
public class CourseServiceImpl implements CourseService{

	@Autowired
	private CourseDao courseDao;
	
	public int saveCourse(Course c) {
		// TODO Auto-generated method stub
		return courseDao.saveCourse(c);
	}

	public List<Course> findAllCourse() {
		// TODO Auto-generated method stub
		return courseDao.findAllCourse();
	}

	public Course deleteCourse(Integer id) {
		// TODO Auto-generated method stub
		return courseDao.deleteCourse(id);
	}

}
