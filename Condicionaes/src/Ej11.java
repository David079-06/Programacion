import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej11 {

	public static void main(String[] args)throws NumberFormatException, 
	IOException {
		// TODO Auto-generated method stub
		BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Primer lado del triángulo: ");
		float lado1 = Float.parseFloat(leer.readLine());
		System.out.println("Segundo lado del triángulo: ");
		float lado2 = Float.parseFloat(leer.readLine());
		System.out.println("Tercer lado del triángulo: ");
		float lado3 = Float.parseFloat(leer.readLine());
		
		if  (lado1==lado2 && lado1 >= lado3) { 
			  if (lado2==lado3) {
				  System.out.println("Equilátero");
		    } else 
		    	System.out.println("Isosceles");
		    } else if (lado1==lado2 || lado1==lado3){
		    	if (lado2!=lado3) {
		    		System.out.println("Isosceles");
		    } else 
		    	System.out.println("Equilátero");
		    } else if ((lado1!=lado2 && lado1!=lado3)){
		    	if (lado2!=lado3) {  
		    		System.out.println("Escaleno");
		    	} else 
		    	System.out.println("Isosceles");

	}

}
}