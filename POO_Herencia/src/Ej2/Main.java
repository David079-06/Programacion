package Ej2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	static BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		ArrayList<Trabajador> empleados = new ArrayList<Trabajador>();
		
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
				System.out.println("=== Añadir empleado completo ===");
				añadirEmpleadoCompleto(empleados);
				break;
			case 2:
				System.out.println("=== Añadir empledo temporal ===");
				añadirEmpleadoTemporal(empleados);
				break;
			case 3:
				System.out.println("=== Calcular salario ===");
				CalcularSalario(empleados);
				break;
			case 4:
				System.out.println("Mostrat todos los datos");
				salir = true;
				break;
			default:
				System.out.println("Opción no válida");
			}

		} while (!salir);
	}

	private static void añadirEmpleadoCompleto(ArrayList<Trabajador> empleados) {
		int id = 1;
		if (empleados.size() > 0)
			id = empleados.getLast().getId() + 1;
		TrabajadorCompleto trabajadorComp = new TrabajadorCompleto();
		trabajadorComp.pedirDatos(id);
		empleados.add(trabajadorComp);

	}
	private static void añadirEmpleadoTemporal(ArrayList<Trabajador> empleados) {
		int id = 1;
		if (empleados.size() > 0)
			id = empleados.getLast().getId() + 1;
		TrabajadorTemporal trabajadorTemp = new TrabajadorTemporal();
		trabajadorTemp.pedirDatos(id);
		empleados.add(trabajadorTemp);

	}
	private static void CalcularSalario(ArrayList<Trabajador> empleados) {
		int id = 1;
		
		boolean todoOk = false;
		boolean enc = false;

		do {
			try {
				System.out.print("Introduce el id del trabajador: ");
				
				id = Integer.parseInt(leer.readLine());
				todoOk = true;
			} catch (NumberFormatException | IOException e) {
				e.printStackTrace();
			}
		} while (todoOk != true);

		for (int i = 0; i < empleados.size() && !enc; i++) {
			if (empleados.get(i).getId() == id) {
				if( empleados.get(i) instanceof TrabajadorCompleto) {
					System.out.print("El salario es: "+
					((TrabajadorCompleto)empleados.get(i)).Salario(id));
				}else {
					System.out.print("El salario es: "+
					((TrabajadorTemporal)empleados.get(i)).Salario(id));
				}
				enc = true;
			}
		}

		if (enc == false) {
			System.out.println("No se ha encontrado el empleado con ese ID");
		}
	}
	
	
	
	
}