import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej8 {

	public static void main(String[] args)throws NumberFormatException, 
	IOException  {
		// TODO Auto-generated method stub
		BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Año: ");
		int año  = Integer.parseInt(leer.readLine());
		
		if  ((año%4 ==0 && año%100 !=0) || (año % 400 == 0.0)) {
			System.out.println("Bisiesto ");
	    } else {
			System.out.println("No bisiesto");
		}
	}
}
