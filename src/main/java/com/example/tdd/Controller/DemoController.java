package com.example.tdd.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tdd.Service.DemoService;

@RestController
public class DemoController {

	@Autowired
	private DemoService svc;
	
	@GetMapping("/")
	public String index() {
		return "AA";
	}
	
	@GetMapping("/ex01")
	public String getExample01() {
		return svc.example01();
	}
}
