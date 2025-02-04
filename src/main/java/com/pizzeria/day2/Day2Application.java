package com.pizzeria.day2;

import com.pizzeria.day2.model.Menu;
import com.pizzeria.day2.Configuration.MenuConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Day2Application {

	public static void main(String[] args) {
		SpringApplication.run(Day2Application.class, args);
	/*	AnnotationConfigApplicationContext appContext =
				new AnnotationConfigApplicationContext(MenuConfig.class);

		Menu menu = (Menu) appContext.getBean("menu");
		menu.printMenu();


		// Chiudo in Container
		appContext.close();*/
	}

}
