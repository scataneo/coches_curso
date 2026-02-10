package com.project.coches.persistance.mapper;


import com.project.coches.domain.pojo.BrandCarPojo;
import com.project.coches.persistance.entity.BrandCarEntity;
import org.apache.catalina.LifecycleState;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IBrandCarMapper {

    @Mapping(source = "id",target = "id")
    @Mapping(source = "description",target = "description")
    BrandCarPojo toMarcaCochePojo(BrandCarEntity marcaEntity);

    @InheritInverseConfiguration
    BrandCarEntity toMarcaCocheEntity(BrandCarPojo marcaPojo);

    List<BrandCarPojo> toMarcasCochePojos(List<BrandCarEntity> marcasCocheEntity);
}
