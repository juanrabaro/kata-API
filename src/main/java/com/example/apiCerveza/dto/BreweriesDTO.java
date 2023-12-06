package com.example.apiCerveza.dto;

import java.io.Serializable;

public class BreweriesDTO implements Serializable {
    final private String name;
    final private String city;
    final private String state;
    final private String country;
    final private String descript;

    public BreweriesDTO(String name, String city, String state, String country, String descript) {
        this.name = name;
        this.city = city;
        this.state = state;
        this.country = country;
        this.descript = descript;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public String getDescript() {
        return descript;
    }
}
