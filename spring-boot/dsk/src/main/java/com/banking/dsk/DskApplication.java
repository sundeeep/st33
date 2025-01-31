package com.banking.dsk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/api/v1")
public class DskApplication {

	public static void main(String[] args) {
		SpringApplication.run(DskApplication.class, args);
	}
	
	@GetMapping("/")
	public String getMessage() {
		return "hello, world!";
	}
	
	@GetMapping("/param")
	public String getMessageParams(@RequestParam String sandee, @RequestParam String keer ) {
		
		return "Hello, "+sandee+", "+keer;
	}

}
