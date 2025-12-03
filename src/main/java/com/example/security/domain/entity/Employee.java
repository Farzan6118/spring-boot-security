package com.example.security.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "employee")
public class Employee extends BaseEntity<Long> {

    private String firstName;
    private String lastName;
    @Column(length = 10)
    private String NationalCode;

}
