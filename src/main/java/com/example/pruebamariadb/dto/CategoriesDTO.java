package com.example.pruebamariadb.dto;

import java.io.Serializable;

public class CategoriesDTO implements Serializable {
    final private String cat_name;

    public CategoriesDTO(String catName) {
        cat_name = catName;
    }

    public String getCat_name() {
        return cat_name;
    }
}
