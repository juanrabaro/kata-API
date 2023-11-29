package com.example.pruebamariadb.dto;

import java.io.Serializable;

public class StylesDTO implements Serializable {
    final private String style_name;

    public StylesDTO(String styleName) {
        style_name = styleName;
    }

    public String getStyle_name() {
        return style_name;
    }
}
