package com.example.DevOps.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("Common")
@Slf4j
public class RestAPI {

	@GetMapping("WelcomePage")
	public String welcomePage() {

		log.info("RestAPI::welcomePage Using GetMethod ");
		return " Welcom To This Page ";

	}

	@GetMapping("PathVariable/{value}")
	public String usingPathVariable(@PathVariable String value) {

		log.info("RestAPI::usingPathVariable Using GetMethod with PathVariable {} ", value);
		return " This is the value --> " + value;

	}

}
