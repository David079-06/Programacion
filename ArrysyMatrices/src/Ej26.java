import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej26 {
		public static void main(String[] args) throws NumberFormatException, IOException {
			// TODO Auto-generated method stub
			int[][]numeros= new int [4][5];
			int sumafila =0;
			for(int fila = 0; fila<numeros.length; fila++) {
				for(int columna = 0; columna<numeros[fila].length; columna++) {
					numeros[fila][columna] = leerint("Introduce un numero para "
									+ fila + " x " + columna + ":");
			   }
			}
			for(int fila = 0; fila<numeros.length; fila++) {
				for(int columna = 0; columna<numeros[fila].length; columna++) {
					sumafila=sumafila+numeros[fila][columna];
				}
				System.out.println(sumafila);
			}
	}
				public static int  leerint(String mensaje) throws NumberFormatException, IOException {
					BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
					System.out.println(mensaje);
					int num = Integer.parseInt(leer.readLine());
					return num;
			}
	

}
