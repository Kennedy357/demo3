package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kcauthorization")
public class DemoController {

	@GetMapping("/ping")
	public ResponseEntity<Object> ping() {
		return ResponseEntity.ok("Service is up and running!");
	}
}
