package com.vendasms.productapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/status")
public class StatusControllerTest {

	@GetMapping
	public String getStatus() {
		return "Status online!";
	}
}
