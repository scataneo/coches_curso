package com.project.coches.domain.pojo;

import lombok.Getter;
import lombok.Setter;

/**
 * Pojo de marca coche, para no interactuar con la entidad directamente y si con los pojos
 */

@Getter @Setter
public class MarcaCochePojo {

    /**
     * ID de la marca
     */
    private Integer id;
    /**
     * Descripcion de la marca
     */
    private String description;
}
