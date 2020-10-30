package com.onlineexam.app.dao;

import java.util.List;

import com.onlineexam.app.model.Answer;

public interface AnswerDao {

	public int saveAnswer(Answer a);
	public List<Answer> findAllAnswer();
	public List<Answer> findById(Integer id);
}
