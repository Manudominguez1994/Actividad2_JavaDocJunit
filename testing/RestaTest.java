package testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RestaTest {

    @Test
    void restaDosReales() {
        double resultado = 5.5 - 2.2; // Resta de dos números reales
        assertEquals(3.3, resultado, "La resta de dos números reales debería dar el resultado correcto");
    }

    @Test
    void restaDosEnteros() {
        int resultado = 10 - 3; // Resta de dos enteros
        assertEquals(7, resultado, "La resta de dos enteros debería dar el resultado correcto");
    }

    @Test
    void restaTresReales() {
        double resultado = 10.5 - 4.3 - 1.2; // Resta de tres números reales
        assertEquals(5.0, resultado, "La resta de tres números reales debería dar el resultado correcto");
    }


    private double acumulador = 0;

    @Test
    void restarAcumulado() {
        acumulador -= 5; // Restamos 5 al acumulador
        assertEquals(-5, acumulador, "El acumulador debería ser -5 después de la primera resta");

        acumulador -= 3; // Restamos 3 más
        assertEquals(-8, acumulador, "El acumulador debería ser -8 después de la segunda resta");
    }

    @Test
    void resetAcumulador() {
        acumulador -= 10;  // Acumula -10
        assertEquals(-10, acumulador, "El acumulador debería ser -10 antes de resetear");

        // Resetear el acumulador
        acumulador = 0;

        assertEquals(0, acumulador, "El acumulador debería ser 0 después de resetear");
    }

    @Test
    void menu() {
    }
}