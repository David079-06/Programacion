import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej11 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int N=leerint("Introduce un numero:");
	    imprimir(N);
	}
public static void imprimir(int  num) {
for(int i=num;i>=1;i--) {
	System.out.println(i);
}
}
public static int  leerint(String mensaje) throws NumberFormatException, IOException {
	BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
	System.out.println(mensaje);
	int num = Integer.parseInt(leer.readLine());
	return num;
}
}