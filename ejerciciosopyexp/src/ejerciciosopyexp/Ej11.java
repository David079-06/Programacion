package ejerciciosopyexp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej11 {

	public static void main(String[] args) throws NumberFormatException, 
	IOException 
	{
		// TODO Auto-generated method stub
		BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduzca el primer número: ");
		int num1 = Integer.parseInt(leer.readLine());
		System.out.println("Introduzca el segundo número: ");
		int num2 = Integer.parseInt(leer.readLine());
		
		
		
		System.out.println("Su suma: " + (num1 +num2));
	
		System.out.println("Su resta es " + num1 + "-" +num2 + ": " + (num1 - num2));
		System.out.println("Su multiplicación: " + (num1*num2));
		System.out.println("Su división de " + num1 + "÷" + num2 + " es " + (num1/num2) + " su resto es  " + (num1%num2)); 
		System.out.println("El número " + num1 + " elevado al número " + num2 + " es: " + Math.pow(num1, num2));
		System.out.println("Las raices de los numeros "+ num1 + " y " + num2 + " son: " + Math.sqrt (num1) + " y " + Math.sqrt( num2)  );
  boolean mayor= num1 > num2 ;
		System.out.println("Es mayor el primer numero: " + mayor);
	}

}
