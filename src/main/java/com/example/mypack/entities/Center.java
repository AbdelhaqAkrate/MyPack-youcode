package com.example.mypack.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "center")
public class Center {
    @Id
    private Integer id;
    @Basic
    @Column(name = "adresse",nullable = false)
    private String adresse;
    @Basic
    @Column(name = "title")
    private String title;
    @OneToOne(mappedBy = "center")
    private Manager manager;

    public Integer getId()
    {
        return this.id;
    }
    public void setId(Integer id)
    {
        this.id = id;
    }
    public String getAdresse()
    {
        return this.adresse;
    }
    public void setAdresse(String adresse)
    {
        this.adresse = adresse;
    }
    public String getTitle()
    {
        return this.title;
    }
    public void setTitle(String title)
    {
        this.title = title;
    }
    public Manager getManager()
    {
        return this.manager;
    }
    public void setManager(Manager manager)
    {
        this.manager = manager;
    }
    

}
