package com.example.pruebamariadb.services;

import com.example.pruebamariadb.dto.BreweriesDTO;
import com.example.pruebamariadb.models.BreweriesModel;
import com.example.pruebamariadb.repositories.IBreweriesRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class BreweriesService {

    @Autowired
    IBreweriesRepository breweriesRepository;

    public Page<BreweriesModel> getBreweries(Pageable pageable) {
        return breweriesRepository.findAll(pageable);
    }

    public BreweriesDTO getBreweriesById(Long id) {
        if (breweriesRepository.existsById(id)) {
            final Optional<BreweriesModel> brewerieEncontrada = breweriesRepository.findById(id);
            final BreweriesModel breweriesModel = brewerieEncontrada.get();
            return new BreweriesDTO(breweriesModel.getName(), breweriesModel.getCity(), breweriesModel.getState(), breweriesModel.getCountry(), breweriesModel.getDescript());
            //return beersRepository.findById(id);
        } else {
            throw new EntityNotFoundException("No se encontró el brewerie con el ID " + id);
            //throw new RuntimeException("No se encontró un elemento con el ID especificado.");
        }
    }
}