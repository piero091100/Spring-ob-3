package com.example.Springob3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringOb3Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringOb3Application.class, args);
		SmartphoneRepository repository = context.getBean(SmartphoneRepository.class);
		//System.out.println("El número de database es: " + repository.count());

		//Smartphone smartphone2 = new Smartphone(null, "Samsung", "A52S", 2020);
		//repository.save(smartphone2);

		//System.out.println("El número de database es: " + repository.count());

		System.out.println(repository.findAll());
	}

}
