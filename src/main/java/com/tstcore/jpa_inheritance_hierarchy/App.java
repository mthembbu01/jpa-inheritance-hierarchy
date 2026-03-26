package com.tstcore.jpa_inheritance_hierarchy;

/** SINGLE_Table is a default strategy for inheritance.
 * It maps all classes in the hierarchy to a single table in the database.
 *
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

}
