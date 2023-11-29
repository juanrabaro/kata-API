package com.example.pruebamariadb.services;

import com.example.pruebamariadb.dto.BeersDTO;
import com.example.pruebamariadb.models.BeersModel;
import com.example.pruebamariadb.repositories.IBeersRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;


@Service
public class BeersService {

    @Autowired
    IBeersRepository beersRepository;

    public Page<BeersModel> getBeers(Pageable pageable) {
        return beersRepository.findAll(pageable);
    }

    public BeersDTO getBeerById(Long id) {
        if (beersRepository.existsById(id)) {
            final Optional<BeersModel> beerEncontrada = beersRepository.findById(id);
            final BeersModel beersModel = beerEncontrada.get();
            return new BeersDTO(beersModel.getName());
            //return beersRepository.findById(id);
        } else {
            throw new EntityNotFoundException("No se encontró un elemento con el ID " + id);
            //throw new RuntimeException("No se encontró un elemento con el ID especificado.");
        }
    }

    public void deleteBeerById(Long id) {
        if (beersRepository.existsById(id)) {
            beersRepository.deleteById(id);
        } else {
            throw new Error("No se encontró un elemento con el ID especificado");
            //RuntimeException("No se encontró un elemento con el ID especificado.");
        }
    }

    public BeersModel putBeer(Long id, BeersModel newBeer){
        BeersModel oldBeer = beersRepository.findById(id)
                .orElseThrow(() -> new Error("Beer no encontrado con id: " + id));

        oldBeer.setBrewery_id(newBeer.getBrewery_id());
        oldBeer.setName(newBeer.getName());
        oldBeer.setCat_id(newBeer.getCat_id());
        oldBeer.setStyle_id(newBeer.getStyle_id());
        oldBeer.setAbv(newBeer.getAbv());
        oldBeer.setIbu(newBeer.getIbu());
        oldBeer.setSrm(newBeer.getSrm());
        oldBeer.setUpc(newBeer.getUpc());
        oldBeer.setFilepath(newBeer.getFilepath());
        oldBeer.setDescript(newBeer.getDescript());
        oldBeer.setAdd_user(newBeer.getAdd_user());
        oldBeer.setLast_mod(newBeer.getLast_mod());

        return beersRepository.save(oldBeer);
    }

}
