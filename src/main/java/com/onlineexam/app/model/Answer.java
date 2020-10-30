package com.onlineexam.app.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "answer_db")
public class Answer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String answer1;
	private String answer2;
	//private String answer3;
	//private String answer4;
	
	@ManyToOne
	@JoinColumn(name = "qid",insertable = false,updatable = false)
	private Question question;
	
	private Integer qid;
	//@OneToMany(mappedBy = "answer")
	//private List<Answerlist> answerlist;
	
	private String correctopt;
	
	public Answer() {
		// TODO Auto-generated constructor stub
	}

	public Answer(String answer1, String answer2, Question question, Integer qid, String correctopt) {
		super();
		this.answer1 = answer1;
		this.answer2 = answer2;
		this.question = question;
		this.qid = qid;
		this.correctopt = correctopt;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAnswer1() {
		return answer1;
	}

	public void setAnswer1(String answer1) {
		this.answer1 = answer1;
	}

	public String getAnswer2() {
		return answer2;
	}

	public void setAnswer2(String answer2) {
		this.answer2 = answer2;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public Integer getQid() {
		return qid;
	}

	public void setQid(Integer qid) {
		this.qid = qid;
	}

	public String getCorrectopt() {
		return correctopt;
	}

	public void setCorrectopt(String correctopt) {
		this.correctopt = correctopt;
	}

	   	
}
