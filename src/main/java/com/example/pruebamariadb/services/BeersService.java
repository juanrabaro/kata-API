package com.example.pruebamariadb.services;

import com.example.pruebamariadb.models.BeersModel;
import com.example.pruebamariadb.repositories.IBeersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class BeersService {

    @Autowired
    IBeersRepository beersRepository;

    public ArrayList<BeersModel> getBeers() {
        return (ArrayList<BeersModel>) beersRepository.findAll();
    }
}
