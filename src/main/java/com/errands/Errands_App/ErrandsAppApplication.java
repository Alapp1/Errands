package com.errands.Errands_App;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ErrandsAppApplication {
	public static void main(String[] args) {
		SpringApplication.run(ErrandsAppApplication.class, args);
	}
}

@RestController
class HelloWorldController {
	@GetMapping("/")
	public String helloWorld() {
		return "Hello, World!";
	}
}