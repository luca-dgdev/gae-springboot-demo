package com.example.demo;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
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
}