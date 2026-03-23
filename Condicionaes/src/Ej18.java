import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej18 {

	public static void main(String[] args) throws NumberFormatException, 
	IOException {
		// TODO Auto-generated method stub
		BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduzca su nombre: ");
		String nombre= leer.readLine();
		System.out.println("Introduzca su fecha de nacimiento: ");
		int edad = Integer.parseInt(leer.readLine());
		if  (edad<=2007) { 
			System.out.println("El alumno  " + nombre + " puede salir");
	    } else if ( edad >2007) { BufferedReader leer2= new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("Tiene autorizacion (SI/NO): ");
	    String autorizacion= leer2.readLine();
	   if  (autorizacion.equals("Si") ) {
		   System.out.println("El alumno " + nombre + " puede salir");
		   
	   } else 
		   System.out.println("El alumno " + nombre + "  no puede salir ");
	   }
	    } 

	}


