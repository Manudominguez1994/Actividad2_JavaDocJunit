package testing;

import javabean.Multiplicacion;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class MultiplicacionTest {
    
    private Multiplicacion multiplicacion;

    @BeforeEach
    void setUp() {
        multiplicacion = new Multiplicacion();
    }

    /**
     * Prueba el método multiDosReales con valores positivos.
     */
    @Test
    void testMultiDosReales() {
        assertEquals(6.0, Multiplicacion.multiDosReales(2.0, 3.0));
        assertEquals(0.0, Multiplicacion.multiDosReales(0.0, 3.0));
    }
    
    /**
     * Prueba el método multiDosEnteros con valores positivos.
     */
    @Test
    void testMultiDosEnteros() {
        assertEquals(6, Multiplicacion.multiDosEnteros(2, 3));
        assertEquals(0, Multiplicacion.multiDosEnteros(0, 3));
    }
    
    /**
     * Prueba el método multiTresReales con valores positivos.
     */
    @Test
    void testMultiTresReales() {
        assertEquals(24.0, Multiplicacion.multiTresReales(2.0, 3.0, 4.0));
        assertEquals(0.0, Multiplicacion.multiTresReales(0.0, 3.0, 4.0));
    }
    
    /**
     * Prueba el método acumulador con valores positivos.
     */
    @Test
    void testAcumulador() {
        assertEquals(0.0, multiplicacion.acumulador(5.0));
    }
    
    /**
     * Prueba el método resetAcumulador para asegurar que el acumulador se reinicia.
     */
    @Test
    void testResetAcumulador() {
        multiplicacion.acumulador(5.0);
        assertEquals(0.0, multiplicacion.resetAcumulador());
    }
}
