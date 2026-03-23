package ejerciciosopyexp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej20 {

	public static void main(String[] args)throws NumberFormatException, 
	IOException    {
		
		// TODO Auto-generated method stub
		BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduzca su altura(cm): ");
		float alt = Float.parseFloat(leer.readLine());
		System.out.println("Introduzca su peso(Kg): " );
		float peso = Float.parseFloat(leer.readLine());
		System.out.println("Introduzca su edad: ");
		int edad  = Integer.parseInt(leer.readLine());
		float BWT = (float)(2.447 - (0.09156 * edad) + (0.1074 * alt) + (0.3362 * peso));
		System.out.println("El BWT del paciente con " + edad + " años y altura de " + alt + " metros es de " + BWT);
}
}