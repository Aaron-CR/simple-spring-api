package com.example.demo.dtos;

import com.example.demo.entities.Person;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "personDTO", types = Person.class)
public interface PersonDTO {
    long getId();
    String getFirstName();
}
