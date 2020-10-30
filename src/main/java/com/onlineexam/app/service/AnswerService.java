package com.onlineexam.app.service;

import java.util.List;

import com.onlineexam.app.model.Answer;

public interface AnswerService {

	public int saveAnswer(Answer a);
	public List<Answer> findAllAnswer();
	public List<Answer> findById(Integer id);
}
