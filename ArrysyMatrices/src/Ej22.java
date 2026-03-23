import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej22 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int[][]numeros= new int [3][3];
		for(int fila = 0; fila<numeros.length; fila++) {
			for(int columna = 0; columna<numeros[fila].length; columna++) {
				numeros[fila][columna] = leerint("Introduce un numero para "
								+ fila + "x" + columna + ":");
			}
		}
		
		for(int fila = 0; fila<numeros.length; fila++) {
			for(int columna = 0; columna<numeros[fila].length; columna++) {
				System.out.print(numeros[fila][columna] + "\t");
			}
			System.out.println("");
		}
	}
	public static int  leerint(String mensaje) throws NumberFormatException, IOException {
		BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
		System.out.println(mensaje);
		int num = Integer.parseInt(leer.readLine());
		return num;
}
}
