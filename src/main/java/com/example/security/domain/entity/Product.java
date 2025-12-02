package com.example.security.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "product")
public class Product extends BaseEntity<Long> {

    private String name;
    private String code;

}
