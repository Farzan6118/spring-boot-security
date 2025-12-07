package com.example.security.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "employee")
public class EmployeeEntity extends BaseEntity<Long> {

    private String firstName;
    private String lastName;
    @Column(length = 10)
    private String NationalCode;

}
