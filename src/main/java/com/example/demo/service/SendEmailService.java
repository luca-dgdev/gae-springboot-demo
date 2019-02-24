package com.example.demo.service;

import java.io.UnsupportedEncodingException;
import java.util.Properties;
import java.util.logging.Logger;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SendEmailService {
	
	@Value("${email.from}")
	private String emailFrom;
	
	@Value("${email.to}")
	private String emailTo;

	private static final Logger log = Logger.getLogger(SendEmailService.class.getName());

	public void sendEmail(String message) {
		Properties props = new Properties();
		Session session = Session.getDefaultInstance(props, null);
		
		log.info("emailFrom: " + emailFrom);
		log.info("emailTo: " + emailTo);
		
		try {
			Message msg = new MimeMessage(session);
			msg.setFrom(new InternetAddress(emailFrom, ""));
			msg.addRecipient(Message.RecipientType.TO, new InternetAddress(emailTo, ""));
			msg.setSubject("This is a test");
			msg.setText(message);
			Transport.send(msg);
		} catch (AddressException e) {
			log.severe("AddressException: " + e.getMessage());
		} catch (MessagingException e) {
			log.severe("MessagingException: " + e.getMessage());
		} catch (UnsupportedEncodingException e) {
			log.severe("UnsupportedEncodingException: " + e.getMessage());
		}
	}

}
