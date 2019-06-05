package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@EnableHystrix
public class ReadingApplication {
	
	@Autowired
	private ReadingService readingService;
	

	public static void main(String[] args) {
		SpringApplication.run(ReadingApplication.class, args);
	}
	
	
	@RequestMapping("/read")
	public String read() {
		return readingService.readList();
	}

}
