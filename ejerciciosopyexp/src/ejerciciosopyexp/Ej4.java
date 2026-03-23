package ejerciciosopyexp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej4 {

	public static void main(String[] args)throws NumberFormatException, 
	IOException{
		{
	}
		// TODO Auto-generated method stub
     BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
   System.out.println("Introducir temperatura (C): ");
    int C = Integer.parseInt(leer.readLine());
   System.out.println("Temperatura en grados Fahrenheit: " + (((9.0/5.0) * C) + 32));		
		
	}

}
