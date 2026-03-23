package ej7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class principal {
	static BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));


	public static void main(String[] args)throws NumberFormatException, IOException {
		
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

		ArrayList<consecionario> coches = new ArrayList<consecionario>();

		boolean salir = false;

		do {
			System.out.println("== GESTION INVENTARIO CONSECIONARIO==");
			System.out.println("1.Registrar vehículo");
			System.out.println("2.Mostrar todos");
			System.out.println("3.Realizar viaje");
			System.out.println("4.Aplicar descuento");
			System.out.println("5.Mostrar vehículos nuevos");
			System.out.println("6.Mostrar vehículo más antiguo");
			System.out.println("7.Salir");
			System.out.println("Introduce una opcion: ");
			int opcion = Integer.parseInt(leer.readLine());

			switch (opcion) {
			case 1:
				registrarcoche( coches);
				break;
			case 2:
				mostrarDatos( coches);
				break;
			case 3:
				Realizarviaje( coches);
				break;
			case 4:
				Aplicardescuento( coches);
				break;
			case 5:
				
				break;
			case 6:
				
				break;
			case 7:
				System.out.println("Saliendo...");
				salir = true;
				break;
			default:
				System.out.println("Opcion no valida");
			}

		} while (!salir);
	}
	
	private static void registrarcoche(ArrayList<consecionario> coches) throws IOException {
		boolean parar = false;
		System.out.println("--Registrar vehículo--");

		while (parar == false) {
			System.out.println("Introduce los datos del coche " + (coches.size() + 1));
			coches.add(new consecionario());
			coches.getLast().pedirDatos(coches.size());

			System.out.println("¿Desea registrar otro coche? (S/N)");
			char opcion = leer.readLine().toUpperCase().charAt(0);
			if (opcion == 'N')
				parar = true;
		}

	}
	private static void mostrarDatos(ArrayList<consecionario> coches) {
		System.out.println("--Listado de coches--");
		for (consecionario e : coches) {
			e.mostrarDatos();
		}
	}

	private static void Realizarviaje(ArrayList<consecionario> coches) {
		System.out.println("--Realizar viaje--");
		int id = -1;
		boolean todoOk = false;
		boolean enc = false;

		do {
			try {
				System.out.print("Introduce el id del coche que realiazara el viaje: ");
				id = Integer.parseInt(leer.readLine());
				todoOk = true;
			} catch (NumberFormatException | IOException e) {
				e.printStackTrace();
			}
		} while (todoOk != true);

		for (int i = 0; i < coches.size() && !enc; i++) {
			if (coches.get(i).getId() == id) {
				coches.get(i).mostrarDatos();
				enc = true;
			}
		}

		if (enc == false) {
			System.out.println("No se ha encontrado el coche con ese ID");
		}
	}
	private static void Aplicardescuento(ArrayList<consecionario> coches) throws NumberFormatException, IOException {
		System.out.println("--Aplicar descuento--");
		int id = -1;
		boolean todoOk = false;
		boolean enc = false;

		do {
			try {
				System.out.print("Introduce el id del coche al cual desea aplicar descuento: ");
				id = Integer.parseInt(leer.readLine());
				todoOk = true;
			} catch (NumberFormatException | IOException e) {
				e.printStackTrace();
			}
		} while (todoOk != true);

		for (int i = 0; i < coches.size() && !enc; i++) {
			if (coches.get(i).getId() == id) {
				coches.get(i).Descuento();
				
				enc = true;
			}
		}

		if (enc == false) {
			System.out.println("No se ha encontrado el coche con ese ID");
		}

		
	}


}
