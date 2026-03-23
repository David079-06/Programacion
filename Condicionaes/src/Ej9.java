import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej9 {

	public static void main(String[] args) throws NumberFormatException, 
	IOException {
		// TODO Auto-generated method stub
		BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduzca el saldo solicitado: ");
		float saldo = Float.parseFloat(leer.readLine());
		if  (saldo <=1000000) {
			System.out.println("Interes del 5%");
	    } else if ( saldo >=1000001 && saldo <=2000000) {
	    System.out.println("Interes del 7% ");
	    } else if (saldo >= 2000001 && saldo<=5000000){
		System.out.println("Interes del 8% ");}	   
	    else if (saldo >= 5000001){
			System.out.println("Interes del 9% ");}	   
}
}