package com.mvc.upgrade;

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

import com.mvc.upgrade.model.biz.BoardBiz;
import com.mvc.upgrade.model.vo.BoardVo;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Autowired
	private BoardBiz biz;

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/home.do", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		return "home";
	}

	@RequestMapping("/list.do")
	public String list(Model model) {

		logger.info("SELECT LIST");
		model.addAttribute("list", biz.selectList());

		return "list";
	}

	@RequestMapping("/detail.do")
	public String detail(Model model, int myno) {

		logger.info("SELECT ONE");
		model.addAttribute("vo", biz.selectOne(myno));

		return "detail";
	}

	@RequestMapping("/insertform.do")
	public String insertForm() {

		logger.info("INSERT FROM");

		return "insertform";
	}

	@RequestMapping("/insertRes.do")
	public String insertRes(BoardVo vo) {

		logger.info("INSERT RES");
		int res = biz.insert(vo);

		if (res > 0) {
			return "redirect:list.do"; // redirect로 페이지 전환 해주겠다.
		} else {
			return "redirect:insertform.do";
		}

	}

	@RequestMapping("/updateform.do")
	public String updateform(Model model, int myno) {

		logger.info("UPDATE FORM");
		model.addAttribute("vo", biz.selectOne(myno));

		return "update";
	}

	@RequestMapping("/updateRes.do")
	public String updateRes(BoardVo vo) {

		logger.info("UPDATE RES");
		
		int res = biz.update(vo);
		
		if(res > 0) {
			return "redirect:list.do";
		}else {
			return "redirect:updateform.do?myno=" + vo.getMyno();
		}
		
	}
	
	@RequestMapping("/delete.do")
	public String delete(int myno, BoardVo vo) {
		
		logger.info("DELETE");
		
		int res = biz.delete(myno);
		
		if(res > 0) {
			return "redirect:list.do";
		}else {
			return "redirect:detail.do" + vo.getMyno();
		}
		
	}

}
