package com.example.pruebamariadb.services;

import com.example.pruebamariadb.models.CategoriesModel;
import com.example.pruebamariadb.repositories.ICategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class CategoriesService {

    @Autowired
    ICategoriesRepository categoriesRepository;

    public ArrayList<CategoriesModel> getCategories() {
        return (ArrayList<CategoriesModel>) categoriesRepository.findAll();
    }

    public CategoriesModel getCategoriesById(Long id) {
        return categoriesRepository.findById(id)
                .orElseThrow(() -> new Error("Category no encontrado con id: " + id));
    }
}