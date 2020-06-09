package com.example.demo;

import com.example.demo.entities.Person;
import com.example.demo.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}

@Component
class DemoCommandLineRunner implements CommandLineRunner {

	@Autowired
	private PersonRepository personRepository;

	@Override
	public void run(String... args) throws Exception {

		Person person1 = new Person();
		person1.setFirstName("Aaron");
		person1.setLastName("Castro");

		personRepository.save(person1);

		Person person2 = new Person();
		person2.setFirstName("Florencia");
		person2.setLastName("Salcedo");

		personRepository.save(person2);

		Person person3 = new Person();
		person3.setFirstName("Jonathan");
		person3.setLastName("Torrico");

		personRepository.save(person3);

		Person person4 = new Person();
		person4.setFirstName("Pablo");
		person4.setLastName("García");

		personRepository.save(person4);
	}
}
