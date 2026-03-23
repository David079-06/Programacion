package ejerciciosopyexp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej7 {

	public static void main(String[] args)throws NumberFormatException, 
	IOException{
		{
	}
		// TODO Auto-generated method stub
		BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduzca el radio:");
		float radio = Float.parseFloat(leer.readLine());
		System.out.println("Introduzca la altura:");
		float altura = Float.parseFloat(leer.readLine());
		float π = (float) 3.14 ;
		System.out.println("Área del cilindro: " + (((2.0* π)*radio)*altura) + " cm2");
		System.out.println("Volumen del cilindro: "+ ( π*radio*radio*altura) + " cm" );
	}

}
