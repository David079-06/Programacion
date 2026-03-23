package ejerciciosopyexp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej22 {

	public static void main(String[] args)throws NumberFormatException, 
	IOException   {
		{
	}
		
		// TODO Auto-generated method stub
		
		
		BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduzca su altura(cm): ");
		float alt = Float.parseFloat(leer.readLine());
		System.out.println("Introduzca su peso(Kg): " );
		float peso = Float.parseFloat(leer.readLine());
		System.out.println("Introduzca su edad: ");
		float mmc =  (float)((0.32810 * peso) + (0.33929 * alt) - 29.5336);
		System.out.println("El MMC de la persona con " + peso + " kg y " +alt + " metros es de " + mmc);
		
	}

}
