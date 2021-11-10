package com.example.scooterrentservice.models;

import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "scooters")
@NoArgsConstructor
public class Scooter {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
}
