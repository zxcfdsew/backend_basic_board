package com.board.basic.board.domain.web.basic.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/basic")
public class BasicController {

	@GetMapping("/hello")
	public ResponseEntity<?> getHello(@RequestParam String name) {
		return ResponseEntity.ok("Hello " + name);
	}
}
