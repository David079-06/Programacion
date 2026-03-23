import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej3 {

	public static int multiplicacion(int num1,int num2) {
	int resultado=num1*num2;
	return resultado;
	}
	
	
	public static void main(String[] args) throws NumberFormatException, 
	IOException {
		// TODO Auto-generated method stub
		BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduce un numero: ");
		  int numero1  = Integer.parseInt(leer.readLine());
		  int numero2  = Integer.parseInt(leer.readLine());
		  int multiplicacion= multiplicacion(numero1,numero2);
		  System.out.println(multiplicacion);
		  
	}
	
		

}
