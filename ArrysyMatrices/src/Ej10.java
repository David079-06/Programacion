import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej10 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int[]numeros= new int [8];
		int[]numeros2= new int [8];
		for (int i=0;i<numeros.length;i++) {
			   numeros[i]=leerint("Introduce el numero: ");
		}
	    for(int i=0;i<numeros.length;i++) {
	    	numeros2[i]=numeros[numeros.length-1-i];
	    	
	    }
	
		for(int i=0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		System.out.println(" ");
		for(int i=0; i < numeros2.length; i++) {
			System.out.print(numeros2[i] + " ");
		}
	    
	}
	public static int  leerint(String mensaje) throws NumberFormatException, IOException {
		BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
		System.out.println(mensaje);
		int num = Integer.parseInt(leer.readLine());
		return num;
}
}
