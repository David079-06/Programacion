import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej5 {
	public static Boolean paroimpar(int num) {
		boolean par;
				if (num%2==0){
					par=true;
				}else {
					par=false;
				}
				return par;
	}
		
		
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduce un numero: ");
		 int numero  = Integer.parseInt(leer.readLine());
		 if (paroimpar(numero)) {
			 System.out.println("Es par");
		 }else {
			 System.out.println("Es impar");
		 }
		 
	}

	
	
}

