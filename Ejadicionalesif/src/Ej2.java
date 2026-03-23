import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej2 {

	public static void main(String[] args) throws NumberFormatException, 
	IOException {
		// TODO Auto-generated method stub
		BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduzca la contraseña: ");
		String pasword= leer.readLine();
		int longitud = pasword.length();
		
		
		
		if  (longitud>=8) {
			
			BufferedReader leer2= new BufferedReader(new InputStreamReader(System.in));
			System.out.println("¿Contiene un número?(Si/No): ");
			String numero= leer2.readLine(); 
			if (numero.equals("si")) {
			BufferedReader leer3= new BufferedReader(new InputStreamReader(System.in));
			System.out.println("¿Contiene una mayuscula?(Si/No): ");
			String mayusculas= leer3.readLine(); 
			if (mayusculas.equals("si")) {
					System.out.println("Contraseña válida" );	
			} else {
				System.out.println("Contraseña no válida" );	
			}
				
			} else {
				System.out.println("Contraseña no válida" );
			}
		
			} else {
		    	System.out.println("Contraseña no válida" );
		    }
		    	
	}

}
