package com.carros.api.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarroService {

	@Autowired
	CarroRepository repository;
	
	public Iterable<Carro> getCarros(){
		
		return repository.findAll();
	}

}
