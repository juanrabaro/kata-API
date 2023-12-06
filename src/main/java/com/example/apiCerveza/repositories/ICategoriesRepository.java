package com.example.apiCerveza.repositories;

import com.example.apiCerveza.models.CategoriesModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoriesRepository extends JpaRepository<CategoriesModel, Long> {
}
