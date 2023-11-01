package com.example.demo;

import example.springrest.errors.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetAdressByCepService {


    @Autowired
    InMemoryAdressRepository repository;

    public Adress execute(String cep) throws Exception {
        var adress = repository.findAdressByCep(cep);

        if(adress == null) {
            throw new NotFoundException();
        }

        return adress;
    }


}
