package com.example.hibernate;

import com.example.hibernate.entity.City;
import com.example.hibernate.entity.Contact;
import com.example.hibernate.entity.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

@SpringBootApplication
public class HibernateApplication {


    public static void main(String[] args) {
        SpringApplication.run(HibernateApplication.class, args);
    }


}
