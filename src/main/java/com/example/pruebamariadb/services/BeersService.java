package com.example.pruebamariadb.services;

import com.example.pruebamariadb.dto.BeersDTO;
import com.example.pruebamariadb.models.BeersModel;
import com.example.pruebamariadb.repositories.IBeersRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

import static com.example.pruebamariadb.models.BeersModel.getName;

@Service
public class BeersService {

    @Autowired
    IBeersRepository beersRepository;

    public ArrayList<BeersModel> getBeers() {
        return (ArrayList<BeersModel>) beersRepository.findAll();
    }

    public BeersDTO getBeerById(Long id) {
        if (beersRepository.existsById(id)) {
            System.out.println("El valor del nombre: " + BeersModel.getName());
            System.out.println("El id es: " + id);
            return new BeersDTO(BeersModel.getName());
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
        oldBeer.setName(getName());
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
