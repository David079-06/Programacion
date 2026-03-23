import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 double[] numeros= new double [6];
 double sumatotal=0;
 for (int i=0;i<numeros.length;i++) {
		try {
	    numeros[i]=leerint("Introduce el numero " + (i + 1) + ": ");
		}catch (Exception e) {
			System.out.println("Numero Invalido");
			numeros[i] = 0;
		}
		 sumatotal = sumatotal +numeros[i];

	}
	System.out.println("Suma total:" + sumatotal);
	}
	public static double  leerint(String mensaje) throws NumberFormatException, IOException {
		BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
		System.out.println(mensaje);
		double num = Double.parseDouble(leer.readLine());
		return num;
		
       
}
}
