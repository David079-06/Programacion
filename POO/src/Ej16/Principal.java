package Ej16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Principal {
	static final BufferedReader LEER = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
		  ArrayList<empleado> Empresa = new ArrayList<empleado>();
		 
		  boolean salir = false;
			do {
				System.out.println("== CONTROL HORARIO ==");
				
				System.out.println("1.Registrar empleado");
				
				System.out.println("2.Registrar horas");
				
				System.out.println("3.Ver semana");
				
				System.out.println("4.Calcular salario");
				
				System.out.println("5.Empleado del mes");
				
				System.out.println("6.Detectar descanso");
				
				System.out.println("7.Salir");
				System.out.println("Introduce una opcion: ");

				int opcion = -1;
				boolean datosOK = false;
				while (!datosOK) {
					try {opcion = Integer.parseInt(LEER.readLine());
					} catch (NumberFormatException | IOException e) {
						e.printStackTrace();
					}
					datosOK = true;}

				switch (opcion) {
				case 1:
					Regristoemplado(Empresa);
					break;
				case 2:
					Regristohoras(Empresa);
					break;
				case 3:
					Versemana(Empresa);
					break;
				case 4:
					Calcularsalario(Empresa);
					break;
				case 5:
					Empleadodelmes(Empresa);
					break;
				case 6:
					Detectardescansos(Empresa);
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
	private static void Regristoemplado(ArrayList<empleado> Empresa) throws IOException {
		boolean parar = false;
		System.out.println("--Registrar empleado --");

		while (parar == false) {
			System.out.println("Introduce los datos del empleado " + (Empresa.size() + 1));
			Empresa.add(new empleado());
			Empresa.getLast().PedirDatosempleado(Empresa.size());
			System.out.println("¿Desea introducir otro empleado? (S/N)");
			char opcion = LEER.readLine().toUpperCase().charAt(0);
			if (opcion == 'N')
				parar = true;
		}

	}
	
	private static void Regristohoras(ArrayList<empleado> Empresa) throws IOException {
	BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));	
			System.out.println("--Registrar horas --");
			int id = -1;
			boolean todoOk = false;
			boolean enc=false;
			do {
				try {
					System.out.print("Introduce el id del empleado: ");
					id = Integer.parseInt(LEER.readLine());
					todoOk = true;
				} catch (NumberFormatException | IOException e) {
					System.err.println("Error: El ID debe ser un número entero.");
				}
			} while (todoOk != true);
			
			for (int i = 0; i < Empresa.size()&& !enc; i++) {
				if (Empresa.get(i).getId() == id) {
					Empresa.get(i).PedirDatosHoras();
					enc = true;
				}
			}
			if (!enc) {
		        System.err.println("No se ha encontrado ningún empleado con el ID: " + id);
		    }
		
		}
	
	private static void Versemana(ArrayList<empleado> Empresa) throws IOException {
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));	
		System.out.println("--Ver semana--");
		System.out.print("ID del empleado: ");
        int id = Integer.parseInt(LEER.readLine());
        for (empleado e : Empresa) {
            if (e.getId() == id) {
                e.MostrarSemana();
                return;
            }
        }
        System.out.println("No encontrado.");
	}
	
	private static void Calcularsalario(ArrayList<empleado> Empresa) throws IOException {
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));	
		System.out.println("--Calcular salario--");
		System.out.print("ID del empleado: ");
        int id = Integer.parseInt(LEER.readLine());
        for (empleado e : Empresa) {
            if (e.getId() == id) {
            	 System.out.println("Salario de "+ e.getnombre() +":" + e.salario());
                return;
            }
        }
        System.out.println("No encontrado.");
	}
	
	private static void Empleadodelmes(ArrayList<empleado> Empresa) throws IOException {
		System.out.println("--Empleado del mes--");
		if (Empresa.isEmpty()) {
			System.out.println("No hay empleados registrados.");
	        return;
		}
        empleado mejor = Empresa.get(0);
        for (empleado e : Empresa) {
            if (e.getTotalhoras() > mejor.getTotalhoras()) mejor = e;}
        System.out.println("Empleado del mes: " + mejor.getnombre());
        System.out.println("Id del empleado del mes: " + mejor.getId());
	}
	
	private static void Detectardescansos(ArrayList<empleado> Empresa) throws IOException {
		System.out.println("--Detectar descansos--");
        for (empleado e : Empresa) {
        	e.tienedescanso();
          
        
	}
	}
}
