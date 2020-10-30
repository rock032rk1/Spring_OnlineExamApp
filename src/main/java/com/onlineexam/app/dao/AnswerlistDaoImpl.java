package com.onlineexam.app.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.onlineexam.app.model.Answerlist;
@Repository
public class AnswerlistDaoImpl implements AnswerlistDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public int save(Answerlist al) {
		// TODO Auto-generated method stub
		Session ses=sessionFactory.getCurrentSession();
		ses.save(al);
		
		return al.getId();
	}

}
