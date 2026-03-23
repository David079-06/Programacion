package ejerciciosopyexp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej18 {

	public static void main(String[] args)throws NumberFormatException, 
	IOException  {
		
		// TODO Auto-generated method stub
		BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Nombre del primer producto: ");
		String product1= leer.readLine();
		System.out.println("Precio: ");
		float precio1 = Float.parseFloat(leer.readLine());
		
		System.out.println("Nombre del segundo producto: ");
		String product2 = leer.readLine();
	    System.out.println("Precio: ");
		float precio2 = Float.parseFloat(leer.readLine());
		
		System.out.println("Nombre del tercer producto: ");
		String product3= leer.readLine();
		System.out.println("Precio: ");
		float precio3 = Float.parseFloat(leer.readLine());
		
		System.out.println("Descuento a aplicar: ");
		float desc= Float.parseFloat(leer.readLine());
		float subtotal= (float)(precio1+precio2+precio3);
		float descuento = (float)(subtotal*(desc/100.0));
		float iva = (float)((subtotal-descuento)*(21.0/100.0));
		
	     System.out.println("SUBTOTAL: " + subtotal + " euros");
	     System.out.println("DESCUENTO: " + ((precio1+precio2+precio3)*(desc/100.0)) + " euros");
	     System.out.println("IVA: " + (iva) + " euros");
	     System.out.println("TOTAL: " + ((subtotal-descuento)+iva) + " euros");
	     
	}
	

}
