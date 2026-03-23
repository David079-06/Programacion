import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Ej5 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		 List<Integer> numeros = new ArrayList<>();
		int numero;
		int sumanumero = 0;
		do {
	         numero= leerInt("Introduce los numeros a sumar:");
	         if(numero!=-1)
	        	 numeros.add(numero);
	      }while(numero!=-1);
	    	for (int n:numeros) {
		sumanumero +=n;
	    	}
	      System.out.println("La suma es:"+sumanumero);
	}
	public static int leerInt(String mensaje) throws NumberFormatException, IOException  {
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(mensaje);
		int num = Integer.parseInt(leer.readLine());
		return num;
	}
}
