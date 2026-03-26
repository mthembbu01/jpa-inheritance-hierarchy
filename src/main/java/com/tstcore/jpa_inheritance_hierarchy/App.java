package com.tstcore.jpa_inheritance_hierarchy;

/** TABLE_PER_CLASS states that a table per concrete entity class is created.
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
