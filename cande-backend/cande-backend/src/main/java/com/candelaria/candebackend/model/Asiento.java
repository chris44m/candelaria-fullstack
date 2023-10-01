package com.candelaria.candebackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Asiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numero;

    private double precio;

    private boolean disponible;

    public Asiento(Long id, String numero, double precio, boolean disponible) {
        this.id = id;
        this.numero = numero;
        this.precio = precio;
        this.disponible = disponible;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    // Método para calcular el precio de un conjunto de asientos
    public double calcularPrecio(int cantidadAsientos) {
        if (cantidadAsientos <= 0) {
            throw new IllegalArgumentException("La cantidad de asientos debe ser mayor que cero.");
        }

        return precio * cantidadAsientos;
    }

}