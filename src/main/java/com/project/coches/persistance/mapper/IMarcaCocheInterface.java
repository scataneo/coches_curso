package com.project.coches.persistance.mapper;

import com.project.coches.domain.pojo.MarcaCochePojo;
import com.project.coches.persistance.entity.MarcaCocheEntity;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;


/*Mapper que transforma objetos de MarcaCoche a pojos o entidades*/
@Mapper(componentModel = "spring")
public interface IMarcaCocheInterface {

    /**
    * Convierte una entidad a un pojo de marca coche
    * @param marcaEntity Entidad a convertir
    * @return Pojo convertido
    */
    @Mapping(source = "id", target = "id")
    @Mapping(source = "description", target = "description")
    MarcaCochePojo toMarcaCochePojo(MarcaCocheEntity marcaEntity);

    /**
     * Convierte un pojo a una entidad de marca coche
     * @param marcaPojo Pojo a convertir
     * @return Entity convertido
     */
    @InheritConfiguration
    MarcaCocheEntity toMarcaCocheEntity(MarcaCochePojo marcaPojo);

    /**
     * Retorna una lista de marcas coche transformada a pojo de una lista de entidades
     * @param marcasCocheEntity Entidad a transformar
     * @return lista transformada
     */
    List<MarcaCochePojo> toMarcasCochesPojo(List<MarcaCocheEntity>marcasCocheEntity);

}
