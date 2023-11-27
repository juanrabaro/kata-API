/*
package com.example.pruebamariadb.dto;


import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
@Builder
public class BeersDTO {

    private UUID id;

    private String userId;

    private String description;

    private Date createdDate;

    private Date updatedDate;

    private String createdBy;
}
*/
package com.example.pruebamariadb.dto;

import java.io.Serializable;

public class BeersDTO implements Serializable {
    final private String name;

    public BeersDTO(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}