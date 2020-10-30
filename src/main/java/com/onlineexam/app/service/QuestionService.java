package com.onlineexam.app.service;

import java.util.List;

import com.onlineexam.app.model.Question;

public interface QuestionService {

	public int saveQuestion(Question q);
	public List<Question> findAllQuestion();
	public List<Question> findById(Integer id);
	public List<Object[]> joinOperation(int id);
	public  List<Object[]> pagination(int id,int pageid,int total);
}
