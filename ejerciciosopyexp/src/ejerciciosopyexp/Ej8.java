package ejerciciosopyexp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej8 {

	public static void main(String[] args)throws NumberFormatException, 
	IOException
	{
		// TODO Auto-generated method stub
		BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduzca su peso (L):");
		float libras = Float.parseFloat(leer.readLine());
		System.out.println("Peso en Kilogramos es:" +(libras*0.4535)  + " Kg");
		System.out.println("Peso en gramos es:  "+ ((libras*0.4535)*1000) + " g" );
		
	}

}
