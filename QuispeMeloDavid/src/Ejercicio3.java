import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio3 {

	public static void main(String[] args)throws NumberFormatException, 
	IOException {
		// TODO Auto-generated method stub
		BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Nombre: ");
		String nombreconcursante= leer.readLine();
		
		System.out.println("¿Favorito de la semana?(S/N: ");
		String favorito= leer.readLine();
		
		System.out.println("Porcentaje de voto: ");
		float porcentaje = Float.parseFloat(leer.readLine());		
		System.out.println("¿Dúo antes?(S/N): ");
		String dúo= leer.readLine();
         if (favorito.equals("S") || porcentaje >=80 ) { 
        	 System.out.println("Tipo de tema: Solitario ");
        	 
        	 
         }  else if (porcentaje< 60 || dúo.equals("N")) {
        	 System.out.println("Tipo de tema: Dúo ");
         }else {
        	 System.out.println("Tipo de tema: Grupo ");
         }
        

	}

}
