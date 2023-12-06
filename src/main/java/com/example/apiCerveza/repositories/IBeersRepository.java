package com.example.apiCerveza.repositories;

import com.example.apiCerveza.models.BeersModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBeersRepository extends JpaRepository<BeersModel, Long> {
}
