package com.example.pruebamariadb.controllers;

import com.example.pruebamariadb.models.BeersModel;
import com.example.pruebamariadb.models.StylesModel;
import com.example.pruebamariadb.services.StylesService;
import org.springframework.beans.factory.annotation.Autowired;
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
    public ArrayList<StylesModel> getStyles() {
        return stylesService.getStyles();
    }

    @GetMapping("style/{id}")
    public Optional<StylesModel> getStylesById(@PathVariable Long id) {
        return Optional.ofNullable(stylesService.getStylesById(id));
    }
}
