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

    @Column(name = "users")
    private String users;

    public Long getId() {
        return id;
    }

    public String getUsers() {
        return users;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUsers(String users) {
        this.users = users;
    }
}
