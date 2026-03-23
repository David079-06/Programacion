package ejerciciosopyexp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej9 {

	public static void main(String[] args)throws NumberFormatException, 
	IOException
	{
		// TODO Auto-generated method stub
		BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduzca los minutos: ");
		float minutos = Float.parseFloat(leer.readLine());
		System.out.println("Numero de Años:" +(minutos/60/24/365)  + " años");
		System.out.println("Numero de dias:  "+ (minutos/60/24) + " días" );
		
	}
}
