package com.example.apiCerveza.services;

import com.example.apiCerveza.dto.StylesDTO;
import com.example.apiCerveza.models.StylesModel;
import com.example.apiCerveza.repositories.IStylesRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StylesService {

    @Autowired
    IStylesRepository stylesRepository;

    public Page<StylesModel> getStyles(Pageable pageable) {
        return stylesRepository.findAll(pageable);
    }

    public StylesDTO getStylesById(Long id) {
        if ( stylesRepository.existsById(id) ) {
            final Optional<StylesModel> styleEncontrada = stylesRepository.findById(id);
            final StylesModel stylesModel = styleEncontrada.get();
            return new StylesDTO(stylesModel.getStyle_name());
        } else throw new EntityNotFoundException("Style no encontrado con id: " + id);
    }
}
