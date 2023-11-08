package com.example.pruebamariadb.controllers;

import com.example.pruebamariadb.models.CategoriesModel;
import com.example.pruebamariadb.services.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/categories")
public class CategoriesController {

    @Autowired
    CategoriesService categoriesService;

    @GetMapping()
    public ArrayList<CategoriesModel> getCategories() {
        return categoriesService.getCategories();
    }
}
