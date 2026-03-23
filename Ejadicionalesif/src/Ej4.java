import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej4 {

	public static void main(String[] args)throws NumberFormatException, 
	IOException  {
		// TODO Auto-generated method stub
		BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduzca la primera nota: ");
		float nota1 = Float.parseFloat(leer.readLine());
		System.out.println("Introduzca la segunda nota: ");
		float nota2 = Float.parseFloat(leer.readLine());
		System.out.println("Introduzca la tercera nota: ");
		float nota3 = Float.parseFloat(leer.readLine());
		float media = (float) ((nota1+nota2+nota3)/3);
		
		
		
		if  (media >=5) { 
			System.out.println("Aprobado");
		
	    } else   { if ( ) {
			System.out.println("Importe: " + importe);
		} else if (importe>=50 && importe ==100) {
			System.out.println("Importe: " + (importe-(importe*0.10)));

		} else {
			System.out.println("Importe: " + (importe-(importe*0.15)));

		}}

	}

}
