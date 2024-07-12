package com.corderita.CRUD.Demo.data.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String names;

    @Column(unique = true, nullable = false)
    private String email;

    private String password;
}
