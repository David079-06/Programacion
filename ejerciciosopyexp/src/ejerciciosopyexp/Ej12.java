package ejerciciosopyexp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej12 {

	public static void main(String[] args)  throws NumberFormatException, 
	IOException {
		// TODO Auto-generated method stub
		BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduzca el lado A del triangulo: ");
		float lado1 = Float.parseFloat(leer.readLine());
		System.out.println("Introduzca el lado B del triangulo: ");
		float lado2 = Float.parseFloat(leer.readLine());
		System.out.println("Introduzca el lado C del triangulo: ");
		float lado3 = Float.parseFloat(leer.readLine());
		float Perimetro= (float)(lado1+lado2+lado3);
		float Area= (float) (Perimetro*(Perimetro-lado1)*(Perimetro-lado2)*(Perimetro-lado3));
		System.out.println("Perimetro del triangulo es: " + Perimetro + " cm");
		System.out.println("Su Área es " + (Math.pow(Area, 1/2)) + " cm2");
	
	}

}
