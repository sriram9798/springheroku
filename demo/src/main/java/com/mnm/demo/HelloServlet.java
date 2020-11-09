package com.mnm.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/demo")
public class HelloServlet {
	@GetMapping("/index")
	public String getIndex() {
		return "index";
	}
}
