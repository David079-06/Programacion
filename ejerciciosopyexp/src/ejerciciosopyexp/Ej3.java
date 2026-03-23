package ejerciciosopyexp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej3 {

	public static void main(String[] args) throws NumberFormatException, 
	IOException{
		
	
		// TODO Auto-generated method stub
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introducir base del rectangulo: ");
		int base = Integer.parseInt(leer.readLine());
		System.out.println("Introducir altura del rectangulo: ");
		int altura = Integer.parseInt(leer.readLine());
		
		System.out.println("Perimetro del rectangulo: " + (2*(altura + base)) + " cm" );
		System.out.println("");
		System.out.println("Area del rectangulo: " + (altura * base) + " cm2" );
		
	}

}
