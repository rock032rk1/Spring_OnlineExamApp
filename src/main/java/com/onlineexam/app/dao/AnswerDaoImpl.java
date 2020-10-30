package com.onlineexam.app.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.onlineexam.app.model.Answer;
import com.onlineexam.app.model.Course;
@Repository
public class AnswerDaoImpl implements AnswerDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public int saveAnswer(Answer a) {
		// TODO Auto-generated method stub
		Session ses=sessionFactory.getCurrentSession();
		ses.save(a);
		
		return a.getId();
	}

	@Transactional
	public List<Answer> findAllAnswer() {
		// TODO Auto-generated method stub
		Session ses=sessionFactory.getCurrentSession();
		Query<Answer> query=ses.createQuery("from Answer",Answer.class);
		List<Answer> alist=query.getResultList();
		
		return alist;
	}

	@Transactional
	public List<Answer> findById(Integer id) {
		// TODO Auto-generated method stub
		Session ses=sessionFactory.getCurrentSession();
		Query<Answer> query=ses.createQuery("from Answer where id=:id",Answer.class);
		query.setParameter("id", id);
		List<Answer> alist=query.getResultList();
		
		return alist;
	}

}
