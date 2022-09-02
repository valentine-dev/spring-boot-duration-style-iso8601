package ca.enjoyit.mavenspringbootapp;

import org.springframework.boot.SpringApplication;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class MavenSpringBootAppApplication {

	public static void main(String[] args) {
		log.info("***** Running maven-spring-boot-app *****");
		SpringApplication.run(MavenSpringBootAppApplication.class, args);
	}
}
