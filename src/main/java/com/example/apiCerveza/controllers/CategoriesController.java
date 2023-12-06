package com.example.apiCerveza.controllers;

import com.example.apiCerveza.dto.CategoriesDTO;
import com.example.apiCerveza.models.CategoriesModel;
import com.example.apiCerveza.services.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoriesController {

    @Autowired
    CategoriesService categoriesService;

    @GetMapping("/categories")
    public Page<CategoriesModel> getCategories(@PageableDefault(page = 0, size = 5) Pageable pageable) {
        return categoriesService.getCategories(pageable);
    }

    @GetMapping("categorie/{id}")
    public CategoriesDTO getCategoriesById(@PathVariable Long id) {
        return categoriesService.getCategoriesById(id);
    }
}
