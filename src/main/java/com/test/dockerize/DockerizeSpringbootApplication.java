package com.test.dockerize;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerizeSpringbootApplication {

	@GetMapping("/welcome")
	public String welcome(){
		return "Springboot Docker Demo";
	}

	public static void main(String[] args) {
		SpringApplication.run(DockerizeSpringbootApplication.class, args);
	}

}
