package com.example.pruebamariadb.repositories;

import com.example.pruebamariadb.models.PruebaModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPruebaRepository extends CrudRepository<PruebaModel, Long> {
}
