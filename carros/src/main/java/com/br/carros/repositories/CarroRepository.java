package com.br.carros.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.carros.models.CarroModel;

public interface CarroRepository extends JpaRepository<CarroModel, UUID>{

}
