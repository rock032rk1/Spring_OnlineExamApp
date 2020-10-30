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
@Table(name = "question_db")
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String questionname;
	
	@ManyToOne
	@JoinColumn(name = "cid",insertable = false,updatable = false)
	private Course course;
	private Integer cid;
	@OneToMany(mappedBy = "question")
	private List<Answer> answer;
	
	public Question() {
		// TODO Auto-generated constructor stub
	}

	public Question(String questionname, Course course, Integer cid) {
		super();
		this.questionname = questionname;
		this.course = course;
		this.cid = cid;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getQuestionname() {
		return questionname;
	}

	public void setQuestionname(String questionname) {
		this.questionname = questionname;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}
	
	
	
	
}
