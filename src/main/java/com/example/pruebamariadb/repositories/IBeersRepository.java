package com.example.pruebamariadb.repositories;

import com.example.pruebamariadb.models.BeersModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBeersRepository extends CrudRepository<BeersModel, Long> {
}
