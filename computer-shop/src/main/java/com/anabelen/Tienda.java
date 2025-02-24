package com.anabelen;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private String nombre;
    private String propietario;
    private String idTributario;
    private List<Computador> computadores;

    public Tienda(String nombre, String propietario, String idTributario) {
        this.nombre = nombre;
        this.propietario = propietario;
        this.idTributario = idTributario;
        this.computadores = new ArrayList<>();
    }
    
    public boolean eliminarComputador(String marca) {
        return computadores.removeIf(c -> c.getMarca().equalsIgnoreCase(marca));
    }

    public Computador buscarComputador(String marca) {
        return computadores.stream()
                .filter(c -> c.getMarca().equalsIgnoreCase(marca))
                .findFirst()
                .orElse(null);
    }
    public void agregarComputador(Computador computador) {
        if (computador == null) {
            throw new IllegalArgumentException("El computador no puede ser nulo");
        }
        computadores.add(computador);
    }
    
    public List<Computador> listarComputadores() {
        return new ArrayList<>(computadores);
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getPropietario() {
        return propietario;
    }

    public String getIdTributario() {
        return idTributario;
    }

    public List<Computador> getComputadores() {
        return computadores;
    }
}
