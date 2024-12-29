package com.example.spring_azure_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@RestController
public class spring_azure_demo {



	public static void main(String[] args) {
		SpringApplication.run(spring_azure_demo.class, args);
	}

	@GetMapping("/api/demo")
	public List<String> getDemoData() {
		return Arrays.asList("Hey your application deployed successfully..!");
	}
}
