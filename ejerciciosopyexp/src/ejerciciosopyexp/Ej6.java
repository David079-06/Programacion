package ejerciciosopyexp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej6 {

	public static void main(String[] args)throws NumberFormatException, 
	IOException{
		{
	}
		// TODO Auto-generated method stub
		BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Introduzca el radio del círculo: ");
		float radio = Float.parseFloat(leer.readLine());
		float π = (float)3.14 ;
		System.out.println(" Área del círculo es: " + ( π * Math.pow(radio, 2))+ " cm2") ;
		System.out.println("Circuferencia del círculo: " +((2*radio) * π) + " cm");
		
		
	}

}
