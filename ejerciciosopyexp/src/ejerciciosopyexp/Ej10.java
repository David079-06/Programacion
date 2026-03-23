package ejerciciosopyexp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej10 {

	public static void main(String[] args)throws NumberFormatException, 
	IOException {
		// TODO Auto-generated method stub
		BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduzca la distancia (Km): ");
		float kilometros = Float.parseFloat(leer.readLine());
		System.out.println("Distancia en (m): " +(kilometros*1000)  + " m");
	
		System.out.println("Distancia en (cm): "+ (kilometros*100000) + " cm" );
		System.out.println("Distancia en (Millas):  "+ (kilometros*0.621371) + " millas" );

	}

}
