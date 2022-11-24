package com.example.mypack.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Basic
    @Column(name = "reference")
    private String reference;
    @Basic
    @Column(name = "category")
    private String category;
   @Basic
    @Column(name = "weight")
    private Double weight;

}
