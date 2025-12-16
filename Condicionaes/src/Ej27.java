import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ej27 {


	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
		int numero;
		
		//CoN DO-WHILE
		do {
			System.out.println("Introduce un numero");
			numero = Integer.parseInt(lector.readLine());
			if(numero % 2 == 0)
				System.out.println("Multiplo de 2");
			if(numero % 3 == 0)
				System.out.println("Multiplo de 3");
			if(numero % 5 == 0)
				System.out.println("Multiplo de 5");
		}while(numero != 0);
		
		//cON WHILE
		System.out.println("Introduce un numero");
		numero = Integer.parseInt(lector.readLine());
		while(numero != 0) {
			System.out.println("Introduce un numero");
			numero = Integer.parseInt(lector.readLine());
			if(numero % 2 == 0)
				System.out.println("Multiplo de 2");
			if(numero % 3 == 0)
				System.out.println("Multiplo de 3");
			if(numero % 5 == 0)
				System.out.println("Multiplo de 5");
		}
	}


}
