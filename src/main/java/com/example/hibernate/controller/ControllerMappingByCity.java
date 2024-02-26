package com.example.hibernate.controller;

import com.example.hibernate.entity.Person;
import com.example.hibernate.repository.RepositoryPersonByCity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ControllerMappingByCity {
    private final RepositoryPersonByCity repositoryPersonByCity;

    @GetMapping("/persons/by-city")
    public List<Person> getPersonByCity (@RequestParam("city") String city){
        return repositoryPersonByCity.personByCity(city);
    }
}
