import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Ej6 {
		public static void main() throws NumberFormatException, IOException{
			ArrayList<String> tareas = new ArrayList<>();
			boolean salir=false;
			do {
				//MOSTRAR MENU
				System.out.println("=== BIBLIOTECA Calasanz Games ===");
				System.out.println("1. Añadir tarea al final de la lista");
				System.out.println("2. Insertar tarea en una posición específica");
				System.out.println("3. Mostrar todas las tareas");
				System.out.println("4. Marcar tarea como completada");
				System.out.println("5. Mostrar número total de tareas pendientes");
				System.out.println("6. Buscar si existe una tarea específica");
				System.out.println("7. Eliminar todas las tareas ");
				System.out.println("8. Salir");
				int  opcion =leerInt("Elige una opción: ");
				
				switch (opcion) {
				
				case 1:
					Añadirtarea(tareas);
				break;
				case 2:
				   Añadirtareaposicion(tareas);
				break;
				case 3:
					Mostrartareas(tareas);
	            break;
				case 4:
					Marcartareacompleta(tareas);
				break;
				
				case 5:
					Tareaspendientes(tareas);
		        break;
		        
				case 6:
					
				break;
				
				case 7:
					Eliminartarea(tareas);
				break;
				
				case 8:
					salir = true;
					System.out.println("¡Hasta luego!");
					break;
					
				}       
		}while (salir);
		}
		
		public static void Añadirtarea (ArrayList<String>tareas) throws IOException {
			System.out.println("-----Añadir Tarea-----");
			String tarea =leerString("Añadir tarea a la lista: ");
			tareas.add(tarea);
		}
		public static void Añadirtareaposicion(ArrayList<String>tareas) throws NumberFormatException, IOException {
			System.out.println("-----Añadir tarea en una posicion-----");
			int pos=leerInt ("Añade la posicion: ");	
			String tarea=leerString("Añadir a lista");
			 tareas.add(pos,tarea);
		}
		public static void Mostrartareas(ArrayList<String>tareas) throws NumberFormatException, IOException {
			System.out.println("-----Lista de tareas-----");
			for (int i=0;i<tareas.size();i++) {
				System.out.println((i+1)+" "+tareas.get(i));
			}
		}
		public static void Marcartareacompleta(ArrayList<String>tareas) throws NumberFormatException, IOException {
			System.out.println("-----Marcar tarea completa-----");
			 int pos;
			 do {
				 
			  pos = leerInt("Introduce una posicion: ");
		      }while(pos < 0 && pos > tareas.size());
		
		tareas.remove(pos-1);
			}
		public static void Tareaspendientes(ArrayList<String> tareas) {
			System.out.println("-- Numero de  tareas pendientes -- ");
			
			System.out.println("Quedan " + tareas.size() + " tareas pendientes.");
		}
		
		
		public static void Tareaabuscar(ArrayList<String> tareas) throws IOException {
			System.out.println("-- Buscar si existe una tarea -- ");
			String tareaABuscar = leerString("Introduce la tarea a buscar:" );
			
			if(tareas.contains(tareaABuscar)){
				System.out.println("Tarea encontrada");
			}else {
				System.out.println("Tarea no encontrada");
			}
		}
		
		public static void Eliminartarea(ArrayList<String>tareas) throws NumberFormatException, IOException {
			System.out.println("-----Eliminar tareas-----");
			 tareas.clear();
			
			}
		
	public static int leerInt(String mensaje) throws NumberFormatException, IOException  {
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(mensaje);
		int num = Integer.parseInt(leer.readLine());
		return num;
	}
	public static String leerString(String mensaje) throws IOException {
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(mensaje);
		return leer.readLine();
	}
}
