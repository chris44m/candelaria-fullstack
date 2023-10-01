package com.candelaria.candebackend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.candelaria.candebackend.model.Asiento;
import com.candelaria.candebackend.repository.AsientoRepository;

@Service
public class AsientoService {
    @Autowired
    private AsientoRepository asientoRepository;

    public List<Asiento> obtenerAsientosDisponibles() {
        return asientoRepository.findByDisponibleTrue();
    }

    public Asiento obtenerAsientoPorId(Long id) {
        Optional<Asiento> asientoOptional = asientoRepository.findById(id);
        return asientoOptional.orElse(null);
    }

    public Asiento crearAsiento(Asiento asiento) {
        return asientoRepository.save(asiento);
    }

    public Asiento actualizarAsiento(Long id, Asiento asiento) {
        if (asientoRepository.existsById(id)) {
            asiento.setId(id);
            return asientoRepository.save(asiento);
        }
        return null;
    }

    public void eliminarAsiento(Long id) {
        asientoRepository.deleteById(id);
    }
}