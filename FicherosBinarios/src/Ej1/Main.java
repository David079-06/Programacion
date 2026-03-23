package Ej1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

		boolean salir = false;
		do {
			System.out.println("\n=== CONSEJO DE PROGRAMADORES DE CYL ===");
			System.out.println("1. Añadir un nuevo producto");
			System.out.println("2. Mostrar los productos con stock por debajo de un mínimo ");
			System.out.println("3. Actualizar votos de un candidato");
			System.out.println("4. Salir");
			System.out.print("Introduce una opción: ");

			int opcion = -1;
			boolean datosOK = false;
			while (!datosOK) {
				try {
					opcion = Integer.parseInt(leer.readLine());
					datosOK = true;
				} catch (NumberFormatException | IOException e) {
					System.err.println("Solo puedes introducir números.");
				}
			}

			switch (opcion) {
			case 1:
				System.out.println("-- AÑADIR PRODUCTO --");
				añadirProducto();
				break;
			case 2:
				System.out.println("-- BUSCAR POR PARTIDO --");
		
				break;
			case 3:
				System.out.println("-- ACTUALIZAR VOTOS --");
			
				break;
			case 4:
				System.out.println("Saliendo del programa. ¡Hasta pronto!");
				salir = true;
				break;
			default:
				System.out.println("Opción no válida. Introduce un número entre 1 y 4.");
			}

		} while (!salir);
	}
private static void añadirProducto ( ) throws IOException {
	Producto p = new Producto();
	p.pedirDatos();
	p.escribirFichero();
	System.out.println("Guardado correctamente: ");
}
}
