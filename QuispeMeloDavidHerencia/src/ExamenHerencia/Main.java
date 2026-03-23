package ExamenHerencia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
	static BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) {
		

ArrayList<Personaje> personajes = new ArrayList<>();
	

		boolean salir = false;
		do {
			System.out.println("\n=== BASE DE DATOS SHIELD ===");
			System.out.println("1. ¡Vengadores, reuníos! (Registrar Personaje)");
			System.out.println("2. Yo soy Iron Man (Filtrar Héroes por Identidad Secreta)");
			System.out.println("3. Misión 616 (Enfrentamiento)");
			System.out.println("4. HYDRA (Salir)");
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
				System.out.println("=== REGISTRAR PERSONAJE  ===");
				registrarPersonaje(personajes) ;
				
				break;
			case 2:
				System.out.println("=== HÉROES CON IDENTIDAD SECRETA  ===");
				filtroIndentidad(personajes);
				// CREA UN MÉTODO
				break;
			case 3:
				System.out.println("=== BATALLA ÉPICA  ===");
				// AQUÍ VA LA OPCIÓN 3
				// CREA UN MÉTODO
				break;
			case 4:
				System.out.println("¡HYDRA se ha infiltrado en el sistema! ");
				salir = true;
				break;
			default:
				System.out.println("Opción no válida");
			}

		} while (!salir);
	}
	private static void registrarPersonaje(ArrayList<Personaje> personajes) {

		boolean datosOK = false;
		String tipoPersonaje = "";
		while (!datosOK) {

			try {

				do {
					System.out.println("Elige tipo de personaje (Héroe o Villano):");
					tipoPersonaje = leer.readLine();
					if (!tipoPersonaje.equalsIgnoreCase("Heroe") && !tipoPersonaje.equalsIgnoreCase("Villano"))
						System.out.println("Tienes que introducir un tipo valido");
				} while (!tipoPersonaje.equalsIgnoreCase("Heroe") && !tipoPersonaje.equalsIgnoreCase("Villano"));

				datosOK = true;
			} catch (IOException e) {
				System.out.println("¡ERROR! Solo puede ser Héroe o Villano");
				e.printStackTrace();
			}

		}

		if (tipoPersonaje.equalsIgnoreCase("Heroe")) {
			Heroe heroe = new Heroe();
			heroe.pedirDatos(personajes);
			personajes.add(heroe);
		} else {
			Villano villano = new Villano();
			villano.pedirDatos(personajes);
			personajes.add(villano);
		}

	}
	
	private static void filtroIndentidad(ArrayList<Personaje> personajes) {
		for (Personaje p : personajes) {
			if (p instanceof Heroe && ((Heroe) p).isIdentidad()==true) {
				((Heroe) p).mostrarDatos();
			}else {
				System.out.println("No se encontraron héroes con\r\n"
						+ "identidad secreta\r\n"
						+ "");
			}
		}

	}
}




