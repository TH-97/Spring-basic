package com.simple.basic;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller //컨트롤러에는 @Controller사용합니다
public class HomeController {

	@RequestMapping("/")
	public String home(Model model) {

		model.addAttribute("severTime" , new Date());
		return "/views/home";
	}


}
