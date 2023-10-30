package com.example.pruebamariadb.controllers;

import com.example.pruebamariadb.models.PruebaModel;
import com.example.pruebamariadb.services.PruebaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/")
public class PruebaController {

    @Autowired
    PruebaService pruebaService;

    @GetMapping()
    public ArrayList<PruebaModel> allData() {
        return pruebaService.allData();
    }

    @PostMapping()
    public PruebaModel addData(@RequestBody PruebaModel data) {
        return pruebaService.addData(data);
    }

    @DeleteMapping()
    public void deleteData(@RequestBody Long id) {
        pruebaService.deleteDataById(id);
    }

    @PutMapping()
    public PruebaModel updateData(@RequestBody PruebaModel newData) {
        return pruebaService.updateData(newData);
    }

}
