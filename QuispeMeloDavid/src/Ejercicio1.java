import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio1 {

	public static void main(String[] args) throws NumberFormatException, 
	IOException{
		// TODO Auto-generated method stub
		BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Nombre: ");
		String nombrepartipante= leer.readLine();
		
		System.out.println("Año de nacimiento: ");
		int añonacimiento  = Integer.parseInt(leer.readLine());
				
		System.out.println("¿Has sido expulsado?(si/no): ");
		String expulsado= leer.readLine();
		

		System.out.println("Puntuación media: ");
		float puntuaciónmedia = Float.parseFloat(leer.readLine());
		System.out.println("------------------------------------");
		System.out.println("Concursante guardado correctamente");
	
	;
	    boolean expulsado2;
	   if (expulsado.equals("si")) {
	    expulsado2= true;
	 } else {
	     expulsado2 = false;
	 }
	   System.out.println("¿Quiere ver el concursante guardado?(S/N): ");
		String verconcursante= leer.readLine();
		  char verconcursante2 = verconcursante.charAt(0);
	 
		  if ( verconcursante2 ==  'S') {
			System.out.println(	nombrepartipante +","	+ 	añonacimiento+ " años,Expulsada:"+expulsado2 +", Puntuación Media: " + puntuaciónmedia);
		}else if  ( verconcursante2 =='N') {
			System.out.println("SALIENDO DEL PROGRAMA");
		}else {
			System.out.println("OPCIÓN ERRóNEA");
		
		}
	}
}

