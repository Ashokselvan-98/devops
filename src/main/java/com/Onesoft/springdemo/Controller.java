package com.Onesoft.springdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@GetMapping("tell")
	public String ak() {
		return "ennatha solla";
	}
}
