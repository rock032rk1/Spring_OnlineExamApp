package com.onlineexam.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineexam.app.dao.QuestionDao;
import com.onlineexam.app.model.Question;
@Service
public class QuestionServiceImpl implements QuestionService{

	@Autowired
	private QuestionDao questionDao;
	
	public int saveQuestion(Question q) {
		// TODO Auto-generated method stub
		return questionDao.saveQuestion(q);
	}

	public List<Question> findAllQuestion() {
		// TODO Auto-generated method stub
		return questionDao.findAllQuestion();
	}

	public List<Question> findById(Integer id) {
		// TODO Auto-generated method stub
		return questionDao.findById(id);
	}

	@Override
	public List<Object[]> joinOperation(int id) {
		// TODO Auto-generated method stub
		return questionDao.joinOperation(id);
	}

	@Override
	public List<Object[]> pagination(int id, int pageid, int total) {
		// TODO Auto-generated method stub
		return questionDao.pagination(id, pageid, total);
	}

}
