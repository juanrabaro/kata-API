package com.example.pruebamariadb.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "styles")
public class StylesModel {

    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, length = 11)
    Long id;

    @Column(nullable = false, length = 11, columnDefinition = "0")
    Integer cat_id;

    @Column(nullable = false, length = 255)
    String style_name;

    @Column(nullable = false, columnDefinition = "0000-00-00 00:00:00")
    Date last_mod;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCat_id() {
        return cat_id;
    }

    public void setCat_id(Integer cat_id) {
        this.cat_id = cat_id;
    }

    public String getStyle_name() {
        return style_name;
    }

    public void setStyle_name(String style_name) {
        this.style_name = style_name;
    }

    public Date getLast_mod() {
        return last_mod;
    }

    public void setLast_mod(Date last_mod) {
        this.last_mod = last_mod;
    }
}
