package testing;

import javabean.Suma;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SumaTest {

    // Test de suma de dos números reales
    @Test
    void sumaDosReales() {
        assertEquals(5.0, Suma.sumaDosReales(2.0, 3.0));
        assertEquals(-5.0, Suma.sumaDosReales(-2.0, -3.0));
        assertEquals(0.0, Suma.sumaDosReales(-2.0, 2.0));
    }

    // Test de suma de dos números enteros
    @Test
    void sumaDosEnteros() {
        assertEquals(5, Suma.sumaDosEnteros(2, 3));
        assertEquals(-5, Suma.sumaDosEnteros(-2, -3));
        assertEquals(0, Suma.sumaDosEnteros(-2, 2));
    }

    // Test de suma de tres números reales
    @Test
    void sumaTresReales() {
        assertEquals(6.0, Suma.sumaTresReales(1.0, 2.0, 3.0));
        assertEquals(-6.0, Suma.sumaTresReales(-1.0, -2.0, -3.0));
        assertEquals(0.0, Suma.sumaTresReales(-1.0, 1.0, 0.0));
    }

    // Test de acumulador
    @Test
    void acumulador() {
        Suma suma = new Suma();
        assertEquals(5.0, suma.acumulador(5.0));
        assertEquals(10.0, suma.acumulador(5.0));
        assertEquals(10.0, suma.acumulador(-5.0));
    }

    // Test de reset del acumulador
    @Test
    void resetAcumulador() {
        Suma suma = new Suma();
        suma.acumulador(10.0);
        assertEquals(10.0, suma.acumulador(0));
        suma.resetAcumulador();
        assertEquals(0.0, suma.acumulador(0));
    }


}
