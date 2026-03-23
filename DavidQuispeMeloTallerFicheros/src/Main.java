import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main {
			static BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

			public static void main(String[] args) throws IOException {
			
				boolean salir = false;
				do {
					System.out.println("\n=== BASE DE DATOS RESEÑAS ===");
					System.out.println("1.Añadir una nueva actividad. ");
					System.out.println("2.Buscar actividades por sección ");
					System.out.println("3.Realizar una inscripción");
					System.out.println("4.Salir");       
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
						System.out.println("=== AÑADIR NUEVA ACTIVIDAD ===");
						añadirActividad();
						break;
					case 2:
						System.out.println("=== MOSTRAR LISTADO ===");
						
						break;
					case 3:
						System.out.println("=== EXPORTAR RESEÑAS DE UN JUGADOR ===");
						
						break;
					case 4:
						System.out.println("Salir ");
						salir = true;
						break;
					default:
						System.out.println("Opción no válida");
					}

				} while (!salir);
			
			}
			
	
			private static void añadirActividad() throws IOException {
				Actividad r = new Actividad();
				r.pedirDatos();
				r.escribirActividad();

			}
}
