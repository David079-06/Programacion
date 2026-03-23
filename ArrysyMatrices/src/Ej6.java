import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej6 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
int [] numeros= new int [7];
double sumatotal=0;
double media=0;
int numporencima=0;
int numpordebajo=0;
for (int i=0;i<numeros.length;i++) {
	numeros[i] = leerint("Introduce un numero: ");
	sumatotal += numeros[i];
	media = ( (sumatotal/  numeros.length));}
	
	for (int i=0;i<numeros.length;i++) {
	if (numeros[i]<media) {
		numpordebajo++;
	}else if (numeros[i]>media) {
		numporencima++;
	}
	}

System.out.println("La media es " + media);
System.out.println("Hay " + numporencima + " numeros por arriba");
System.out.println("Hay " + numpordebajo + " numeros por abajo");

	}
	public static int  leerint(String mensaje) throws NumberFormatException, IOException {
		BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
		System.out.println(mensaje);
		int num = Integer.parseInt(leer.readLine());
		return num;
}
}
