import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej9 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		 int multiplos=0;
		int[]numeros= new int [15];
		for (int i=0;i<numeros.length;i++) {
			   numeros[i]=leerint("Introduce el numero: ");
		}
		 int   numN=leerint("Número N múltiplo:");
		for(int i=0;i<numeros.length;i++) {
		  if (numeros[i]%numN==0) {
			 multiplos++;
		  }
		}
		System.out.println("Hay," + multiplos + " numeros");
	}
	public static int  leerint(String mensaje) throws NumberFormatException, IOException {
		BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
		System.out.println(mensaje);
		int num = Integer.parseInt(leer.readLine());
		return num;
}
}
