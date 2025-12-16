import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej22 {

	public static void main(String[] args)throws NumberFormatException, 
	IOException  {
		// TODO Auto-generated method stub
		BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduzca un número entre 1-12: ");
		 int number  = Integer.parseInt(leer.readLine());
		switch (number) {
		 case 1:
			
			   System.out.println("Enero tiene 31 dias ");
			 break;
			 case 2:
				 System.out.println("Febrero tiene 28 dias ");
				 break;
			 case 3:
				 System.out.println("Marzo tiene 31 dias ");
				 break;
			 case 4:
				 System.out.println("Abril tiene 30 dias ");
				 break;
				 
			 case 5:
				 System.out.println("Mayo tiene 31 dias ");
				 break;
			 case 6:
				 System.out.println("Junio tiene 30 dias ");
				 break;
			 case 7:
				 System.out.println("Julio tiene 31 dias ");
				 break;
			 case 8:
				 System.out.println("Agosto tiene 31 dias ");
				 break;
			 case 9:
				 System.out.println("Septiembre tiene 30 dias ");
				 break;
			 case 10:
				 System.out.println("Octubre tiene 31 dias ");
				 break;
			 case 11:
				 System.out.println("Noviembre tiene 30 dias ");
				 break;
			 case 12:
				 System.out.println("Diciembre tiene 31 dias ");
				 break;

		 
		 
		 }
	}

}
