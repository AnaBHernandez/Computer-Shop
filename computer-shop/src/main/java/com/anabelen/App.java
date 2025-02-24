package com.anabelen;

public class App {
    public static void main(String[] args) {
        Tienda tienda = crearTienda();

        Computador pc1 = crearComputador("Dell", 16, "Intel i7", "Windows 11", 1200.99);
        Computador pc2 = crearComputador("HP", 8, "AMD Ryzen 5", "Windows 10", 899.99);

        tienda.agregarComputador(pc1);
        tienda.agregarComputador(pc2);

        mostrarComputadores(tienda);

        buscarComputador(tienda, "HP");

        eliminarComputador(tienda, "Dell");
        mostrarComputadores(tienda);
    }

    static Tienda crearTienda() {
        return new Tienda("Computers Shop", "Ana Belén", "12345678");
    }

    private static Computador crearComputador(String marca, int memoria, String procesador, String sistemaOperativo, double precio) {
        return new Computador(marca, memoria, procesador, sistemaOperativo, precio);
    }

    private static void mostrarComputadores(Tienda tienda) {
        System.out.println("Lista de Computadores en la Tienda:");
        System.out.println(tienda.listarComputadores());
    }

    private static void buscarComputador(Tienda tienda, String marca) {
        System.out.println("Buscando una computadora " + marca + ":");
        System.out.println(tienda.buscarComputador(marca));
    }

    private static void eliminarComputador(Tienda tienda, String marca) {
        System.out.println("Eliminando la computadora " + marca + ":");
        tienda.eliminarComputador(marca);
    }
}
