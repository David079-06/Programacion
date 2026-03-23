package ejerciciosopyexp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej21 {

	public static void main(String[] args)throws NumberFormatException, 
	IOException   {
		
		BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduzca su altura(cm): ");
	float alt = Float.parseFloat(leer.readLine());
		System.out.println("Introduzca su peso(Kg): " );
		float peso = Float.parseFloat(leer.readLine());
		System.out.println("Introduzca su edad: ");
		int edad  = Integer.parseInt(leer.readLine());
		float REE=(float) ((665.1+ 9.6 * peso) + (1.8*alt) - (4.7 * edad)) ;
		System.out.println("El REE del paciente con " +  peso + " y altura: " + alt + " metros es de " + REE);

	}

}
