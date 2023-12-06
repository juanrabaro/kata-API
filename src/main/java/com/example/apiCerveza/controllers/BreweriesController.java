package com.example.apiCerveza.controllers;

import com.example.apiCerveza.dto.BreweriesDTO;
import com.example.apiCerveza.models.BreweriesModel;
import com.example.apiCerveza.services.BreweriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
