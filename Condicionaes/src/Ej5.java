import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej5 {

	public static void main(String[] args) throws NumberFormatException, 
	IOException {
		// TODO Auto-generated method stub
		BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));	
		System.out.println("Introduzca su usuario: ");
		String user= leer.readLine();
		System.out.println("Introduzca su contraseña: ");
		String password= leer.readLine();
		if  (user.equals("alumno")  && password.equals("daw1programacion"))  {
			System.out.println("Has entrado al sistema");
	    } else {
	    	System.out.println("ERROR 0193 ");
	    }

	}
	

}
