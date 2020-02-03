package com.hello.mvc01;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hello.mvc01.model.HelloBiz;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private HelloBiz biz;
	
	@RequestMapping("/hello.do")
	public String getHello(Model model) {
		
		model.addAttribute("msg", biz.getHello());
		
		return "hello"; //viewResolver가 경로 + jsp를 붙여줌 
	}
	
	@RequestMapping("/bye.do")
	public String getBye(Model model, @RequestParam("name")String name) {
		//parameter 이름만 맞춰주면 값을 잘 받아올 수 있음 
		
		model.addAttribute("msg", "Bye, " + name);
		
		return "tmp/bye";
	}
	
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/home.do", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
}
