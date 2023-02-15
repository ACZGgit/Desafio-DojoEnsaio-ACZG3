package Services;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    static Calculadora calculadora;

    @BeforeAll
    static void instanciaDietaService(){
        calculadora = new Calculadora();
    }

    @Test
    void getLastResult() {
    }

    @Test
    void setLastResult() {

    }

    @Test
    void sum() {
        double result = calculadora.sum(2,2);
        assertEquals(4, result);
    }

    @Test
    void raizQuadrada() {
        double result = calculadora.raizQuadrada(4);
        assertEquals(2, result);
    }

    @Test
    void sub() {
        double result = calculadora.sub(2,3);
        assertEquals(-1, result);
    }

    @Test
    void div() {
        double result = calculadora.div(5,5);
        assertEquals(1, result);
    }

    @Test
    void mult() {
        double result = calculadora.mult(5,5);
        assertEquals(25, result);
    }
}