package ejerciciosopyexp;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class ejercicio1 {

	public static void main(String[] args) throws NumberFormatException, 
	IOException {
 {// TODO Auto-generated method stub
	 
 }
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introducir un numero: ");
		int numero1 = Integer.parseInt(leer.readLine());
		System.out.println("Introducir un numero: ");
		int numero2 = Integer.parseInt(leer.readLine());
		System.out.println("La suma de los numeros es:" + (numero1 + numero2));
		
	}
}
