package com.example.demo.controller;

import java.util.logging.Logger;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DemoApplication;

@RestController
@RequestMapping("/api")
public class DemoController {
	
	private static final Logger log = Logger.getLogger(DemoController.class.getName());

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public ResponseEntity<String> hello() {
		log.info("HELLO");
		return new ResponseEntity<String>("Hello", HttpStatus.OK);
	}

}
