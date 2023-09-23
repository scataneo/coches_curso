package com.project.coches.domain.pojo;

import lombok.Getter;
import lombok.Setter;


/*
* Pojo de marca coche, con el fin de depender de pojo no de entidades.
*/

@Getter @Setter
public class MarcaCochePojo {

    /*
    *Id de la Marca
    */
    private Integer id;

    /*
     * Descripcion de la marca
     */

    private String description;
}
