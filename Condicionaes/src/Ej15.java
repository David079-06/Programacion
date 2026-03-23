import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej15 {

	public static void main(String[] args) throws NumberFormatException, 
	IOException {
		// TODO Auto-generated method stub
		BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Núumero de alumnos: ");
		int alumnos  = Integer.parseInt(leer.readLine());
		 if  (alumnos >=100) {
				System.out.println("Alumnos deben pagar 65 euros ");
				System.out.println("Total a pagar a la empresa: " + (alumnos*65)+ "  euros");
		    } else if ( alumnos==30 && alumnos <=49) {
		    	System.out.println("Alumnos deben pagar 95 euros ");
				System.out.println("Total a pagar a la empresa: " + (alumnos*95)+ "  euros");
		    } else if (alumnos <30){
		    	System.out.println("Alumnos deben pagar " + (4000.00/alumnos) + " euros ");
				System.out.println("Total a pagar a la empresa: 4000 euros");
	}
	}
}
