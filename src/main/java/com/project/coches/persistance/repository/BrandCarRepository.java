package com.project.coches.persistance.repository;

import com.project.coches.domain.pojo.BrandCarPojo;
import com.project.coches.domain.repository.IBrandCarRepository;
import com.project.coches.persistance.entity.BrandCarEntity;
import com.project.coches.persistance.mapper.IBrandCarMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


/**
 * Repositorio de marca coche
 */
@RequiredArgsConstructor // crea construcutor con los final
@Repository
public class BrandCarRepository implements IBrandCarRepository {

    /**
     * Crud de marca coche
     */
    private final IBrandCarRepository iBrandCarRepository;

    /**
     * Mapper de marca coche
     */
    private final IBrandCarMapper iBrandCarMapper;
    private final IBrandCarCrudRepository iBrandCarCrudRepository;


    /**
     * Devuelve una lista con todas las amrca coches
     * @return lista de marca coches
     */
    @Override
    public List<BrandCarPojo> getAll() {
        return iBrandCarMapper.toMarcasCochePojos(iBrandCarCrudRepository.findAll());
    }

    @Override
    public Optional<BrandCarPojo> getBranCar(Integer id) {
        return iBrandCarCrudRepository.findById(id)
                .map(iBrandCarMapper::toMarcaCochePojo);
    }


    /**
     * Guarda una nueva marca coche
     * @param newBrandCar marca coche a guardar
     * @return marca coche guardada
     */
    @Override
    public BrandCarPojo save(BrandCarPojo newBrandCar) {
        BrandCarEntity brandCarEntity = iBrandCarMapper.toMarcaCocheEntity(newBrandCar);
       return iBrandCarMapper.toMarcaCochePojo(iBrandCarCrudRepository.save(brandCarEntity));

    }

    @Override
    public void delete(Integer idBrandCar) {
        iBrandCarCrudRepository.deleteById(idBrandCar);
    }
}
