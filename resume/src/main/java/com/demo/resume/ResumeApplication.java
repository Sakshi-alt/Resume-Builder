package com.demo.resume;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author Sakshi Srivastava
 * Date 3'JAN'2023
 */
@SpringBootApplication
@ComponentScan({ "com.demo.util", "com.demo.controller" })
public class ResumeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResumeApplication.class, args);
	}
}
