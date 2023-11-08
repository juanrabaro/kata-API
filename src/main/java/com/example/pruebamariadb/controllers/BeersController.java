package com.example.pruebamariadb.controllers;

import com.example.pruebamariadb.models.BeersModel;
import com.example.pruebamariadb.services.BeersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
public class BeersController {

    @Autowired
    BeersService beersService;

    @GetMapping("/beers")
    public ArrayList<BeersModel> getBeers() {
        return beersService.getBeers();
    }

    @GetMapping("beer/{id}")
    public Optional<BeersModel> getBeerById(@PathVariable Long id) {
        return beersService.getBeerById(id);
    }
}
