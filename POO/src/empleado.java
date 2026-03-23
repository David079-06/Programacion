import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class empleado {
 private String nombre;
 private int permanencia;
 private double salario;
 private char clasificacion;
 
 private void PedirDatos () {
	 BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
	 boolean datosOK = false;
		while (!datosOK) {
	 try {
		 System.err.println("Introduce el nombre del empleado:");
		 nombre=leer.readLine();
		 System.err.println("Introduce los años de permanecnia:");
		 permanencia=Integer.parseInt(leer.readLine());
		 System.err.println("Introduce el salario del empleado:");
		 salario=Double.parseDouble(leer.readLine());
	 }catch (IOException e) {
			System.err.println("Has introducido algun dato mal");
			e.printStackTrace();
	 }
			}
	 
	 }


private  String Clasificacion (int permanencia, String nombre) {
this.nombre = nombre;
 this.permanencia = permanencia;
 
 
 
 return nombre;
}

}