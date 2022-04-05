package com.example.security.model;

import com.example.security.model.enums.RoleEnum;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table
public class UserRole {
    @Id
    private Long id;
    private RoleEnum role;
    private String roleName;

}
