package com.example.pruebamariadb.services;

import com.example.pruebamariadb.dto.CategoriesDTO;
import com.example.pruebamariadb.models.CategoriesModel;
import com.example.pruebamariadb.repositories.ICategoriesRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class CategoriesService {

    @Autowired
    ICategoriesRepository categoriesRepository;

    public Page<CategoriesModel> getCategories(Pageable pageable) {
        return categoriesRepository.findAll(pageable);
    }

    public CategoriesDTO getCategoriesById(Long id) {
        if ( categoriesRepository.existsById(id) ) {
            final Optional<CategoriesModel> categorieEncontrada = categoriesRepository.findById(id);
            final CategoriesModel categoriesModel = categorieEncontrada.get();
            return new CategoriesDTO(categoriesModel.getCat_name());
        } else throw new EntityNotFoundException("Category no encontrado con id: " + id);
    }
}