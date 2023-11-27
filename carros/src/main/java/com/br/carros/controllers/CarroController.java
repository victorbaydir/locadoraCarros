package com.br.carros.controllers;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.br.carros.dtos.CarroRecordDTO;
import com.br.carros.models.CarroModel;
import com.br.carros.repositories.CarroRepository;

import jakarta.validation.Valid;

@RestController
public class CarroController {

	@Autowired
	CarroRepository carroRepository;
	
	@GetMapping("")
    public ModelAndView productForm() {
        return new ModelAndView("index.xhtml");
    }
	
	@PostMapping("/carro")
	public ResponseEntity<CarroModel>  salvar(@RequestBody @Valid CarroRecordDTO carroRecordDTO) {
		CarroModel carroModel = new CarroModel();
		BeanUtils.copyProperties(carroRecordDTO, carroModel);
		return ResponseEntity.status(HttpStatus.OK).body(carroRepository.save(carroModel));
	}
}
