package com.example.apiCerveza.controllers;

import com.example.apiCerveza.dto.StylesDTO;
import com.example.apiCerveza.models.StylesModel;
import com.example.apiCerveza.services.StylesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StylesController {

    @Autowired
    StylesService stylesService;

    @GetMapping("/styles")
    public Page<StylesModel> getStyles(@PageableDefault(page = 0, size = 5) Pageable pageable) {
        return stylesService.getStyles(pageable);
    }

    @GetMapping("style/{id}")
    public StylesDTO getStylesById(@PathVariable Long id) {
        return stylesService.getStylesById(id);
    }
}
