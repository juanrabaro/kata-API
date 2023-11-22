package com.example.pruebamariadb.controllers;

import com.example.pruebamariadb.models.BreweriesModel;
import com.example.pruebamariadb.services.BreweriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Optional;

@RestController
public class BreweriesController {

    @Autowired
    BreweriesService breweriesService;

    @RequestMapping("/breweries")
    public ArrayList<BreweriesModel> getBreweries() {
        return breweriesService.getBreweries();
    }

    @RequestMapping("/brewerie/{id}")
    public Optional<BreweriesModel> getBreweriesById(@PathVariable Long id) {
        return Optional.ofNullable(breweriesService.getBreweriesById(id));
    }

}
