
import java.io.*;




public class Principal {
	public static void main(String[] args) throws IOException {
		boolean salir = false;
		do {
			System.out.println("\n=== AMONG US - GESTIÓN DE PARTIDAS ===");
			System.out.println("1. Registrar nuevo jugador");
			System.out.println("2. Registrar nueva partida");
			System.out.println("3. Ver estadísticas de un jugador");
			System.out.println("4. Exportar informe de partidas");
			System.out.println("5. Salir");

			int opcion = Lecturas.leerEnteroEnRango("Introduce una opción: ", 1, 5);

			switch (opcion) {
			case 1:
				System.out.println("=== REGISTRAR NUEVO JUGADOR ===");
				registrarNuevoJugador();
				break;
			case 2:
				System.out.println("=== REGISTRAR NUEVA PARTIDA ===");
				
				break;
			case 3:
				System.out.println("=== ESTADÍSTICAS DE JUGADOR ===");
				
				break;
			case 4:
				System.out.println("=== EXPORTAR INFORME ===");
			
				break;
			case 5:
				System.out.println("Saliendo... ¡Sus tareas eran falsas!");
				salir = true;
				break;
			}
		} while (!salir);
	}

	
	private static void registrarNuevoJugador( ) throws IOException {
		File FICHERO_JUGADORES = new File("jugadores.txt");
		Jugador j = new Jugador();
		j.pedirDatos();
		j.escribirJugador(FICHERO_JUGADORES, true);
		System.out.println("Jugador registrado correctamente.");
	}
	
}