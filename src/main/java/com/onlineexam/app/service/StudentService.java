package com.onlineexam.app.service;

import java.util.List;

import com.onlineexam.app.model.Student;

public interface StudentService {

	public int save(Student st);
	public List<Student> findAllStudent();
	public List<Student> findById(Integer id);
	public Student deleteStudent(Integer id);
	public int updateStudent(Student st);
	public List<Student> findByEmail(String email);
}
