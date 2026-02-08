package com.project.coches.persistance.entity.mapper;

import com.project.coches.domain.pojo.MarcaCochePojo;
import com.project.coches.persistance.entity.MarcaCocheEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * Mapeo de pojo a entidades, tranforma objetos de marca coche a pojos
 */
@Mapper(componentModel = "spring")
public interface IMarcaCocheMapper {

    /**
     * Convierte una entidad de marca coche a un pojo de marca pojo
     * @param marcaEntity entidad a convertir
     * @return pojo convertido
     */
    @Mapping(source = "id", target = "id")
    @Mapping(source = "description", target = "description")
    MarcaCochePojo toMarcaCochePojo(MarcaCocheEntity marcaEntity);

    /**
     * Convierte un pojo de marca coche a una entidad de marca pojo
     * @param marcaPojo pojo a convertir
     * @return entity convertido
     */
    @InheritInverseConfiguration
    MarcaCocheEntity toMarcaCocheEntity(MarcaCochePojo marcaPojo);

    /**
     *Retorna una lista de marcas coche transformada a pojo de una lista de entidades
     * @param marcasCocheEntity entidad a transformar
     * @return lista tranformada
     */
    List<MarcaCochePojo> toMarcasCochePojo(List<MarcaCocheEntity> marcasCocheEntity);
}
