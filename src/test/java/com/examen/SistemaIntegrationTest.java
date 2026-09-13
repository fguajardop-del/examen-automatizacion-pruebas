package com.examen;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SistemaIntegrationTest {

    @Test
    void testFlujoIntegradoCalculadora() {
        CalculadoraService calculadora = new CalculadoraService();

        int resultadoSuma = calculadora.sumar(10, 20);
        assertEquals(30, resultadoSuma);

        int resultadoFinal = calculadora.restar(resultadoSuma, 5);
        assertEquals(25, resultadoFinal);

        assertFalse(calculadora.esNumeroPar(resultadoFinal));
    }
}
