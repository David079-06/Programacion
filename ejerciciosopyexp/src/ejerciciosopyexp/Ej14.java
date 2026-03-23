package ejerciciosopyexp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej14 {

	public static void main(String[] args)throws NumberFormatException, 
	IOException  {
		// TODO Auto-generated method stub
		BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Su Nombre: ");
		String nomb = leer.readLine();
		System.out.println("Primera nota: ");
		float not1 = Float.parseFloat(leer.readLine());
		System.out.println("Segunda nota: ");
		float not2 = Float.parseFloat(leer.readLine());
		System.out.println("Tercera nota: ");
		float not3 = Float.parseFloat(leer.readLine());
		System.out.println("Hola " + nomb);
		System.out.println("--------------------");
        System.out.println("Su nota media es " + ((not1 + not2+ not3)/3));
	}

}
