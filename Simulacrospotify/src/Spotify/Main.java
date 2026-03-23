package Spotify;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	static BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		
		
		boolean salir = false;
		do {
			System.out.println("\t--Introduce los datos del nuevo contenido--");
			System.out.println("\n===  GESTIÓN DE PLAYLISTS ===");
			System.out.println("1. Añadir contenido");
			System.out.println("2. Mostrar contenido por categoría");
			System.out.println("3. Añadir contenido a playlist");
			System.out.println("4. Estadísticas del perfil");
			System.out.println("5. Salir");
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
				System.out.println("=== Añadir contenido ===");
		
				break;
			case 2:
				System.out.println("=== Mostrar contenido por categoría ===");
				
				break;
			case 3:
				System.out.println("===  Añadir contenido a playlist ===");
				
				break;
			case 4:
				System.out.println("===  Estadísticas del perfil  ===");
				;
				break;
			case 5:
				System.out.println("¡Que disfrutes de tu música!");
				salir = true;
				break;
			default:
				System.out.println("Opción no válida");
			}

		} while (!salir);
	}
	
}