import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej6 {

	public static void main(String[] args)throws NumberFormatException, 
	IOException   {
		// TODO Auto-generated method stub
		BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduzca el primer número: ");
		int num1  = Integer.parseInt(leer.readLine());
		
		System.out.println("Introduzca el segundo número: ");
		int num2  = Integer.parseInt(leer.readLine());
		
		System.out.println("Introduzca el tercer número: ");
		int num3  = Integer.parseInt(leer.readLine());
		
		if  (num1>num2 &&  num1 > num3) {
			System.out.println("El primer numero es mayor ");
	    } else if (num2>num1 && num2>num3) {
	    System.out.println(" El segundo numero es mayor ");
	    } else if (num3>num1 && num3> num2){
		System.out.println(" El tercero numero es mayor ");
	}
		
	    }
	}


