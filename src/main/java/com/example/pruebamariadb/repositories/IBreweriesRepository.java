package com.example.pruebamariadb.repositories;

import com.example.pruebamariadb.models.BreweriesModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBreweriesRepository extends CrudRepository<BreweriesModel, Long> {
}
