package com.example.mypack.entities;


import jakarta.persistence.*;

@Entity
@Table(name = "ville")
public class Ville {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Basic
    @Column(name = "name")
    private String name;
    @OneToOne(mappedBy = "ville")
    private Center center;
}
