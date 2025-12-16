import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej20 {

	public static void main(String[] args)throws NumberFormatException, 
	IOException  {
		// TODO Auto-generated method stub
		BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduzca un número entre 1-12: ");
		 int Number  = Integer.parseInt(leer.readLine());
		 switch (Number) {
		 case 1:
		 System.out.println("Invierno ");
		 break;
		 case 2:
			 System.out.println("Invierno ");
			 break;
		 case 3:
			 System.out.println("Primavera ");
			 break;
		 case 4:
			 System.out.println("Primavera ");
			 break;
			 
		 case 5:
			 System.out.println("Primavera ");
			 break;
		 case 6:
			 System.out.println("Verano ");
			 break;
		 case 7:
			 System.out.println("Verano ");
			 break;
		 case 8:
			 System.out.println("Verano ");
			 break;
		 case 9:
			 System.out.println("Otoño ");
			 break;
		 case 10:
			 System.out.println("Otoño ");
			 break;
		 case 11:
			 System.out.println("Otoño ");
			 break;
		 case 12:
			 System.out.println("Invierno ");
			 break;
	
		 
		 }
	}

}
