import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
public class Ej3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		 List<Double> numeros = new ArrayList<>();
		 for (int i =0;i<8;i++) {
		    	double numero =leerDouble("Introduce los numeros: ");
		    	 numeros.add(numero);
		      }
		 double numerobuscado=leerInt("Introduca el numero buscado:");
		 if(numeros.contains(numerobuscado)==false) {
			 System.out.println("El numero no esta en la lista");
		 }else {
			 System.out.println("El numero si esta en la lista");
		 }
		 
		 
	}
	public static int leerInt(String mensaje) throws NumberFormatException, IOException  {
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(mensaje);
		int num = Integer.parseInt(leer.readLine());
		return num;
	}
	public static double leerDouble(String mensaje) throws NumberFormatException, IOException  {
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(mensaje);
		double num = Double.parseDouble(leer.readLine());
		return num;
	}
}
