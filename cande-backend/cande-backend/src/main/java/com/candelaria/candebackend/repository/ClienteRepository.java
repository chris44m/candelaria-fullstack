package com.candelaria.candebackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.candelaria.candebackend.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
