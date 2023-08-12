package com.example.ems_gradle;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.example.ems_gradle.infra.mbgMapper.ems")
public class EmsGradleApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmsGradleApplication.class, args);
	}

}
