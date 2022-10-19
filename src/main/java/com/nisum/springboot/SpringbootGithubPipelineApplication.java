package com.nisum.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootGithubPipelineApplication {
	
	@GetMapping("/welcome-github-docker-pipeline")
	public String getMessage() {
		return "Springboot github docker pipeline";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootGithubPipelineApplication.class, args);
	}

}
