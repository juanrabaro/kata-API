package com.example.apiCerveza.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "categories")
public class CategoriesModel {

    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, length = 11)
    private Long id;

    @Column(nullable = false, length = 255)
    private String cat_name;

    @Column(nullable = false, columnDefinition = "0000-00-00 00:00:00")
    private Date last_mod;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCat_name() {
        return cat_name;
    }

    public void setCat_name(String cat_name) {
        this.cat_name = cat_name;
    }

    public Date getLast_mod() {
        return last_mod;
    }

    public void setLast_mod(Date last_mod) {
        this.last_mod = last_mod;
    }
}
