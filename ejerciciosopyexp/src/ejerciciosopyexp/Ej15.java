package ejerciciosopyexp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej15 {

	public static void main(String[] args)throws NumberFormatException, 
	IOException {
		// TODO Auto-generated method stub
		BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Su Nombre: ");
		String nomb = leer.readLine();
		System.out.println("Sus apellidos: ");
		String apellido = leer.readLine();
		System.out.println("Sus años: ");
		int años = Integer.parseInt(leer.readLine());
		System.out.println("Ciudad donde vive: ");
		String ciudad = leer.readLine();
	    System.out.println("Su profesión: ");
		String prof = leer.readLine();
		System.out.println("Te llamas " + nomb + " " + apellido + "," + " tienes " + años + " años" + "," + " vives en " + ciudad +  " y trabajas como " + prof );
        
        
        
	}

}
