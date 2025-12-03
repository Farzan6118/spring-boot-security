package com.example.security.domain.entity;

import jakarta.persistence.*;
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
