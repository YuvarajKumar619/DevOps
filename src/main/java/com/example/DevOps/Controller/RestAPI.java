package com.example.DevOps.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Common")
public class RestAPI {

	@GetMapping("WelcomePage")
	public String welcomePage() {
		return " Welcom To This Page ";
	}

	@GetMapping("PathVariable/{value}")
	public String usingPathVariable(@PathVariable String value) {
		return " This is the value --> "+value;
	}

}
