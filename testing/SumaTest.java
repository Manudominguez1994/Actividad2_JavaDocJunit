package testing;

import javabean.Suma;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SumaTest {

    // Test de suma de dos números reales
    @Test
    void sumaDosReales() {
        assertEquals(5.0, Suma.sumaDosReales(2.0, 3.0));  // Casos positivos
        assertEquals(-5.0, Suma.sumaDosReales(-2.0, -3.0)); // Casos negativos
        assertEquals(0.0, Suma.sumaDosReales(-2.0, 2.0));  // Caso con 0
    }

    // Test de suma de dos números enteros
    @Test
    void sumaDosEnteros() {
        assertEquals(5, Suma.sumaDosEnteros(2, 3));  // Casos positivos
        assertEquals(-5, Suma.sumaDosEnteros(-2, -3)); // Casos negativos
        assertEquals(0, Suma.sumaDosEnteros(-2, 2));  // Caso con 0
    }

    // Test de suma de tres números reales
    @Test
    void sumaTresReales() {
        assertEquals(6.0, Suma.sumaTresReales(1.0, 2.0, 3.0));  // Casos positivos
        assertEquals(-6.0, Suma.sumaTresReales(-1.0, -2.0, -3.0)); // Casos negativos
        assertEquals(0.0, Suma.sumaTresReales(-1.0, 1.0, 0.0));  // Caso con 0
    }

    // Test de acumulador
    @Test
    void acumulador() {
        Suma suma = new Suma();
        assertEquals(5.0, suma.acumulador(5.0));  // Suma inicial
        assertEquals(10.0, suma.acumulador(5.0)); // Suma acumulada
        assertEquals(10.0, suma.acumulador(-5.0));  // No se debe sumar si es negativo
    }

    // Test de reset del acumulador
    @Test
    void resetAcumulador() {
        Suma suma = new Suma();
        suma.acumulador(10.0);  // Se acumula un valor
        assertEquals(10.0, suma.acumulador(0));  // Comprobamos que el valor se acumula
        suma.resetAcumulador();
        assertEquals(0.0, suma.acumulador(0));  // Comprobamos que el acumulador se reseteó
    }

    // Test del menú
    @Test
    void menuSuma() {

        assertDoesNotThrow(() -> Suma.menu());
    }
}
