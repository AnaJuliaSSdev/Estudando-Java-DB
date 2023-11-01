package com.example.demo;

import org.springframework.stereotype.Repository;

@Repository
public class InMemoryAdressRepository implements AdressRepository{

    @Override
    public Adress findAdressByCep(String cep) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAdressByCep'");
    }

}
