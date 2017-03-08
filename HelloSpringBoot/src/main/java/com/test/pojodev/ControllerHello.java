package com.test.pojodev;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerHello {

	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello World!!!";
	}
}
