package com.candelaria.candebackend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.candelaria.candebackend.model.Asiento;

public interface AsientoRepository extends JpaRepository<Asiento, Long> {

    List<Asiento> findByDisponibleTrue();

    // Consulta para obtener asientos por número
    Asiento findByNumero(String numero);

}
