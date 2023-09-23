package com.project.coches.persistance.entity;

import jakarta.persistence.*;


/*
 *Entidades de marca coche
 */

@Entity
@Table(name = "marca_coche")
public class MarcaCocheEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "descripcion")
    private String description;

}
