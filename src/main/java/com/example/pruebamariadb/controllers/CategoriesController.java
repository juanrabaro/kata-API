package com.example.pruebamariadb.controllers;

import com.example.pruebamariadb.models.CategoriesModel;
import com.example.pruebamariadb.services.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Optional;

@RestController
public class CategoriesController {

    @Autowired
    CategoriesService categoriesService;

    @GetMapping("/categories")
    public ArrayList<CategoriesModel> getCategories() {
        return categoriesService.getCategories();
    }

    @GetMapping("categorie/{id}")
    public Optional<CategoriesModel> getCategoriesById(@PathVariable Long id) {
        return Optional.ofNullable(categoriesService.getCategoriesById(id));
    }
}
