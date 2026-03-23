import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej23 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int sumatotal=0;
		int[][]numeros= new int [4][4];
		for(int fila = 0; fila<numeros.length; fila++) {
			for(int columna = 0; columna<numeros[fila].length; columna++) {
				numeros[fila][columna] = leerint("Introduce un numero para "
								+ fila + " x " + columna + ":");
				
				sumatotal+=numeros[fila][columna];
			}
			System.out.println("La suma total es: " +sumatotal);
		}
	}
	public static int  leerint(String mensaje) throws NumberFormatException, IOException {
		BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
		System.out.println(mensaje);
		int num = Integer.parseInt(leer.readLine());
		return num;
}
}
