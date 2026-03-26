package com.tstcore.jpa_inheritance_hierarchy;


/**
 * MappedSuperclass
 * The mapped superclass is the only place where common fields are present
 * Other than that, there is no relationship between classes in terms of tables
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

}
