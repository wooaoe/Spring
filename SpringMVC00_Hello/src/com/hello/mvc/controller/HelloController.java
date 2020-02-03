package com.hello.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hello.mvc.model.HelloBiz;

@Controller //component scan에 의해  실행되는 controller annotation
public class HelloController {

	@Autowired //해당하는 타입에 맞는 bean이 있다면 자동으로 의존성 주입 
	public HelloBiz biz; //getHello가 실행되면 HelloBiz에서 요청을 받음 
	
	@RequestMapping("/hello.ho") //요청을 받는 annotation
	public String getHello(Model model) {
		
		//Model interface ? 
		
		model.addAttribute("message", biz.getHello()); //spring이라는 문자열이 message라는 이름으로 선언됨 
		
		return "/WEB-INF/views/hello.jsp"; //view의 경로를 적어주면 됨. 
	}
	
	@RequestMapping("/bye.ho")
	public ModelAndView getBye(@RequestParam("name")String name) {
		
		//model과 view를 묶어서 보낼 수 있음 
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/views/bye.jsp"); //응답하려는 view name을 set해줌 
		mav.addObject("message", "Bye, " + name); //어떤 object를 같이 담아서 보낼건지 설정 
		
		return mav;
	}
	
	
	
	
}
