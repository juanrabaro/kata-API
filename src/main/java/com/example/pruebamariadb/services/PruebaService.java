package com.example.pruebamariadb.services;

import com.example.pruebamariadb.models.PruebaModel;
import com.example.pruebamariadb.repositories.IPruebaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;

@Service
public class PruebaService {

    @Autowired
    IPruebaRepository pruebaRepository;

    public ArrayList<PruebaModel> allData() {
        return (ArrayList<PruebaModel>) pruebaRepository.findAll();
    }

    public PruebaModel addData(PruebaModel data) {
        return pruebaRepository.save(data);
    }

    public void deleteDataById(Long id) {
        if (pruebaRepository.existsById(id)) {
            pruebaRepository.deleteById(id);
        } else {
            throw new RuntimeException("No se encontró un elemento con el ID especificado.");
        }
    }


    public PruebaModel updateData(@RequestBody PruebaModel newData) {
        if (pruebaRepository.existsById(newData.getId())) {
            pruebaRepository.deleteById(newData.getId());
            return pruebaRepository.save(newData);
        } else {
            throw new RuntimeException("No se encontró un elemento con el ID especificado.");
        }
    }
}
