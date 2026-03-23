import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej1 {
	public static void main(String[] args)throws NumberFormatException, 
	IOException  {
	BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
	
	System.out.println("Nombre de la pelicula: ");
	String pelicula= leer.readLine();
	System.out.println("Introduzca su edad: ");
	int edad  = Integer.parseInt(leer.readLine());
	System.out.println("¿Cuenta con permiso?(Si/No): ");
	String permiso= leer.readLine();
		 if  (edad >=18) {
			System.out.println("Puedes ver la película ");
	    } else if ( edad ==13 && edad <=17) { if  (permiso.equals("Si")){
	    	System.out.println("Puede ver la pelicula ");
	    } else { System.out.println("No puede ver la pelicula ");}
	    
	    
	    
	    }else {System.out.println("No puede ver la pelicula ");}
	   
	    } 

}
