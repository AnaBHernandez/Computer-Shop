package com.anabelen;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ComputadorTest {
    private Computador computador;

    @BeforeEach
    void setUp() {
        computador = new Computador("Dell", 8, "Intel i5", "Windows 10", 999.99);
    }

    @Test
    void testGetters() {
        assertEquals("Dell", computador.getMarca());
        assertEquals(8, computador.getMemoria());
        assertEquals("Intel i5", computador.getProcesador());
        assertEquals("Windows 10", computador.getSistemaOperativo());
        assertEquals(999.99, computador.getPrecio());
    }

    @Test
    void testSetters() {
        computador.setMarca("HP");
        computador.setMemoria(16);
        computador.setProcesador("AMD Ryzen 7");
        computador.setSistemaOperativo("Windows 11");
        computador.setPrecio(1299.99);

        assertEquals("HP", computador.getMarca());
        assertEquals(16, computador.getMemoria());
        assertEquals("AMD Ryzen 7", computador.getProcesador());
        assertEquals("Windows 11", computador.getSistemaOperativo());
        assertEquals(1299.99, computador.getPrecio());
    }

    @Test
    void testToString() {
        String expected = "Computador{marca='Dell', memoria=8, procesador='Intel i5', sistemaOperativo='Windows 10', precio=999.99}";
        assertEquals(expected, computador.toString());
    }

    @Test
    void testPrecio() {
        computador.setPrecio(1500.00);
        assertEquals(1500.00, computador.getPrecio());

        assertThrows(IllegalArgumentException.class, () -> {
            computador.setPrecio(-100.00);
        });
    }
}
