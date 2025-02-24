package com.anabelen;

public class Computador {
    private String marca;
    private int memoria;
    private String procesador;
    private String sistemaOperativo;
    private double precio;

    public Computador(String marca, int memoria, String procesador, String sistemaOperativo, double precio) {
        this.marca = marca;
        this.memoria = memoria;
        this.procesador = procesador;
        this.sistemaOperativo = sistemaOperativo;
        this.precio = precio;

    if (precio < 0) {
        throw new IllegalArgumentException("El precio no puede ser negativo");
    }
    }

    // Getters
    public String getMarca() { return marca; }
    public int getMemoria() { return memoria; }
    public String getProcesador() { return procesador; }
    public String getSistemaOperativo() { return sistemaOperativo; }
    public double getPrecio() { return precio; }

    // Setters
    public void setMarca(String marca) { this.marca = marca; }
    public void setMemoria(int memoria) { this.memoria = memoria; }
    public void setProcesador(String procesador) { this.procesador = procesador; }
    public void setSistemaOperativo(String sistemaOperativo) { this.sistemaOperativo = sistemaOperativo; }
    public void setPrecio(double precio) {
        if (precio < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo");
        }
        this.precio = precio;
    }


    @Override
    public String toString() {
        return "Computador{" +
                "marca='" + marca + '\'' +
                ", memoria=" + memoria +
                ", procesador='" + procesador + '\'' +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                ", precio=" + precio +
                '}';
    }
}
