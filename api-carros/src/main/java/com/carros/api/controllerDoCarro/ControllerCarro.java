package com.carros.api.controllerDoCarro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carros.api.domain.Carro;
import com.carros.api.domain.CarroService;

	@RestController
	@RequestMapping("/api/v1/carros")
	public class ControllerCarro {
	
		@Autowired
		CarroService carroService;
			
		@GetMapping
		public Iterable<Carro> getCarros(){
			
			return carroService.getCarros();
			
		}		
	}
