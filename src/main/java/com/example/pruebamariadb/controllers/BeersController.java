package com.example.pruebamariadb.controllers;

import com.example.pruebamariadb.models.BeersModel;
import com.example.pruebamariadb.services.BeersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/beers")
public class BeersController {

    @Autowired
    BeersService beersService;

    @GetMapping()
    public ArrayList<BeersModel> getBeers() {
        return beersService.getBeers();
    }
}
