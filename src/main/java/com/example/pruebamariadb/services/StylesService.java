package com.example.pruebamariadb.services;

import com.example.pruebamariadb.models.CategoriesModel;
import com.example.pruebamariadb.models.StylesModel;
import com.example.pruebamariadb.repositories.IStylesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class StylesService {

    @Autowired
    IStylesRepository stylesRepository;

    public ArrayList<StylesModel> getStyles() {
        return (ArrayList<StylesModel>) stylesRepository.findAll();
    }

    public StylesModel getStylesById(Long id) {
        return stylesRepository.findById(id)
                .orElseThrow(() -> new Error("Style no encontrado con id: " + id));
    }
}
