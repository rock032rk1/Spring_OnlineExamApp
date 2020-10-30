package com.onlineexam.app.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.onlineexam.app.model.Student;
@Repository
public class StudentDaoImpl implements StudentDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public int save(Student st) {
		// TODO Auto-generated method stub
		Session ses=sessionFactory.getCurrentSession();
		ses.save(st);
		
		return st.getId();
	}

	@Transactional
	public List<Student> findAllStudent() {
		// TODO Auto-generated method stub
		Session ses=sessionFactory.getCurrentSession();
		Query<Student> query=ses.createQuery("from Student",Student.class);
		List<Student> slist=query.getResultList();
		
		return slist;
	}

	@Transactional
	public List<Student> findById(Integer id) {
		// TODO Auto-generated method stub
		Session ses=sessionFactory.getCurrentSession();
		Query<Student> query=ses.createQuery("from Student where id=:id",Student.class);
		query.setParameter("id", id);
		List<Student> slist=query.getResultList();
		
		return slist;
	}

	@Transactional
	public Student deleteStudent(Integer id) {
		// TODO Auto-generated method stub
		Session ses=sessionFactory.getCurrentSession();
		Student st=ses.get(Student.class, id);
		ses.delete(st);
		
		return st;
	}

	@Transactional
	public int updateStudent(Student st) {
		// TODO Auto-generated method stub
		Session ses=sessionFactory.getCurrentSession();
		ses.update(st);
		
		return st.getId();
	}

	@Transactional
	public List<Student> findByEmail(String email) {
		// TODO Auto-generated method stub
		Session ses=sessionFactory.getCurrentSession();
		Query<Student> query=ses.createQuery("from Student where email=:email",Student.class);
		query.setParameter("email", email);
		List<Student> slist=query.getResultList();
		
		return slist;
	}

}
