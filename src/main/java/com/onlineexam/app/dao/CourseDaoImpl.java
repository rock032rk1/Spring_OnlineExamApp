package com.onlineexam.app.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.onlineexam.app.model.Course;
@Repository
public class CourseDaoImpl implements CourseDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public int saveCourse(Course c) {
		// TODO Auto-generated method stub
		Session ses=sessionFactory.getCurrentSession();
		ses.save(c);
		
		return c.getId();
	}

	@Transactional
	public List<Course> findAllCourse() {
		// TODO Auto-generated method stub
		Session ses=sessionFactory.getCurrentSession();
		Query<Course> query=ses.createQuery("from Course",Course.class);
		List<Course> clist=query.getResultList();
		
		return clist;
	}

	@Transactional
	public Course deleteCourse(Integer id) {
		// TODO Auto-generated method stub
		Session ses=sessionFactory.getCurrentSession();
		Course cr=ses.get(Course.class, id);
		ses.delete(cr);
		
		return cr;
	}

}
