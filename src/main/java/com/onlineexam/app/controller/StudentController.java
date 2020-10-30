package com.onlineexam.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.onlineexam.app.model.Course;
import com.onlineexam.app.service.CourseService;

@Controller
public class StudentController {

	@Autowired
	private CourseService courseService;
	
	@GetMapping("/")
	public String index(Model model) {
		
		List<Course> clist=courseService.findAllCourse();
		model.addAttribute("clist", clist);
		
		return "index";
	}
	
	@GetMapping("/index")
	public String homePage(Model model) {
		
		List<Course> clist=courseService.findAllCourse();
		model.addAttribute("clist", clist);
		
		return "index";
	}
}
