package com.example.pruebamariadb.controllers;

import com.example.pruebamariadb.models.StylesModel;
import com.example.pruebamariadb.services.StylesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/styles")
public class StylesController {

    @Autowired
    StylesService stylesService;

    @GetMapping()
    public ArrayList<StylesModel> getStyles() {
        return stylesService.getStyles();
    }
}
