package com.tstcore.jpa_inheritance_hierarchy;

/**
 * JOINED is a strategy in which fields that are specific to a subclass are mapped to a separate table than the fields
 * that are common to the parent class, and a join is performed to instantiate the subclass.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

}
