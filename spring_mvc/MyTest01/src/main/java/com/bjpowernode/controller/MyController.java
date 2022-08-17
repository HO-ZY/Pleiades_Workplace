package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	@RequestMapping(value="/some.do")
	public ModelAndView doSome() {
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("msg","Thanks you for using springmvc to  develop");
		mv.addObject("fun","executing doSome method!");
		
		mv.setViewName("/show.jsp");
		
		return mv;
		
	}

}
