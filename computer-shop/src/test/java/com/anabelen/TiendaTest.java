package com.anabelen;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class TiendaTest {
    private Tienda tienda;
    @BeforeEach
    void setUp() {
        tienda = new Tienda("Mi Tienda", "Juan Pérez", "12345");
    }

    @Test
    void testAgregarComputador() {
        Computador comp = new Computador("Dell", 8, "Intel i5", "Windows 10", 999.99);
        tienda.agregarComputador(comp);

        assertEquals(1, tienda.listarComputadores().size());
        assertTrue(tienda.listarComputadores().contains(comp));
    }

    @Test
    void testEliminarComputador() {
        Computador comp = new Computador("HP", 16, "AMD Ryzen 7", "Windows 11", 1299.99);
        tienda.agregarComputador(comp);

        assertTrue(tienda.eliminarComputador("HP"));
        assertEquals(0, tienda.listarComputadores().size());
    }

    @Test
    void testEliminarComputadorNoExistente() {
        Computador comp = new Computador("HP", 16, "AMD Ryzen 7", "Windows 11", 1299.99);
        tienda.agregarComputador(comp);

        assertFalse(tienda.eliminarComputador("Dell"));
        assertEquals(1, tienda.listarComputadores().size());
    }

    @Test
    void testBuscarComputador() {
        Computador comp = new Computador("Lenovo", 32, "Intel i9", "Ubuntu", 1599.99);
        tienda.agregarComputador(comp);

        assertNotNull(tienda.buscarComputador("Lenovo"));

        assertNull(tienda.buscarComputador("Asus"));
    }

    @Test
    void testListarComputadores() {
        Computador comp1 = new Computador("Apple", 16, "M1", "macOS", 1299.99);
        Computador comp2 = new Computador("Acer", 8, "Intel i3", "Windows 10", 599.99);
        tienda.agregarComputador(comp1);
        tienda.agregarComputador(comp2);

        List<Computador> lista = tienda.listarComputadores();
        assertEquals(2, lista.size());
        assertTrue(lista.contains(comp1));
        assertTrue(lista.contains(comp2));
    }

    @Test
    void testPrecioNegativo() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Computador("Dell", 8, "Intel i5", "Windows 10", -1000.00);
        });
    }
}
