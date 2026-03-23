package ExamenFicheros;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Candidato {
private int id;
private String nombre;
private String partido;
private double numeroVotos;


public void pedirCandidato() throws IOException {
	System.out.println("Introduce los datos del nuevo candidato:");
	
		this.id = Lecturas.leerEntero("Introduce el id: ");

	
	this.nombre = Lecturas.leerString("Introduce el nombre: ");
	this.partido = Lecturas.leerOpcion("Introduce el partido (Partido JavaScriptero / Alianza Java Enterprise / P.C.D. /\r\n"
			+ "Movimiento IA First):", 
			new String[] {"Partido JavaScriptero", "Alianza Java Enterprise", "P.C.D.","Movimiento IA First"});
	
	do {
		this.numeroVotos = Lecturas.leerEntero("Votos iniciales: ");
		if (this.numeroVotos < 0) 
			System.out.println("ERROR: No pueden ser negativos.");
	} while (this.numeroVotos < 0);
}


public void escribirCandidato(File f, boolean añadir) throws IOException {
	FileWriter fw = new FileWriter(f, añadir);
	PrintWriter pw = new PrintWriter(fw);
	pw.println(this.id + "-" + this.nombre + "-" + this.partido + "-" + this.numeroVotos);
	pw.flush();
	pw.close();
	fw.close();
}

public void leerCandidato(String linea) {
	String[] datos = linea.split("-"); 
	this.id = Integer.parseInt(datos[0].trim());
	this.nombre = datos[1].trim();
	this.partido = datos[2].trim();
	this.numeroVotos = Double.parseDouble(datos[3].trim());
}


public int getId() {
	return id;
}

public String getNombre() {
	return nombre;
}


public String getPartido() {
	return partido;
}


public double getNumeroVotos() {
	return numeroVotos;
}


public void setNumeroVotos(double numeroVotos) {
	this.numeroVotos = numeroVotos;
}


}
