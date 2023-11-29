package com.example.pruebamariadb.repositories;

import com.example.pruebamariadb.models.StylesModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStylesRepository extends JpaRepository<StylesModel, Long> {
}
