package com.example.pruebamariadb.controllers;

import com.example.pruebamariadb.dto.BeersDTO;
import com.example.pruebamariadb.models.BeersModel;
import com.example.pruebamariadb.services.BeersService;
import com.sun.net.httpserver.Authenticator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
