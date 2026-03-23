import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej11 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int []numeros= new int [10];
		int contador = 0;
		int numeroX=leerint("Introduce el valor X: ");
	for (int i=0;i<numeros.length;i++) {
		   numeros[i]=leerint("Introduce el numero: ");
	}
	for (int i=0;i<numeros.length;i++) {
		   if(numeroX>numeros[i]) {
			  contador=i;
		  }else {
			  
		  }
		  int []numeros2=new int [contador];
			System.out.println(numeros2[contador]+"   ");
		}
			
	}
	public static int  leerint(String mensaje) throws NumberFormatException, IOException {
		BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
		System.out.println(mensaje);
		int num = Integer.parseInt(leer.readLine());
		return num;
}
}