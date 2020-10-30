package com.onlineexam.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineexam.app.dao.AnswerlistDao;
import com.onlineexam.app.model.Answerlist;
@Service
public class AnswerlistServiceImpl implements AnswerlistService{

	@Autowired
	private AnswerlistDao answerlistDao;
	
	public int save(Answerlist al) {
		// TODO Auto-generated method stub
		return answerlistDao.save(al);
	}

}
