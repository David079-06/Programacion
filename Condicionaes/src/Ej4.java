import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej4 {

	public static void main(String[] args) throws NumberFormatException, 
	IOException  {
		// TODO Auto-generated method stub
		BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.println("Introduzca el primer número: ");
		int num1  = Integer.parseInt(leer.readLine());
		
		System.out.println("Introduzca el segundo número: ");
		int num2  = Integer.parseInt(leer.readLine());
		if  (num2 == 0) {
			System.out.println("ERROR");
	    } else {
	    	System.out.println("Su division es: " + (num1/num2) + " y su resto es " + (num1%num2));
	    }

		
		
		
		
	}

}
