package com.hotmail.jacksonforfun.twgerenciadostarefas.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class HomeController {

	@GetMapping("/")
	public ModelAndView home() {
		ModelAndView nv = new ModelAndView();
		nv.setViewName("home/home");
		nv.addObject("mensagem","Mensagem do controller");
		return nv;
	}
}
