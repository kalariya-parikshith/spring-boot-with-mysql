package com.example.demodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.example.demodb.repository")
@SpringBootApplication
public class DemoDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoDbApplication.class, args);
		System.out.println("new sop");
	}
}
