package com.example.apiCerveza.repositories;

import com.example.apiCerveza.models.BreweriesModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBreweriesRepository extends JpaRepository<BreweriesModel, Long> {
}
