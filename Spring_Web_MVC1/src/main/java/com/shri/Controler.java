package com.shri;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;



@Controller	
public class Controler {

//	@GetMapping("/welcome")
//	public ModelAndView Home()
//	{
//		ModelAndView mm=new ModelAndView();
//		mm.setViewName("index"); //jsp page name
//		mm.addObject("Front","Welcome to Spring Web Mvc");
//		mm.addObject("msg","Hello Shreyas!How Are You!!!");
//		return mm;
//		
//	}
	@GetMapping("/welcome")
	public String home(Model model)
	{
		ArrayList<Integer> a=new ArrayList<>();
		a.add(12);
		a.add(13);
		a.add(56);
		model.addAttribute("msg",a);
		return "index";
		
	}

}
