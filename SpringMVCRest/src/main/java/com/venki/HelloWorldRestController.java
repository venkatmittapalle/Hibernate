package com.venki;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRestController {
	
	@RequestMapping("/")
	public String welcome() {
		return "Welcome to the world of default spring REST";
	}
	
	
	@RequestMapping("/hello/{player}")
	public Message message(@PathVariable String player) {
		
		Message msg = new Message(player , "Hello " + player);
		return msg;
	}

}
