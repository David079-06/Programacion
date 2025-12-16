import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej26 {

	public static void main(String[] args)throws NumberFormatException, 
	IOException  {
		// TODO Auto-generated method stub
		BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
	int media;
	int numInt=0;
	double numtotal=5;
	int suma=0;
	while (numInt<=numtotal) {
		System.out.println("Dame un número: ");
   	int numero = Integer.parseInt(leer.readLine());
	  suma = suma + numero;
		numInt++;
		
	}
         media = (int) (suma/numtotal);
         System.out.println("La media es " + media);
	}

}
