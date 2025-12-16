import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej49 {
	public static void main(String[] args)throws NumberFormatException, 
	IOException  {


BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
System.out.println("Introduce un número: ");
int numero=Integer.parseInt(leer.readLine());;
int contador=1;
                  for (int i=0;i<numero;i++) {
                	  for (int o=0;o<=contador;o++){
                		  
                		  System.out.print(contador);
                		  
                	  }
                	 contador ++;
                	 System.out.println(" ");
                  }
}
}