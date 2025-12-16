import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EJ17 {

	public static void main(String[] args)throws NumberFormatException, 
	IOException {
		// TODO Auto-generated method stub
		BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Tiempo de llamada: ");
		int tiempo  = Integer.parseInt(leer.readLine());
		System.out.println("Dia de la llamada: ");
		String dia= leer.readLine();
		System.out.println("Turno (Mañana/Tarde: ");
		String turno= leer.readLine();

		if  (dia.equals("domingo")) { 
			  if (num2>num3) {
				  System.out.println("El orden es: " + num1+">" + num2 + ">" + num3);
		    } else 
		    	System.out.println("El orden es:" + num1+ ">" + num3 + ">" + num2);
		    } else  { 
		    	if () {
		    		System.out.println(num2+">" + num1 + ">" + num3);
		    } else 
		    	System.out.println(num2+">" + num3 + ">" + num1);
		    } else if ((num3>num1) && (num3> num2)){
		    	if (num1>num2) {  
		    		System.out.println(num3+">" + num1 + ">" + num2);
		    	} else 
		    	System.out.println(num3+">" + num2 + ">" + num1);
		
	}

}
