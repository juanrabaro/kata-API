package com.example.pruebamariadb.repositories;

import com.example.pruebamariadb.models.CategoriesModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoriesRepository extends CrudRepository<CategoriesModel, Long> {
}
