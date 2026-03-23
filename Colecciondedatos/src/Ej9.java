import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Ej9 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		ArrayList<String> canciones = new ArrayList<>();
		boolean salir=false;
		do {
			
			System.out.println("=== Gestor Playlist ===");
			System.out.println("1. Añadir canción al final");
			System.out.println("2. Añadir canción al inicio de la playlist");
			System.out.println("3. Mostrar todas las canciones ");
			System.out.println("4. Eliminar canción por posición");
			System.out.println("5. Buscar canción por nombre");
			System.out.println("6. Mover una canción a otra posición ");
			System.out.println("7. Mostrar la primera y última canción de la playlist ");
			System.out.println("8. Mostrar total de canciones");
			System.out.println("9. Shuffle");
			System.out.println("10. Eliminar canciones duplicadas");
			System.out.println("11. Salir");
			
			int  opcion =leerInt("Elige una opción: ");
			
			switch (opcion) {
			
			case 1:
				Añadirfinal(canciones);
			break;
			case 2:
				Añadirinicio(canciones);
			break;
			case 3:
				Mostrarcanciones(canciones);
            break;
			case 4:
				Eliminarcancionporposicion(canciones);
			break;
			case 5:
				Buscarcancion(canciones);
	        break;
	        
			case 6:
				Movercancion(canciones);
			break;
			
			case 7:
				Mostarprimayultima(canciones);
			break;
			
			case 8:
				Mostrartotal(canciones);
			break;
			
			case 9:
				Shuffle(canciones);
			break;
			
			case 10:
				Eliminarduplicados(canciones);
			break;
			case 11:
				salir = true;
				System.out.println("¡Hasta luego!");
				break;
				
			}       
	}while (salir);
	}
	public static void Añadirfinal(ArrayList<String>canciones) throws IOException  {
		System.out.println("-------Añade tu cancion a al final de la playlist-------");
		String cancion=leerString("Introduzca la cancion que desea añadir:");
		 canciones.add(cancion);
		 
	}
	public static void Añadirinicio(ArrayList<String>canciones) throws IOException  {
		System.out.println("-------Añade tu cancion a al inicio de la playlist-------");
		String cancion=leerString("Introduzca la cancion que desea añadir:");
		 canciones.add(0,cancion);
		 
	}
	public static void Mostrarcanciones(ArrayList<String>canciones) throws IOException  {
		System.out.println("-------Mostrar lista de canciones-------");
		for (int i=0;i<canciones.size();i++) {
			System.out.println((i+1)+": "+canciones.get(i));
		}
		
	}
	public static void Eliminarcancionporposicion(ArrayList<String>canciones) throws IOException  {
		System.out.println("-------Eliminar cancion por posicion-------");
		int pos=-1;
		try { 
			pos=leerInt("Introduce la posicion de la cancion");
			
		}catch (NumberFormatException e) {
			pos=-1;
			System.out.println("Tienes que introducir un numero ");
		}while(pos<0||pos>canciones.size());
		canciones.remove(pos);
		 
	}
	public static void Buscarcancion(ArrayList<String>canciones) throws IOException  {
		
		String cancion=leerString("Introduce el nombre de la cancion:");
		if(canciones.contains(cancion)) {
			for(int i=0;i<canciones.size();i++) {
				if(canciones.get(i).equalsIgnoreCase(cancion)) {
					System.out.println("La cancion esta en la posicion  "+ i);
				}
			}
			
		}else {
			System.out.println("La cancion no  esta en la playlist");
		}
		
}
	public static void Movercancion(ArrayList<String>canciones) throws IOException  {
		System.out.println("-------Mover cancion a otra posicion-------");
		int pos1=-1; {
			System.out.println("Introduce una posicion");
		}while(pos1<0||pos1>canciones.size());
		
		int pos2=-1; {
			System.out.println("Introduce una posicion");
		}while(pos2<0&&pos2>canciones.size());
		System.out.println(canciones);
		Collections.swap(canciones, pos1, pos2);
		System.out.println(canciones);
		
	}
	public static void Mostarprimayultima(ArrayList<String>canciones) throws IOException  {
		System.out.println("-------Mostrar primera y ultima cancion de la playlist-------");
	    System.out.println("Cancion primera:" + canciones.getFirst());
	    System.out.println("Cancion ultima:" + canciones.getLast());

	}
	
	public static void Mostrartotal(ArrayList<String>canciones) throws IOException  {
		System.out.println("-------Mostrar total de canciones-------");
	    System.out.println("Total de canciones es :" + canciones.size());
	 

	}
	public static void Shuffle(ArrayList<String>canciones) throws IOException  {
		System.out.println("-------Shuffle canciones-------");
		System.out.println(canciones);
		System.out.println("Mesclando canciones");
	    Collections.shuffle(canciones);
	    System.out.println(canciones);

	}
	
	public static void Eliminarduplicados(ArrayList<String>canciones) throws IOException  {
		System.out.println("-------Eliminar canciones duplicadas-------");
		ArrayList<String>cancionessinDuplicados=new ArrayList<>();
		System.out.println(canciones);
		for(String cancion:cancionessinDuplicados) {
			if(!cancionessinDuplicados.contains(cancion)) {
				cancionessinDuplicados.add(cancion);
			}
		}
		System.out.println(cancionessinDuplicados);
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
