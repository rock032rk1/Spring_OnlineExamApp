package com.onlineexam.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "answerlist_db")
public class Answerlist {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String answerlist;
	
	@ManyToOne
	@JoinColumn(name = "aidlist",insertable = false,updatable = false)
	private Answer answer;
	
	private Integer aidlist;
	
	public Answerlist() {
		// TODO Auto-generated constructor stub
	}

	public Answerlist(String answerlist, Answer answer, Integer aidlist) {
		super();
		this.answerlist = answerlist;
		this.answer = answer;
		this.aidlist = aidlist;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAnswerlist() {
		return answerlist;
	}

	public void setAnswerlist(String answerlist) {
		this.answerlist = answerlist;
	}

	public Answer getAnswer() {
		return answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}

	public Integer getAidlist() {
		return aidlist;
	}

	public void setAidlist(Integer aidlist) {
		this.aidlist = aidlist;
	}
	
	
}
