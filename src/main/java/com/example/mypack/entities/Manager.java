package com.example.mypack.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "manager")
public class Manager extends Person{
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idCenter", referencedColumnName = "id")
    private Center center;

    public Center getCenter() {
        return center;
    }

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
    public Center getCenterId()
    {
        return this.center;
    }
    public void setCenter(Center center) {
        this.center = center;
    }
}
