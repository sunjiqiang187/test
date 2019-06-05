package com.example.demo;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class ReadingService {

	@HystrixCommand(fallbackMethod = "reList")
	public String readList() {
		RestTemplate t = new RestTemplate();

		return t.getForObject("http://localhost:3333/getBooks", String.class);
	}

	private String reList() {
		return "not book 	!";
	}

}
