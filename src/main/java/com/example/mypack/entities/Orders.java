package com.example.mypack.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "orders")
public class Orders implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Basic
    @Column(name = "status", columnDefinition = "boolean default false")
    private boolean status;
    @ManyToMany
    @JoinColumn(name = "clientId", referencedColumnName = "id")
    private Collection<Client> clients;
    @ManyToMany
    @JoinColumn(name = "productId", referencedColumnName = "id")
    private Collection<Product> products;

}
