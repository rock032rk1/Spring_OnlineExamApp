package com.onlineexam.app.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.onlineexam.app.model.Question;

@Repository
public class QuestionDaoImpl implements QuestionDao{

	@Autowired
	private SessionFactory sessionFactory;
	JdbcTemplate template;  
	
	public void setTemplate(JdbcTemplate template) {    
	    this.template = template;    
	}
	
	@Transactional
	public int saveQuestion(Question q) {
		// TODO Auto-generated method stub
		Session ses=sessionFactory.getCurrentSession();
		ses.save(q);
		
		return q.getId();
	}

	@Transactional
	public List<Question> findAllQuestion() {
		// TODO Auto-generated method stub
		Session ses=sessionFactory.getCurrentSession();
		Query<Question> query=ses.createQuery("from Question",Question.class);
		List<Question> qlist=query.getResultList();
		
		return qlist;
	}

	@Transactional
	public List<Question> findById(Integer id) {
		// TODO Auto-generated method stub
		Session ses=sessionFactory.getCurrentSession();
		Query<Question> query=ses.createQuery("from Question where id=:id",Question.class);
		query.setParameter("id", id);
		List<Question> qlist=query.getResultList();
		
		return qlist;
	}

	@Transactional
	public List<Object[]> joinOperation(int id) {
		// TODO Auto-generated method stub
		Session ses=sessionFactory.getCurrentSession();
		String sql="select q.questionname,a.answer1,a.answer2 from Question q INNER JOIN Answer a on q.id=a.id where q.cid=:id";
		@SuppressWarnings("unchecked")
		Query<Object[]> query=ses.createQuery(sql);
		query.setParameter("id", id);
		List<Object[]> slist=null;
		slist=query.getResultList();
		if(slist!=null) {
			return slist;
		}else {
			return null;
		}
		//return null;
	}

	@Transactional
	public List<Object[]> pagination(int id, int pageid, int total) {
		// TODO Auto-generated method stub
		
		Session ses=sessionFactory.getCurrentSession();
		String sql="select q.questionname,a.answer1,a.answer2 from Question q INNER JOIN Answer a on q.id=a.id where q.cid=:id";
		//String sql1="from Question limit 1";
		//@SuppressWarnings("unchecked")
		//Query<Question> qd=ses.createQuery(sql1);
		
		@SuppressWarnings("unchecked")
		Query<Object[]> query=ses.createQuery(sql);
		query.setParameter("id", id);
		query.setFirstResult(pageid-1);
		query.setMaxResults(total);
		//query.setParameter("pageid", pageid);
		//query.setParameter("total", total);
		List<Object[]> slist=null;
		slist=query.getResultList();
		if(slist!=null) {
			return slist;
		}else {
			return null;
		}
		//return null; 
	}

}
