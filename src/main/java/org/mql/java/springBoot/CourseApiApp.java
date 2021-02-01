package org.mql.java.springBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//this annotation tell spring that is the start point of our project spring boot
@SpringBootApplication
public class CourseApiApp {

	public static void main(String[] args) {
		//this line order spring to create a servlet container and host this app in that servlet
		SpringApplication.run(CourseApiApp.class, args);
	}

}
