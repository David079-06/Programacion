import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej24 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int[][]numeros= new int [3][5];
		int numerospositivos=0;
		int numerosnegativos=0;
		int numeroscero=0;
		for(int fila = 0; fila<numeros.length; fila++) {
			for(int columna = 0; columna<numeros[fila].length; columna++) {
				numeros[fila][columna] = leerint("Introduce un numero para "
								+ fila + " x " + columna + ":");
				
				if(numeros[fila][columna]<0) {
					numerosnegativos++;
				}else if (numeros[fila][columna]>0) {
					numerospositivos++;
				}else {
					numeroscero++;	
				}
			}
			}
			System.out.println("Hay " +numerosnegativos + " números negativos , " +numerospositivos + " numeros positivos, y " +numeroscero+ " numeros que son ceros.");
			
			}
	
		public static int  leerint(String mensaje) throws NumberFormatException, IOException {
			BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
			System.out.println(mensaje);
			int num = Integer.parseInt(leer.readLine());
			return num;
	}
	}

