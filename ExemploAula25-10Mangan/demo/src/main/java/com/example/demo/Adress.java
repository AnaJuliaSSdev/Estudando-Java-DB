package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Adress {

    private String cep;

    public Adress() {
    }

    public Adress(String cep){
        this.cep = cep;
    }

    public String getCep() {
        return cep;
    }

    @Override
    public String toString() {
        return "Adress [cep=" + cep + "]";
    }

    
    
}
