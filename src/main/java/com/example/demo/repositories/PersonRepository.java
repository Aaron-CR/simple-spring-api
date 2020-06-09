package com.example.demo.repositories;

import java.util.List;

import com.example.demo.dtos.PersonDTO;
import com.example.demo.entities.Person;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

// @RepositoryRestResource(excerptProjection = PersonDTO.class, collectionResourceRel = "people", path = "people")
@RepositoryRestResource(collectionResourceRel = "payload", path = "people")
public interface PersonRepository extends PagingAndSortingRepository<Person, Long> {

    @Query("from Person p where lower(p.firstName) like CONCAT('%', lower(:q), '%') OR lower(p.lastName) like CONCAT('%', lower(:q), '%')")
    List<Person> filter(@Param("q") String name);

}
