import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio4 {

	public static void main(String[] args) throws NumberFormatException, 
	IOException {
		// TODO Auto-generated method stub
		BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Nombre del concursante: ");
		String Nombreapellido= leer.readLine();
		
		System.out.println("Introduce nota porfesor 1: ");
		 float nota1 = Float.parseFloat(leer.readLine());
		 
		 System.out.println("Introduce nota profesor 2: ");
		 float nota2 = Float.parseFloat(leer.readLine());
		 int nota3= (int)((Math.random() * 10) + 1);
		 float media = (float) ((nota1+nota2+nota3)/3);
		 System.out.println("Nota profesor 3 aletoria: " + nota3 );
		 System.out.println("Nota media del concursante: " + media);
	}

}
