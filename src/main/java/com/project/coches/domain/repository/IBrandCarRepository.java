package com.project.coches.domain.repository;

import com.project.coches.domain.pojo.BrandCarPojo;

import java.util.List;
import java.util.Optional;

public interface IBrandCarRepository {

    /**
     * Devuele una lista con todas las marcas de coches
     * @return lista con martca de coches
     */
    List<BrandCarPojo> getAll();

    /**+
     * Devuelve una marca de coche dada su id
     * @param id ID de la marca coche
     * @return Optional de la marca coche encontrado
     */
    Optional<BrandCarPojo> getBranCar(Integer id);

    /**
     * Guarda un nueva marca coche
     * @param newBrandCar marca coche a guardar
     * @return marca coche guardada
     */
    BrandCarPojo save(BrandCarPojo newBrandCar);

    /**
     * Elimina una marca coche dada su id
     * @param idBrandCar Id del marca coche a eliminar
     */
    void delete(Integer idBrandCar);
}
