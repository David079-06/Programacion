import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej27 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int[][]numeros= new int [5][3];
		for(int fila = 0; fila<numeros.length; fila++) {
			for(int columna = 0; columna<numeros[fila].length; columna++) {
				numeros[fila][columna] = leerint("Introduce un numero para "
								+ fila + " x " + columna + ":");
		   }
		}
		int[] sumaTotal = new int[numeros[0].length];
		for(int fila = 0; fila<numeros.length; fila++) {
			for(int columna = 0; columna<numeros[fila].length; columna++) {
				sumaTotal[columna] += numeros[fila][columna];
			}
			
		}
		for(int i=0; i<sumaTotal.length; i++) {
			System.out.println("La suma de la columna " + i + " es " + sumaTotal[i]);
		}
	}	
	public static int  leerint(String mensaje) throws NumberFormatException, IOException {
		BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
		System.out.println(mensaje);
		int num = Integer.parseInt(leer.readLine());
		return num;
}
}
