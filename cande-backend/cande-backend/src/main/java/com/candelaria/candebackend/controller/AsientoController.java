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

import com.candelaria.candebackend.model.Asiento;
import com.candelaria.candebackend.repository.AsientoRepository;
import com.candelaria.candebackend.service.AsientoService;

@RestController
@RequestMapping("/asientos")
public class AsientoController {
    @Autowired
    private AsientoService asientoService;
    private AsientoRepository asientoRepository;

    @GetMapping("/asiento")
    public List<Asiento> getAllAsientos() {
        return asientoRepository.findAll();
    }

    @GetMapping("/{id}")
    public Asiento obtenerAsientoPorId(@PathVariable Long id) {
        return asientoService.obtenerAsientoPorId(id);
    }

    @PostMapping
    public Asiento crearAsiento(@RequestBody Asiento asiento) {
        return asientoService.crearAsiento(asiento);
    }

    @PutMapping("/{id}")
    public Asiento actualizarAsiento(@PathVariable Long id, @RequestBody Asiento asiento) {
        return asientoService.actualizarAsiento(id, asiento);
    }

    @DeleteMapping("/{id}")
    public void eliminarAsiento(@PathVariable Long id) {
        asientoService.eliminarAsiento(id);
    }
}
