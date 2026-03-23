package EJ2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	static BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) {
		
		boolean salir = false;
		do {
			System.out.println("\n=== BASE DE DATOS FUMIGACION ===");
			System.out.println("1.Generar ficheros granjeros");
			System.out.println("2.Calcular factura");
			System.out.println("3.Salir");
			
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
				System.out.println("=== GENERAR FICHERO GRANJEROS ===");
				generarFichero ();
				break;
			case 2:
				System.out.println("=== CALCULAR FACTURA ===");
				 calcularFactura();
				break;
			case 3:
				System.out.println("¡HYDRA se ha infiltrado en el sistema! ");
				salir = true;
				break;
			default:
				System.out.println("Opción no válida");
			}

		} while (!salir);
	}

	
	private static  Granjero generarFichero ( ) {
		Granjero g = new Granjero ();
		g.pedirDatos();
		g.guardarGranjero();
		return g;
	}
	
	private static double calcularFactura(){
	    double precio = 0;


	    for (String tipo : ) {
	        switch (tipo.toLowerCase()) {
	            case "malas hierbas":
	                precio += 18;
	                break;
	            case "langostas":
	                precio += 32;
	                break;
	            case "gusanos":
	                precio += 54;
	                break;
	            case "todo lo anterior":
	                precio += 92;
	                break;
	        }
	    }
	    return precio* g.getM2();
	}
	
}