package com.example.demo.controller;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.SendEmailService;

@RestController
@RequestMapping("/api")
public class DemoController {

	private static final Logger log = Logger.getLogger(DemoController.class.getName());
	
	@Autowired
	private SendEmailService sendEmailService;

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public ResponseEntity<String> hello() {
		log.severe("HELLO");
		return new ResponseEntity<String>("Hello", HttpStatus.OK);
	}
	
	@RequestMapping(value = "/send", method = RequestMethod.GET)
	public ResponseEntity<String> send() {
		sendEmailService.sendEmail("Test email rest");
		return new ResponseEntity<String>("Email sent", HttpStatus.OK);
	}

}
