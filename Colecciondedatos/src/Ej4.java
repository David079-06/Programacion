import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Ej4 {

	public static void main(String[] args)throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		 List<String> palabras = new ArrayList<>();
		 for (int i =0;i<7;i++) {
		    	 String palabra = leerString("Introduce la palabra: ");
		    	 palabras.add(palabra);
		      }
			 System.out.println(palabras);
	
			 Collections.sort(palabras);
			
		 System.out.println(palabras);
	}
	public static String leerString(String mensaje) throws IOException {
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(mensaje);
		return leer.readLine();
	}
}
