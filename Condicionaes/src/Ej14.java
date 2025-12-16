import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej14 {

	public static void main(String[] args)throws NumberFormatException, 
	IOException   {
		// TODO Auto-generated method stub
		BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Kilogramos de uva (Kg): ");
		float kilos = Float.parseFloat(leer.readLine());
		System.out.println("Tipo de uva (A/B): ");
		String tipo= leer.readLine();
		System.out.println("Tamaño (1/2): ");
		int tamaño  = Integer.parseInt(leer.readLine());
		 float precinicial= (float) 2.50;
		if  (tipo.equals("A")) { if ( tamaño == 1){  
			System.out.println("Su ganancia es de: "+ ((kilos*0.20)+(kilos*precinicial)) + " euros");
			} else  
			  System.out.println("Su ganancia es de: "+ ((kilos*0.30)+(kilos*precinicial)) + " euros");
	     } else  { if (tamaño == 1){
	    	 System.out.println("Su ganancia es de: "+ ((kilos*precinicial)-(kilos*0.30)) + " euros");
	     }else 
	    	 System.out.println("Su ganancia es de: "+ ((kilos*precinicial)-(kilos*0.50)) + " euros");
	}
	}
}
