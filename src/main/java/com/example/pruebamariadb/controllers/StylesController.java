package com.example.pruebamariadb.controllers;

import com.example.pruebamariadb.dto.StylesDTO;
import com.example.pruebamariadb.models.BeersModel;
import com.example.pruebamariadb.models.StylesModel;
import com.example.pruebamariadb.services.StylesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Optional;

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
