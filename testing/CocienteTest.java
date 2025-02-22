package testing;

import javabean.Cociente;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CocienteTest {

    // Test de división de dos números reales
    @Test
    void CocienteDosReales() {
    	assertEquals(3.0, Cociente.dividirReales(6.0, 2.0));  // Resultado Postitivo
    	assertEquals(0.0, Cociente.dividirReales(0.0, 3.0));  // 0 dividido entre cualquier número debería dar 0
        assertEquals(Double.NaN, Cociente.dividirReales(0.0, 0.0)); // División 0 entre 0 debería dar NaN
        assertEquals(-1.0, Cociente.dividirReales(-2.0, 2.0));  // -2 dividido entre 2 debería dar -1
    }

    // Test de division de dos números enteros
    @Test
    void CocienteDosEnteros() {
    	assertEquals(3, Cociente.dividirEnteros(6, 2));  // Resultado Postitivo
    	assertEquals(0, Cociente.dividirEnteros(0, 3));  // 0 dividido entre cualquier número debería dar 0
        assertEquals(Double.NaN, Cociente.dividirEnteros(0, 0)); // División 0 entre 0 debería dar NaN
        assertEquals(-1, Cociente.dividirEnteros(-2, 2));  // -2 dividido entre 2 debería dar -1
        
    }
    
    // Test inverso
    @Test
    void inverso() {
        assertEquals(0.5, Cociente.inverso(2.0));  // Resultado postivo
        assertEquals(-0.5, Cociente.inverso(-2.0)); // Resultado Negativo
        assertEquals(Double.POSITIVE_INFINITY, Cociente.inverso(0.0));  // El inverso de 0.0 debe ser infinito positivo
    }

    // Test de reset del acumulador
    @Test
    void raiz() {
        assertEquals(2.4495, Cociente.raiz(6.0), 0.0001);  // resultado Negativo
        assertEquals(Double.NaN, Cociente.raiz(-6.0));      // Resultado Positivo
    }

    

    // Test del menú
    @Test
    void menuCociente() {

        assertDoesNotThrow(() -> Cociente.menu());
    }
}
