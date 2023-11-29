package com.example.pruebamariadb.controllers;

import com.example.pruebamariadb.dto.BreweriesDTO;
import com.example.pruebamariadb.models.BreweriesModel;
import com.example.pruebamariadb.services.BreweriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
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
    public Page<BreweriesModel> getBreweries(@PageableDefault(page = 0, size = 5) Pageable pageable) {
        return breweriesService.getBreweries(pageable);
    }

    @RequestMapping("/brewerie/{id}")
    public BreweriesDTO getBreweriesById(@PathVariable Long id) {
        return breweriesService.getBreweriesById(id);
    }

}
