package com.candelaria.candebackend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.candelaria.candebackend.model.Compra;
import com.candelaria.candebackend.repository.CompraRepository;

@Service
public class CompraService {
    @Autowired
    private CompraRepository compraRepository;

    public List<Compra> obtenerTodasLasCompras() {
        return compraRepository.findAll();
    }

    public Compra obtenerCompraPorId(Long id) {
        Optional<Compra> compraOptional = compraRepository.findById(id);
        return compraOptional.orElse(null);
    }

    public Compra crearCompra(Compra compra) {
        return compraRepository.save(compra);
    }

    public Compra actualizarCompra(Long id, Compra compra) {
        if (compraRepository.existsById(id)) {
            compra.setId(id);
            return compraRepository.save(compra);
        }
        return null;
    }

    public void eliminarCompra(Long id) {
        compraRepository.deleteById(id);
    }
}