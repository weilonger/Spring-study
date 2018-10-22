package com.example.demo.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddController {
	@ResponseBody
	@RequestMapping("/add")
	public String add() {
		return "add success！";
	}
}
