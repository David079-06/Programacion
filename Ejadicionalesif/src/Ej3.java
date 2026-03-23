import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej3 {

	public static void main(String[] args) throws NumberFormatException, 
	IOException {
		// TODO Auto-generated method stub
		BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Importe de la compra: ");
		float importe = Float.parseFloat(leer.readLine());
		System.out.println("¿Cuenta con la tarjeta de soscio?(si/no): ");
		String socio= leer.readLine();
		
		if  (socio.equals("si")) { if (importe<50 ) {
			System.out.println("Importe: " + (importe-(importe*0.05)));
		} else if (importe>=50 && importe ==100) {
			System.out.println("Importe: " + (importe-(importe*0.15)));

		} else {
			System.out.println("Importe: " + (importe-(importe*0.20)));

		}
		
		
	    } else   { if (importe<50 ) {
			System.out.println("Importe: " + importe);
		} else if (importe>=50 && importe ==100) {
			System.out.println("Importe: " + (importe-(importe*0.10)));

		} else {
			System.out.println("Importe: " + (importe-(importe*0.15)));

		}}

	}

}
