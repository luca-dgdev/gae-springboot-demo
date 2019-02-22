package com.example.demo;

import java.util.Calendar;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
public class DemoApplication {

	@Bean
	ApplicationRunner appRunner()
	{
		return new AppRunner();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	private static class AppRunner implements ApplicationRunner
	{
		@Override
		public void run(ApplicationArguments args) throws Exception {
			System.out.println("INIT RUNNER");
			
		}
	}
	
	@Scheduled(initialDelay = 1000, fixedRate = 10000)
	public void run() {
	    System.out.println("Current time is :: " + Calendar.getInstance().getTime());
	}
}