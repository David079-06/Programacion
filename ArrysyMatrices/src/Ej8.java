import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej8 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int numpares=0;
		int numimpares=0;
		int[]numeros= new int [12];
		for (int i=0;i<numeros.length;i++) {
			   numeros[i]=leerint("Introduce el numero: ");
			   if (numeros[i]%2==0) {
				   numpares++;
			   }else {
				   numimpares++;
			   }
			}
		System.out.println("Hay un total de "+numpares+ " pares y," +numimpares+" impares");
	}
	public static int  leerint(String mensaje) throws NumberFormatException, IOException {
		BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
		System.out.println(mensaje);
		int num = Integer.parseInt(leer.readLine());
		return num;
}
}
