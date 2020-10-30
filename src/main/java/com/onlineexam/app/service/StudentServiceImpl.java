package com.onlineexam.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineexam.app.dao.StudentDao;
import com.onlineexam.app.model.Student;
@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentDao studentDao;
	
	public int save(Student st) {
		// TODO Auto-generated method stub
		return studentDao.save(st);
	}

	public List<Student> findAllStudent() {
		// TODO Auto-generated method stub
		return studentDao.findAllStudent();
	}

	public List<Student> findById(Integer id) {
		// TODO Auto-generated method stub
		return studentDao.findById(id);
	}

	public Student deleteStudent(Integer id) {
		// TODO Auto-generated method stub
		return studentDao.deleteStudent(id);
	}

	public int updateStudent(Student st) {
		// TODO Auto-generated method stub
		return studentDao.updateStudent(st);
	}

	public List<Student> findByEmail(String email) {
		// TODO Auto-generated method stub
		return studentDao.findByEmail(email);
	}

}
