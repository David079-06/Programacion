package ejerciciosopyexp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej5 {

	public static void main(String[] args)throws NumberFormatException, 
	IOException{
		
		// TODO Auto-generated method stub
		BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduzca su peso: ");
		int peso = Integer.parseInt(leer.readLine());
		System.out.println("Introduzca su estatura: ");
	    float estatura = Float.parseFloat(leer.readLine());
		System.out.println("Su IMC es : " + (peso/(Math.pow(estatura,2))) +" Kg/m2" );
		
	}

}
