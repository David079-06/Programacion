package Ej16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import Ej2.Trabajador;

public class main {
	static BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) {
		
ArrayList<Deportista> deportistas = new ArrayList<Deportista>();
		
		boolean salir = false;
		do {
			System.out.println("\n=== PLANTILLA TRABAJADORES ===");
			System.out.println("1. Añadir empleado completo");
			System.out.println("2. Añadir empledo temporal");
			System.out.println("3. Calcular salario");
			System.out.println("4. Mostrar todos los datos");
			System.out.print("Introduce una opción: ");

			int opcion = -1;
			boolean datosOK = false;
			while (!datosOK) {
				try {
					opcion = Integer.parseInt(leer.readLine());
					datosOK = true;
				} catch (NumberFormatException | IOException e) {
					System.err.println("Solo puedes introducir números");
				}
			}

			switch (opcion) {
			case 1:
			
				break;
			case 2:
			
			
				break;
			case 3:
		
				break;
			case 4:
				
				salir = true;
				break;
			default:
				System.out.println("Opción no válida");
			}

		} while (!salir);
	}
	
}
