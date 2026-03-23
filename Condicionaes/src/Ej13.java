import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej13 {

	public static void main(String[] args)throws NumberFormatException, 
	IOException  {
		// TODO Auto-generated method stub
		BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Número de horas trabajadas: ");
		float horas = Float.parseFloat(leer.readLine());
		if  (horas < 40) {
				System.out.println("Su sueldo sera: " + (horas*1000) +" pesetas");
		    } else if (horas > 40) {
		    System.out.println("Su sueldo sera: " + ((40*1000) + ((horas-40)*1500)   ));
		    } 
	}

}
