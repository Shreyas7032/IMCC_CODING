package com.shri;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class FirstApp11Application {

	public static void main(String[] args) {
		SpringApplication.run(FirstApp11Application.class, args);
	}
	@GetMapping("/")
	public String home()
	{
		return "Hello Shreyas";
	}

}
