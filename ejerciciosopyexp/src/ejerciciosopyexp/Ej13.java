package ejerciciosopyexp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej13 {

	public static void main(String[] args)throws NumberFormatException, 
	IOException {
		
		// TODO Auto-generated method stub
		BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduzca su edad: ");
		int edad = Integer.parseInt(leer.readLine());
		System.out.println("¿Es mayor de edad? " + (edad>= 18));
		boolean menor= edad<= 65 ;
		System.out.println("¿Es menor de 65?: " + menor);
		boolean edadlaboral = (edad >= 18) && (edad<=68);
		System.out.println("Edad laboral: " + edadlaboral);
		boolean edad18 = edad ==18;
		System.out.println("¿18?: " + edad18);
		boolean mayor65 = edad >= 65;
		System.out.println("¿Jubilado?: " + mayor65);
	}

}