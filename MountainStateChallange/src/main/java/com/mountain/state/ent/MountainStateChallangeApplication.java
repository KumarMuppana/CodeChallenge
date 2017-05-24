package com.mountain.state.ent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class MountainStateChallangeApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(MountainStateChallangeApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder applcation){
		return applcation.sources(MountainStateChallangeApplication.class);
	}
}
