package com.example.apiCerveza.controllers;

import com.example.apiCerveza.dto.BeersDTO;
import com.example.apiCerveza.models.BeersModel;
import com.example.apiCerveza.services.BeersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class BeersController {

    @Autowired
    BeersService beersService;

    @GetMapping("/beers")
    public Page<BeersModel> getBeers(@PageableDefault(page = 0, size = 5) Pageable pageable) {
        return beersService.getBeers(pageable);
    }

    @GetMapping("beer/{id}")
    public BeersDTO getBeerById(@PathVariable Long id) {
        return beersService.getBeerById(id);
    }

    @DeleteMapping("beer/{id}")
    public String deleteBeerById(@PathVariable Long id) {
        beersService.deleteBeerById(id);
        return "El usuario " + id + " ha sido borrado.";
    }

    @PutMapping("beer/{id}")
    public ResponseEntity<BeersModel> putBeer(@PathVariable Long id, @RequestBody BeersModel newBeer) {
        BeersModel changedBeer = beersService.putBeer(id, newBeer);
        return ResponseEntity.ok(changedBeer);
    }
}
