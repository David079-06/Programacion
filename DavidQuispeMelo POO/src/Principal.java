import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Principal {
	public static void main(String[] args) throws IOException {
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
		
		  ArrayList<Pokemon> Pokedex = new ArrayList<Pokemon>();

		boolean salir = false;
		do {
			System.out.println("\n=== POKÉDEX DEL PROFESOR OAK ===");
			System.out.println("1. ¿¡Hazte con todos!? (Registrar nuevo Pokémon)");
			System.out.println("2. ¿Dónde están los de mi tipo? (Buscar Pokémon por tipo)");
			System.out.println("3. ¡Pikachu, usa POO! (Enseñar ataque)");
			System.out.println("4. ¡El Equipo Rocket gana! (Salir)");
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
				System.out.println("=== REGISTRAR NUEVO POKÉMON ===");
				RegristoPokemon(Pokedex);
			
				break;
			case 2:
				System.out.println("=== BUSCAR POKÉMON POR TIPO ===");
				BusquedaTipo(Pokedex);
				break;
			case 3:
				System.out.println("=== ENSEÑAR ATAQUE ===");
				// AQUÍ VA LA OPCIÓN 3
				// CREA UN MÉTODO
				break;
			case 4:
				System.out.println("¡El Equipo Rocket ha robado tu código! ¡Wobbuffet!");
				salir = true;
				break;
			default:
				System.out.println("Opción no válida");
			}

		} while (!salir);
	}
	
	private static void RegristoPokemon(ArrayList<Pokemon> Pokedex) throws IOException {
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));	
		boolean parar = false;
		while (parar == false) {
			System.out.println("-- Añadiendo Pokémon " + (Pokedex.size() + 1)+ "  --");
			Pokedex.add(new Pokemon());
			Pokedex.getLast().PedirDatos(Pokedex);
			System.out.println("¿Desea introducir otro pokemon? (S/N)");
			char opcion = leer.readLine().toUpperCase().charAt(0);
			if (opcion == 'N')
				parar = true;
		}

	}
	
	private static void BusquedaTipo(ArrayList<Pokemon> Pokedex) throws IOException {
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));	
		System.out.print("Introduce el tipo a buscar:");
        String tipo = leer.readLine();
        for (Pokemon e : Pokedex) {
            if (e.getTipo().equals(tipo)) {
                e.MostrarDatos();
               
            }
            
        }
        System.out.println("ERROR: El tipo hada todavía no ha sido añadido.\r\n"
        		+ "Solo fuego, agua, planta o eléctrico\r\n"
        		+ "");
	}
}
