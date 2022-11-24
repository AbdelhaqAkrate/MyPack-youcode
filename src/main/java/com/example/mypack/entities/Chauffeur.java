package com.example.mypack.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "chauffeur")
public class Chauffeur extends Person{

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idVehicle", referencedColumnName = "id")
    private Vehicle vehicle;

    public Integer getId()
    {
        return this.id;
    }
    public void setId(Integer id)
    {
        this.id = id;
    }
    public String getFullName()
    {
        return this.fullName;
    }
    public void setFullName(String fullName)
    {
        this.fullName = fullName;
    }
    public String getEmail()
    {
        return this.email;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }
    public String getPassward()
    {
        return this.passward;
    }
    public void setPassward(String passward)
    {
        this.passward = passward;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
