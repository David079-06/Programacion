import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
	
		int[] numeros= new int [8];
		for (int i=0;i<numeros.length;i++) {
			try {
		    numeros[i]=leerint("Introduce el numero " + (i + 1) + ": ");
			}catch (Exception e) {
				System.out.println("Numero Invalido");
				numeros[i] = 0;
			}
		
		}
		for (int i=0;i<numeros.length;i++) {
		System.out.println(numeros[i]+" ");
		}
	}
	public static int  leerint(String mensaje) throws NumberFormatException, IOException {
		BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
		System.out.println(mensaje);
		int num = Integer.parseInt(leer.readLine());
		return num;
		
       
}
}
