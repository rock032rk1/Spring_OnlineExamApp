package com.onlineexam.app.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.onlineexam.app.model.Answer;
import com.onlineexam.app.model.Course;
import com.onlineexam.app.model.Question;
import com.onlineexam.app.service.AnswerService;
import com.onlineexam.app.service.CourseService;
import com.onlineexam.app.service.QuestionService;

@Controller
public class CourseController {

	@Autowired
	private CourseService courseService;
	@Autowired
	private QuestionService questionService;
	@Autowired
	private AnswerService answerService;
	
	@PostMapping("/saveCourse")
	public String saveCourse(Model model,Course cr) {
		
		courseService.saveCourse(cr);
		
		return "redirect:/courselist";
	}
	
	@GetMapping("/courselist")
	public String courseList(Model model) {
		
		List<Course> clist=courseService.findAllCourse();
		model.addAttribute("clist", clist);
		
		return "index";
	}
	
	@PostMapping("/saveQuestion")
	public String saveQuestion(Model model,Question qt,HttpServletRequest req) {
		
		String cname=req.getParameter("coursename");
		String qname=req.getParameter("questionname");
		List<Course> clist=courseService.findAllCourse();
		Course c=clist.stream()
				.filter(course->cname.equals(course.getCoursename()))
				.findAny()
				.orElse(null);
		int id=c.getId();
		qt.setCid(id);
		
		
		String op1=req.getParameter("answerlist");
		String op2=req.getParameter("answerlist1");
		String crop=req.getParameter("correctopt");
		
		Answer a1=new Answer();
		a1.setAnswer1(op1);
		a1.setAnswer2(op2);
		a1.setCorrectopt(crop);
		
		questionService.saveQuestion(qt);
		List<Question> qlist=questionService.findAllQuestion();
		Question q=qlist.stream()
				.filter(question->qname.equals(question.getQuestionname()))
				.findAny()
				.orElse(null);
		int aid=q.getId();
		a1.setQid(aid);
		
		answerService.saveAnswer(a1);
		
		return "redirect:/courselist";
	}
	@GetMapping("/quest")
	public String getQuestPage(Model model) {
		
		List<Course> clist=courseService.findAllCourse();
		model.addAttribute("clist", clist);
		
		return "question";
	}
	
	@GetMapping("/selectcourse")
	public String getQuestPage1(HttpServletRequest req,Model model) {
		
		String cname=req.getParameter("coursename");
		List<Course> clist=courseService.findAllCourse();
		Course c=clist.stream()
				.filter(course->cname.equals(course.getCoursename()))
				.findAny()
				.orElse(null);
		int id=c.getId();
		
		HttpSession ses=req.getSession();
		ses.setAttribute("id", id);
		
		
		int total=1; 
		int pageid=1;
        if(pageid==1){}    
        else{    
            pageid=(pageid-1)*total+1;    
        }    
		
		model.addAttribute("clist", clist);
		
		List<Object[]> plist=questionService.pagination(id, pageid, total);
		model.addAttribute("obj", plist);
		
		return "question";
	}
	
//	@GetMapping("/question1")
//	public String showQuestion(Model model,HttpServletRequest req) {
//		
//		HttpSession ses=req.getSession();
//		int id=(Integer)ses.getAttribute("id");
//		
//		List<Course> clist=courseService.findAllCourse();
//		model.addAttribute("clist", clist);
//		
//		List<Object[]> plist=questionService.joinOperation(id);
//		model.addAttribute("obj", plist);
//		
//		return "question";
//	}
	
	@RequestMapping(value="/question1/{pageid}")    
    public String edit(@PathVariable int pageid,Model model,HttpServletRequest req){    
        int total=1;    
        if(pageid==1){}    
        else{    
            pageid=(pageid-1)*total+1;    
        }    
        HttpSession ses=req.getSession();
		int id=(Integer)ses.getAttribute("id");
	//	int sid=1;
		
		
		List<Course> clist=courseService.findAllCourse();
		model.addAttribute("clist", clist);
		
		List<Object[]> plist=questionService.pagination(id, pageid, total);
		model.addAttribute("obj", plist);

        return "question";    
    }    
}
