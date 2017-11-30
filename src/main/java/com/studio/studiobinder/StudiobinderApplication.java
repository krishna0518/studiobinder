package com.studio.studiobinder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages={"com.studio.studiobinder.service","com.studio.studiobinder.controllers"})
@EntityScan(basePackages={"com.studio.studiobinder.pojo"})
@EnableJpaRepositories(basePackages={"com.studio.studiobinder.dao"})
public class StudiobinderApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudiobinderApplication.class, args);
	}
}
