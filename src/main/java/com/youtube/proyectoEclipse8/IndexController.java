package com.youtube.proyectoEclipse8;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class IndexController {
 
	
	@RequestMapping("/") // Cuando se escriba slash redirecciona al index
	public String getIndexPage() {
		return "index";
	}
}
