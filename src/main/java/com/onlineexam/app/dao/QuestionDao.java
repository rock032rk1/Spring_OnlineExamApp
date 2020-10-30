package com.onlineexam.app.dao;

import java.util.List;

import com.onlineexam.app.model.Question;

public interface QuestionDao {

	public int saveQuestion(Question q);
	public List<Question> findAllQuestion();
	public List<Question> findById(Integer id);
	public List<Object[]> joinOperation(int id);
	public  List<Object[]> pagination(int id,int pageid,int total);
}
