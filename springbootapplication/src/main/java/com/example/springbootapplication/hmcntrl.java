package com.example.springbootapplication;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class hmcntrl {
@RequestMapping("/login")
public String login() {
	return "login";
}

@RequestMapping("/Hello")
public String Hello() {
	return "Hello";
}
}
