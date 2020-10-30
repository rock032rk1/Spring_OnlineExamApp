package com.onlineexam.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineexam.app.dao.AnswerDao;
import com.onlineexam.app.model.Answer;
@Service
public class AnswerServiceImpl implements AnswerService{

	@Autowired
	private AnswerDao answerDao;
	
	public int saveAnswer(Answer a) {
		// TODO Auto-generated method stub
		return answerDao.saveAnswer(a);
	}

	public List<Answer> findAllAnswer() {
		// TODO Auto-generated method stub
		return answerDao.findAllAnswer();
	}

	public List<Answer> findById(Integer id) {
		// TODO Auto-generated method stub
		return answerDao.findById(id);
	}

}
