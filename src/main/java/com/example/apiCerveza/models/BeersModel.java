package com.example.apiCerveza.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "beers")
public class BeersModel {

    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, length = 21)
    private Long id;

    @Column(nullable = false, length = 21)
    private Long brewery_id;

    @Column(nullable = false, length = 255)
    private String name;

    @Column(nullable = false, length = 11)
    private Long cat_id;

    @Column(nullable = false, length = 11)
    private Long style_id;

    @Column(nullable = false, columnDefinition = "0")
    private Float abv;

    @Column(nullable = false, columnDefinition = "0")
    private Float ibu;

    @Column(nullable = false, columnDefinition = "0")
    private Float srm;

    @Column(nullable = false, length = 40)
    private Long upc;

    @Column(nullable = false, length = 255)
    private String filepath;

    @Column(nullable = false)
    private String descript;

    @Column(nullable = false, length = 11)
    private Long add_user;

    @Column(nullable = false, columnDefinition = "0000-00-00 00:00:00")
    private Date last_mod;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBrewery_id() {
        return brewery_id;
    }

    public void setBrewery_id(Long brewery_id) {
        this.brewery_id = brewery_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCat_id() {
        return cat_id;
    }

    public void setCat_id(Long cat_id) {
        this.cat_id = cat_id;
    }

    public Long getStyle_id() {
        return style_id;
    }

    public void setStyle_id(Long style_id) {
        this.style_id = style_id;
    }

    public Float getAbv() {
        return abv;
    }

    public void setAbv(Float abv) {
        this.abv = abv;
    }

    public Float getIbu() {
        return ibu;
    }

    public void setIbu(Float ibu) {
        this.ibu = ibu;
    }

    public Float getSrm() {
        return srm;
    }

    public void setSrm(Float srm) {
        this.srm = srm;
    }

    public Long getUpc() {
        return upc;
    }

    public void setUpc(Long upc) {
        this.upc = upc;
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }

    public Long getAdd_user() {
        return add_user;
    }

    public void setAdd_user(Long add_user) {
        this.add_user = add_user;
    }

    public Date getLast_mod() {
        return last_mod;
    }

    public void setLast_mod(Date last_mod) {
        this.last_mod = last_mod;
    }
}
