package ejerciciosopyexp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej19 {

	public static void main(String[] args)throws NumberFormatException, 
	IOException   {
		
		// TODO Auto-generated method stub
		BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Nombre: ");
		String nomb= leer.readLine();
		System.out.println("Año de nacimiento: ");
		String año= leer.readLine();	
		System.out.println("Color favorito: ");
		String color= leer.readLine();
		String cadena = nomb.substring( 0,3);
		String cadena2 = año.substring( 8,10);
		String cadena3 = color.substring( 0,1);
		String cadena4 = cadena3.toLowerCase();
		String cadena5 = cadena.toUpperCase();
		int numeroale =  (int)Math.floor(Math.random()* 100) + 1;
		System.out.println("Su contraseña: " + cadena5 + cadena2 + cadena4 + numeroale);
		
	}

}
