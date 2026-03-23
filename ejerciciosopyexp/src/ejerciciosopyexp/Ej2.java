package ejerciciosopyexp;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Ej2 {

	
	
	
	public static void main(String[] args)throws NumberFormatException, 
	IOException { 
		{

	}// TODO Auto-generated method stub
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introducir el lado del cuadrado:");
		int lado = Integer.parseInt(leer.readLine());
		System.out.println("Area: "+(lado * lado+ " cm2"));
		System.out.println("Perimetro: "+(4 * lado+ " cm"));
		
	}

}
