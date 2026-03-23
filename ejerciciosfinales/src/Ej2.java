import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej2 {

	public static void main(String[] args) throws NumberFormatException, 
	IOException{

		boolean salir = false;
		do {
			
			System.out.println("\n--- MENÚ PRINCIPAL ---");
			System.out.println("1. Calcular precio de entrada según edad (adulto 8 €, niño 5 €, jubilado 6 €)");
			System.out.println("2. Calcular precio con descuento de miércoles (50%).");
			System.out.println("3. Calcular precio de un combo palomitas + refresco (5 € extra)");
			int opcion = leerint("Elige una opción: ");
			switch (opcion) {
			case 1:
			
			break;
			case 2:
			
			break;	
			case 3:
			salir = true;
			System.out.println("¡Hasta luego!");
			break;
			default:
			System.out.println("Opción no válida");
			}
			}while(!salir);
				
	

	}

}
