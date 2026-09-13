package com.examen;

public class CalculadoraService {

    public int sumar(int a, int b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;
    }

    public boolean esNumeroPar(int numero) {
        return numero % 2 == 0;
    }
}