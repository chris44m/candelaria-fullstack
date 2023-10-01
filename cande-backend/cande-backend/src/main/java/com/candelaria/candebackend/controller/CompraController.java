package com.candelaria.candebackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.candelaria.candebackend.model.Compra;
import com.candelaria.candebackend.service.CompraService;

@RestController
@RequestMapping("/compras")
public class CompraController {
    @Autowired
    private CompraService compraService;

    @GetMapping
    public List<Compra> obtenerTodasLasCompras() {
        return compraService.obtenerTodasLasCompras();
    }

    @GetMapping("/{id}")
    public Compra obtenerCompraPorId(@PathVariable Long id) {
        return compraService.obtenerCompraPorId(id);
    }

    @PostMapping
    public Compra crearCompra(@RequestBody Compra compra) {
        return compraService.crearCompra(compra);
    }

    @PutMapping("/{id}")
    public Compra actualizarCompra(@PathVariable Long id, @RequestBody Compra compra) {
        return compraService.actualizarCompra(id, compra);
    }

    @DeleteMapping("/{id}")
    public void eliminarCompra(@PathVariable Long id) {
        compraService.eliminarCompra(id);
    }
}