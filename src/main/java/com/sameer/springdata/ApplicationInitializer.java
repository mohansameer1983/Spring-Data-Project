package com.sameer.springdata;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@SpringBootApplication
public class ApplicationInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationInitializer.class, args);
	}



	@Bean
	public OpenAPI customOpenAPI(@Value("${application-description}") String appDesciption, 
			@Value("${application-version}") String appVersion,
			@Value("${application-name}") String appName) {
		return new OpenAPI()
				.info(new Info()
						.title(appName)
						.version(appVersion)
						.description(appDesciption));
	}
}
