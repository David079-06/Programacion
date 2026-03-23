package ejerciciosopyexp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej16 {

	public static void main(String[] args)throws NumberFormatException, 
	IOException {
		{
		}
		// TODO Auto-generated method stub
		BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Destino de su viaje: ");
		String dist= leer.readLine();
		System.out.println("Distancia recorrida en Km: ");
		int dist2  = Integer.parseInt(leer.readLine());
		System.out.println("Consumo del coche L/100km: ");
		float consumo = Float.parseFloat(leer.readLine());
		System.out.println("Precio del combustible (L): ");
		float precio= Float.parseFloat(leer.readLine());
		System.out.println("Necesitara " + ((consumo/100)*dist2) + " L");
		System.out.println("El coste de combustible sera: " +  (((consumo/100)*dist2)*precio) + " euros");
		System.out.println("Tiempo estimado: " +  (dist2/90) + " horas");
		System.out.println("Coste por kilometro: " +  ((consumo/100)*precio) + " euros");
		
		
	}
}
