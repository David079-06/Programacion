import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej7 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int numbuscar;
		int pos=0;
		int[] numeros= new int [10];
		for (int i=0;i<numeros.length;i++) {
		   numeros[i]=leerint("Introduce el numero: ");
		}
		numbuscar=leerint("Número a buscar:");
		for (int i=0;i<numeros.length;i++) {
			if (numeros[i]==numbuscar) {
				pos=i-1;
				System.out.println("Se encuentra en el arry");
			}
			
		}
		System.out.println("Esta en la posicion" + pos);
}
	public static int  leerint(String mensaje) throws NumberFormatException, IOException {
		BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
		System.out.println(mensaje);
		int num = Integer.parseInt(leer.readLine());
		return num;
}
}