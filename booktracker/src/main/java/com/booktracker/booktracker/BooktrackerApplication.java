package com.booktracker.booktracker;

import java.nio.file.Path;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.cassandra.CqlSessionBuilderCustomizer;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import connection.DataStaxAStraProperties;

@SpringBootApplication
@EnableConfigurationProperties(DataStaxAStraProperties.class)
public class BooktrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BooktrackerApplication.class, args);
	}
	 
	@Bean
	public CqlSessionBuilderCustomizer sessionBuilderCustomizer(DataStaxAStraProperties astraProperties){
		Path bundle = astraProperties.getSecureConnectbundle().toPath();
		return builder-> builder.withCloudSecureConnectBundle(bundle);
	}

}
