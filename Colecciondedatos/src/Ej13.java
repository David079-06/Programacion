import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Ej13 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		Map<String,String> diccionario= new HashMap<String, String>();
		boolean salir=false;
		do {
			
			System.out.println("=== TRADUCTORr ===");
			System.out.println("1. Añadir palabra y su traducción");
			System.out.println("2. Buscar traducción de una palabra");
			System.out.println("3. Buscar traducción ");
			System.out.println("4. Mostrar todo el diccionario");
			System.out.println("5. Eliminar una palabra del diccionario");
			System.out.println("6. Contar total de palabras en el diccionario");
			System.out.println("7. Mostrar todas las palabras en español");
			System.out.println("8. Mostrar todas las traducciones");
			System.out.println("9. Salir");
			
			int  opcion =leerInt("Elige una opción: ");
			
			switch (opcion) {
			
			case 1:
				Opcion1(diccionario);
			break;
			case 2:
				Opcion2(diccionario);
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
	public static void Opcion1( Map<String,String> diccionario) throws IOException   {
		System.out.println("------ AÑADIR PALABRA Y TRADUCCIÓN ------");
		String palabra=leerString("Introduce la palabra a añadir:");
		String traduccion=leerString("Introduce la traduccion de la palabra :");
		diccionario.put(palabra, traduccion);
	}
	
	public static void Opcion2( Map<String,String> diccionario) throws IOException   {
		System.out.println("------ BUSCAR TRADUCCION DE UNA PALABRA------");
		String palabrabuscar=leerString("Introduce la palabra a buscar:");
		
		if( diccionario.containsKey(palabrabuscar)) {
		    System.out.println("\n--- ANÁLISIS DE RENDIMIENTO ---");
		}
	}
	public static void Opcion3( Map<String,String> diccionario) throws IOException   {
		System.out.println("------ BUSCAR TRADUCCION DE UNA PALABRA------");
		String palabrabuscar=leerString("Introduce la palabra a buscar:");
		
		System.out.println(" La traduccion ");
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
