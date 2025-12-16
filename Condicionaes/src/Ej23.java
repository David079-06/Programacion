import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej23 {

	public static void main(String[] args) throws NumberFormatException, 
	IOException {
		// TODO Auto-generated method stub
		System.out.println("1.Calcular área de un circulo ");
		System.out.println("2.Calcular área de un cuadrado ");
		System.out.println("3.Calcular área de un triángulo ");
		System.out.println("4.Salir");
		
		BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduzca el número de la operacion a realizar: ");
		 int number  = Integer.parseInt(leer.readLine());
		 
		 
		 switch (number) {
		 case 1:
			 System.out.println("Introduzca el radio del círculo");
			   float radio = Float.parseFloat(leer.readLine());
			   System.out.println("Area del círculo: " + (radio*(Math.pow(3.14,2))) + " cm2");
			 break;
			 case 2:
				 System.out.println("Introduzca el lado del cuadrado: ");
				   float lado = Float.parseFloat(leer.readLine());
				   System.out.println("Area del cuadrado: " + (lado*lado) + " cm2");
				 break;
			 case 3:
				 System.out.println("Introduzca la base del tríangulo: ");
				   float base = Float.parseFloat(leer.readLine());
				   System.out.println("Introduzca la altura del tríangulo: ");
				   float altura = Float.parseFloat(leer.readLine());
				   
				   System.out.println("Area del cuadrado: " + ((base*altura)/2) + " cm2");
				 break;
			 case 4:
				 System.out.println("Salir ");
				 break;
		 }
	}

}
