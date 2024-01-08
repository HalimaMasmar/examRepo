package com.alibou.school;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class CourslApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourslApplication.class, args);
	}

}
