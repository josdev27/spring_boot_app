package com.josdev27.sample.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.josdev27.sample.domain.Saludo;
import com.josdev27.sample.repository.SaludoRepository;
import com.josdev27.sample.service.DemoService;

@Service
@Profile("db")
public class DemoServiceDbImpl implements DemoService {

    @Autowired
    private SaludoRepository saludoRepository;
    
    @Override
    public String getRandomHello(String name) {
        List<Saludo> saludos = saludoRepository.findAll();
        Saludo saludo = saludos.stream().findAny().orElseGet(() -> new Saludo("Hello"));
        return saludo.getSaludo() + ", " + name;
    }

}
