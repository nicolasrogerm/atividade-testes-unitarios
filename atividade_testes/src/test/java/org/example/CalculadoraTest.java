package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculadoraTest {

    @Test
    void deveCalcularASomaCorretamente() {
        Calculadora calculadora = new Calculadora();
        double a = 2;
        double b = 3;

        double resultado = calculadora.somar(a,b);

        assertEquals(5, resultado);
    }

    @Test
    void deveCalcularASubtracao() {
        Calculadora calculadora = new Calculadora();
        double a = 5;
        double b = 2;

        double resultado = calculadora.subtrair(a,b);

        assertEquals(3, resultado);
    }

    @Test
    void deveCalcularAMultiplicacaoCorretamente() {
        Calculadora calculadora = new Calculadora();
        double a = 4;
        double b = 3;

        double resultado = calculadora.multiplicar(a,b);

        assertEquals(12, resultado);
    }

    @Test
    void deveCalcularADivisaoCorretamente() {
        Calculadora calculadora = new Calculadora();
        double a = 10;
        double b = 2;

        double resultado = calculadora.dividir(a,b);

        assertEquals(5, resultado);
    }

    @Test
    void deveFalharAoDividirPor0() {
        Calculadora calculadora = new Calculadora();
        double a = 10;
        double b = 0;

        double resultado = calculadora.dividir(a,b);

        assertEquals(0, resultado);
    }

    @Test
    void deveCalcularNumerosNegativosCorretamente() {
        Calculadora calculadora = new Calculadora();
        double a = -2;
        double b = 3;

        double resultado = calculadora.somar(a,b);

        assertEquals(1, resultado);
    }

    @Test
    void deveMultiplicarNumerosDecimaisCorretamente() {
        Calculadora calculadora = new Calculadora();
        double a = 2.5;
        double b = 2;

        double resultado = calculadora.multiplicar(a,b);

        assertEquals(5, resultado);
    }
}