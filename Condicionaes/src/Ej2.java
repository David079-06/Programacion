import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej2 {

	public static void main(String[] args) throws NumberFormatException, 
	IOException {
		// TODO Auto-generated method stub
		BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduzca un número: ");
		int num  = Integer.parseInt(leer.readLine());
	   
		if  (num >= 0) {
			System.out.println("Positivo ");
	    } else {
	    	System.out.println("Negativo ");
	    }
	}

}
