package com.examen;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraUnitTest {

    private final CalculadoraService calculadora = new CalculadoraService();

    @Test
    void testSumaExitosa() {
        assertEquals(5, calculadora.sumar(2, 3), "La suma debe ser 5");
    }

    @Test
    void testEsNumeroPar() {
        assertTrue(calculadora.esNumeroPar(4), "El número 4 debe ser par");
        assertFalse(calculadora.esNumeroPar(5), "El número 5 no debe ser par");
    }
}