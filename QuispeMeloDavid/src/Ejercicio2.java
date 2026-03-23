import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio2 {

	public static void main(String[] args) throws NumberFormatException, 
	IOException {
		// TODO Auto-generated method stub
		BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduzca el usuario: ");
		String user= leer.readLine();
		System.out.println("Introduzca la contraseña: ");
		String pasword= leer.readLine();
		
		 if (user.equals("usuario1")&& pasword.equals("contraseña12345")) {
			 System.out.println("Votos CONCURSANTE1 : ");
			 int concursante1  = Integer.parseInt(leer.readLine());
			
			 System.out.println("Votos CONCURSANTE2 : ");
		      int concursante2  = Integer.parseInt(leer.readLine());
		    
			 int  porcentajeconcursante1 = ((concursante1*100)/(concursante1+concursante2));int  porcentajeconcursante2 = ((concursante2*100)/(concursante1+concursante2));	
		    if (porcentajeconcursante1>porcentajeconcursante2) {
		    	System.out.println("Porcentaje de votos CONCURSANTE 1:  " + porcentajeconcursante1+ " %");
		    
		    System.out.println("Porcentaje de votos CONCURSANTE 2:  " + porcentajeconcursante2+ " %");
		    System.out.println("Ganador : Concursante1");

		    }else {
		    	 System.out.println("Porcentaje de votos CONCURSANTE 1:  " + porcentajeconcursante1+ " %");
				    
				   System.out.println("Porcentaje de votos CONCURSANTE 2:  " + porcentajeconcursante2+ " %");
				   System.out.println("Ganador : Concursante2");

		    }
		    
		 }  else {
			 
			 System.out.println("Los datos introducidos son incorrectos ");
		 }
		 
			 
			 
	}

}
