import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
	int [] numeros= new int [10];
	    for (int i=0;i<numeros.length;i++) {
	    	numeros[i] = leerint("Introduce el numero " + (i + 1) + ": ");
	    }
	    System.out.println("El primero numero es: " + numeros[0]);
		System.out.println("El ultimo numero es : " + numeros[numeros.length - 1]); 
	}
	public static int  leerint(String mensaje) throws NumberFormatException, IOException {
		BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
		System.out.println(mensaje);
		int num = Integer.parseInt(leer.readLine());
		return num;
		
       
}
}
