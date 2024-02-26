package com.example.hibernate.repository;

import com.example.hibernate.entity.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public class RepositoryPersonByCity {
    @PersistenceContext
    private EntityManager entityManager;

    public List<Person> personByCity(String city) {
        Query query = entityManager.createQuery("SELECT person FROM Person person WHERE person.cityOfLiving = :city");
        query.setParameter("city", city);
        List<Person> personList = query.getResultList();
        return personList;
    }
}
