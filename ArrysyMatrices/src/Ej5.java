import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej5 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
int []	numeros=new int [8];
	for (int i=0;i<numeros.length;i++) {
		numeros[i] = leerint("Introduce un numero: ");
	}
	
	int numMayor= numeros [0];
	int posMayor=0;
	int numMenor= numeros [0];
	int posMenor=0;
	for (int i =0;i< numeros.length;i++) {
	 if (numeros[i]>numMayor) {
		 numMayor=numeros[i];
		 posMayor=i;
	 }else  if (numeros[i]<numMenor){
		 numMenor=numeros[i];
		 posMenor=i;
	 }
	 if (numeros[i] > numeros[posMayor]) {
			posMayor = i;
		}else if(numeros[i] < numeros[posMenor]) {
			posMenor = i;
		}
	}
	System.out.println("El numero mayor es " + numMayor + " y su posicion es " + posMayor);
	System.out.println("El numero menor es " + numMenor + " y su posicion es " + posMenor);

	
	}
	public static int  leerint(String mensaje) throws NumberFormatException, IOException {
		BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
		System.out.println(mensaje);
		int num = Integer.parseInt(leer.readLine());
		return num;
}
	
}
