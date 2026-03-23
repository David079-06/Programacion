import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej4 {

	public static void main(String[] args) {
	int[] numeros=new int [10];
	int numerospositivos=0;
	int numeronegativo=0;
	int numeroscero=0;
	 for (int i=0;i<numeros.length;i++) {
			try {
		    numeros[i]=leerint("Introduce el numero " + (i + 1) + ": ");
			}catch (Exception e) {
				System.out.println("Numero Invalido");
				numeros[i] = 0;
			}
			

		    if (numeros[i]<0) {
				numeronegativo++;
		    } else if ( numeros[i]==0) {
		    	numeroscero++;
		    } else{
		    	numerospositivos++;
		    }
		    }
		System.out.println("Hay "+numerospositivos + " positivos,  "+numeronegativo + " negativos,  " +numeroscero+ " son cero");
	}
	public static int  leerint(String mensaje) throws NumberFormatException, IOException {
		BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
		System.out.println(mensaje);
		int num = Integer.parseInt(leer.readLine());
		return num;
}
	
}
