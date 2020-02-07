package com.mvc.upgrade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mvc.upgrade.model.biz.MemberBiz;
import com.mvc.upgrade.model.vo.MemberVo;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Controller
public class MemberController {
	private Logger logger = LoggerFactory
					.getLogger(MemberController.class);
	@Autowired
	private MemberBiz biz;
	
	@RequestMapping("/loginform.do")
	public String loginForm() {
		logger.info("LOGIN FORM");
		return "mvclogin";
	}
	
	@RequestMapping(value="/ajaxlogin.do", method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Boolean> ajaxLogin(HttpSession session, 
			@RequestBody MemberVo vo){
		//ResponseBody: java객체를 response객체에 바인딩
		//RequestBoey: request객체로 넘어오는 데이터를 java 객체로
		MemberVo res = biz.login(vo);
		boolean check = false;
		
		if(res != null) {
			session.setAttribute("login", res);
			check=true;
		}
		
		Map<String, Boolean> map = 
				new HashMap<String, Boolean>();
		map.put("check", check);
		
		return map;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}









