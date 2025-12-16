import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
public class Ej2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
      List<String> nombres = new ArrayList<>();
      for (int i =0;i<6;i++) {
    	String nombre =leerString("Introduce el nombre: ");
    	 nombres.add(nombre);
      }
      int poseliminar=-1;
      do {
         poseliminar= leerInt("Introduce la posicion del nombre que desea eliminar:");
      }while(poseliminar<0||poseliminar>6);
      for (String nombre:nombres) {
    	  System.out.println(nombres+" ");
      }
      System.out.println("");
      nombres.remove(poseliminar);
      for (String nombre:nombres) {
    	  System.out.println(nombres+" ");
      }
	}	
	
	
	
	public static String leerString(String mensaje) throws IOException {
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(mensaje);
		return leer.readLine();
	}
	public static int leerInt(String mensaje) throws NumberFormatException, IOException  {
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(mensaje);
		int num = Integer.parseInt(leer.readLine());
		return num;
	}
	public static double leerDouble(String mensaje) throws NumberFormatException, IOException  {
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(mensaje);
		double num = Double.parseDouble(leer.readLine());
		return num;
	}
}
