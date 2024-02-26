package com.example.hibernate.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Person {
    @EmbeddedId
    private Contact contact;
    @Column
    private String phoneNumber;
    @JoinColumn
    @ManyToOne(optional = false)
    private City cityOfLiving;

    @Override
    public String toString() {
        return "Person{" +
                "contact=" + contact +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", cityOfLiving=" + cityOfLiving +
                '}';
    }
}
