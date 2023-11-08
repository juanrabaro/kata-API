package com.example.pruebamariadb.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "breweries")
public class BreweriesModel {

    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, length = 21)
    Long id;

    @Column(nullable = false, length = 255)
    String name;

    @Column(nullable = false, length = 255)
    String addres1;

    @Column(nullable = false, length = 255)
    String addres2;

    @Column(nullable = false, length = 255)
    String city;

    @Column(nullable = false, length = 255)
    String state;

    @Column(nullable = false, length = 25)
    String code;

    @Column(nullable = false, length = 255)
    String country;

    @Column(nullable = false, length = 50)
    String phone;

    @Column(nullable = false, length = 255)
    String website;

    @Column(nullable = false, length = 255)
    String filepath;

    @Column(nullable = false)
    String descript;

    @Column(nullable = false, length = 11, columnDefinition = "0")
    Integer add_user;

    @Column(nullable = false, columnDefinition = "0000-00-00 00:00:00")
    Date last_mod;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddres1() {
        return addres1;
    }

    public void setAddres1(String addres1) {
        this.addres1 = addres1;
    }

    public String getAddres2() {
        return addres2;
    }

    public void setAddres2(String addres2) {
        this.addres2 = addres2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
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

    public Integer getAdd_user() {
        return add_user;
    }

    public void setAdd_user(Integer add_user) {
        this.add_user = add_user;
    }

    public Date getLast_mod() {
        return last_mod;
    }

    public void setLast_mod(Date last_mod) {
        this.last_mod = last_mod;
    }
}
