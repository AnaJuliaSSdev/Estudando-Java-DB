package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/adress")
public class AdressController {

    @Autowired
    GetAdressByCepService service;

    @GetMapping("/{cep}")
    public ResponseEntity<Adress> get(@PathVariable String cep) {
        var adress = service.execute(cep);

        return ResponseEntity.ok(adress);
    }

}
