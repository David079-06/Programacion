package EJ2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Granjero {
private String nombre;
private ArrayList <String> tipoFumigacion = new ArrayList<>();
private int m2;

public void pedirDatos() {
	BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
	boolean todoOk = false;
	String tipo="";
	do {
		try {
			System.out.println("Introduce tu nombre:");
			nombre = leer.readLine();
			
			while (tipoFumigacion.size() < 4) {
	            System.out.println("Introduce el tipo de fumigación " +
	                               "Malas hierbas, Langostas, Gusanos, Todo lo anterior o salir:");
	            tipo = leer.readLine();
	            if (tipo.equalsIgnoreCase("salir")) break;
	            if (!tipo.equalsIgnoreCase("malas hierbas") &&
	                !tipo.equalsIgnoreCase("langostas") &&
	                !tipo.equalsIgnoreCase("gusanos") &&
	                !tipo.equalsIgnoreCase("todo lo anterior")) {
	                
	                System.err.println("ERROR: No existe el tipo introducido");
	            } else {
	                tipoFumigacion.add(tipo);
	            }
	            if (tipoFumigacion.size() == 4) {
	                System.out.println("Límite de 4 tipos alcanzado.");
	            }
	        }
			System.out.println("Introduce el numero de metros cuadrados a fumigar:");
			this.m2 = Integer.parseInt(leer.readLine());
			todoOk = true;
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}

	} while (!todoOk);

}
public void guardarGranjero() {
	try {
	File f = new File("./Granjero.txt");
	FileWriter fw;
	fw = new FileWriter(f, true);
		PrintWriter pw = new PrintWriter(fw);
		pw.println("NOMBRE: "+ this.nombre);
		pw.println("TIPOS DE FUMIGACIÓN: " + getTipoFumigacion());
		pw.println("METROS CUADRADOS (m2): " + this.m2);
		
		pw.flush();
		pw.close();
		fw.close();
		
	} catch (IOException e) {
		e.printStackTrace();
	}
}
public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public ArrayList<String> getTipoFumigacion() {
	return tipoFumigacion;
}

public void setTipoFumigacion(ArrayList<String> tipoFumigacion) {
	this.tipoFumigacion = tipoFumigacion;
}

public int getM2() {
	return m2;
}

public void setM2(int m2) {
	this.m2 = m2;
}


}
