import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej4 {

	public static void main(String[] args) throws NumberFormatException, 
	IOException {
		// TODO Auto-generated method stub
		BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduce un numero: ");
		 int numero  = Integer.parseInt(leer.readLine());
		 for(int i=1;i<=10;i++) {
				int resultado=multiplicacion(numero,i);

				System.out.println(numero+"x"+i+"="+resultado);
				}
	}
	public static int multiplicacion(int num1,int num2) {
		int resultado=num1*num2;
		return resultado;
		}
}
