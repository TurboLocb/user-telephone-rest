package com.turbolocb.usertelephonerest.entities;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

    //конструктор
    public User(){
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "telephone")
    private Long telephone;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Long getTelephone() {
        return telephone;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String users) {
        this.name = name;
    }

    public void setTelephone(Long telephone) {
        this.telephone = telephone;
    }
}
