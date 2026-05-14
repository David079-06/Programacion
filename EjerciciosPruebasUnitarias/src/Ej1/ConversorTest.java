package Ej1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class ConversorTest {
	private String cadenaValida;
    private String cadenaInvalida;
    private int valorEsperado;
	
	@BeforeEach
    void inicializar() { 
		cadenaValida = "100";
		cadenaInvalida= "hola_Mundo";
		valorEsperado = 100;
    }

	@Test
    void testConversionCorrecta() {
        int resultado = Conversor.convertirStringAInt(cadenaValida);
        assertEquals(valorEsperado, resultado, "Debería convertir correctamente el String a int");
    }
	@Test
    void testControlDeError() {
        assertThrows(NumberFormatException.class, () -> {
            Conversor.convertirStringAInt(cadenaInvalida);
        }, "Debe lanzar excepción si el string no es convertible");
    }
	
}
