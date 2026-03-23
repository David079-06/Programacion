import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej7 {

	public static void main(String[] args)throws NumberFormatException, 
	IOException   {
		// TODO Auto-generated method stub
		BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduzca su calificacion: ");
		  float nota = Float.parseFloat(leer.readLine());
		if  (nota<3&& nota==0) {
			System.out.println("Muy Deficiente ");
	    } else if ( 3<= nota && nota<5) {
	    System.out.println("Insuficiente ");
	    } else if (nota < 6 && nota >=5){
		System.out.println(" Bien ");}
	    else if (nota < 9 && nota == 6){
			System.out.println(" Notable ");}
	    else if (nota == 10 && nota >=9){
			System.out.println(" Sobresa1liente ");}

		
		
		
		
	}

}
