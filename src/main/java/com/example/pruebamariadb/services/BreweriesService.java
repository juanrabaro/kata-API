package com.example.pruebamariadb.services;

import com.example.pruebamariadb.models.BreweriesModel;
import com.example.pruebamariadb.repositories.IBreweriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class BreweriesService {

    @Autowired
    IBreweriesRepository breweriesRepository;

    public ArrayList<BreweriesModel> getBreweries() {
        return (ArrayList<BreweriesModel>) breweriesRepository.findAll();
    }

    public Optional<BreweriesModel> getBreweriesById(Long id) {
        return breweriesRepository.findById(id);
    }
}