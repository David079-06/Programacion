import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Ej12 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		Map<String,String> agenda= new HashMap();
		boolean salir=false;
		do {
			
			System.out.println("=== Almacen de datos ===");
			System.out.println("1.  Añadir contacto ");
			System.out.println("2. Buscar teléfono por nombre");
			System.out.println("3. Mostrar todos los contactos ");
			System.out.println("4. Eliminar contacto por nombre");
			System.out.println("5. Comprobar si existe un contacto");
			System.out.println("6. Modificar teléfono de un contacto existente");
			System.out.println("7. Mostrar cantidad total de contactos ");
			System.out.println("8. Salir");
			
			int  opcion =leerInt("Elige una opción: ");
			
			switch (opcion) {
			
			case 1:
				
			break;
			case 2:
				Opcion2(agenda );
			break;
			case 3:
				
            break;
			case 4:
				
			break;
			case 5:
				
	        break;
	        
			case 6:

				break;
			
			case 7:
				
			break;
			
			
			case 8:
				salir = true;
				System.out.println("¡Hasta luego!");
				break;
				
			}       
	}while (salir);
		
	}
	public static void Opcion1( Map<String,Integer> agenda) throws IOException   {
		System.out.println("------Añadir contacto------");
		String nombre=leerString("Introduce el nombre del contacto para añadir:");
		int telefono=leerInt("Introduce el numero de telefono del contacto :");
		agenda.put(nombre, telefono);
	}
	
	public static void Opcion2( Map<String, String> agenda) throws IOException   {
		System.out.println("------Buscar contacto------");
		String nombre=leerString("Introduce el nombre de contacto para buscar:");
		
		if(agenda.getOrDefault(nombre, -1) == -1) 
			System.out.println("No se ha encontrado ese nombre de contacto");
		else 
			System.out.println("El telefono de"+nombre + " es " +agenda.get(nombre));
			
		
	}
	public static void Opcion3( Map<String, Integer> agenda) throws IOException   {
		System.out.println("------Mostrar todos los contactos------");
		String nombre=leerString("Introduce el nombre de contacto para buscar:");
		
		for (Map<String, Integer> agenda : agenda.entrySet()) {
			
		}
	}
	
	
	
	public static int leerInt(String mensaje) throws NumberFormatException, IOException  {
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(mensaje);
		int num=-1;
		boolean valido=false;
		do {
			try {
				num=Integer.parseInt(leer.readLine());
				valido=true;
			}catch(NumberFormatException e) {
				System.out.println("Tienes que introducir un numero");
			}
		}while(!valido);
		return num;
	}
	public static String leerString(String mensaje) throws IOException {
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(mensaje);
		return leer.readLine();
	
	}
}
