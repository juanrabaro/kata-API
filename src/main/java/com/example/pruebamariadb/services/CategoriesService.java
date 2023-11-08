package com.example.pruebamariadb.services;

import com.example.pruebamariadb.models.BreweriesModel;
import com.example.pruebamariadb.models.CategoriesModel;
import com.example.pruebamariadb.repositories.IBreweriesRepository;
import com.example.pruebamariadb.repositories.ICategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class CategoriesService {

    @Autowired
    ICategoriesRepository categoriesRepository;

    public ArrayList<CategoriesModel> getBreweries() {
        return (ArrayList<CategoriesModel>) categoriesRepository.findAll();
    }

    public Optional<BreweriesModel> getBreweriesById(Long id) {
        return categoriesRepository.findById(id);
    }
}