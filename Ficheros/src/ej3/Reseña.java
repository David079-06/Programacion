package ej3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Reseña {
private String nombre;
private String nombreJuego;
private int calificacion;
private String comentario;


public void pedirDatos() {
	BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

	boolean todoOk = false;
	do {
		try {
			System.out.print("Introduzca su nombre: ");
			nombre = leer.readLine();
			System.out.print("Introduzca el nombre del videojuego: ");
			nombreJuego = leer.readLine();

				System.out.println("Introduzca la calificacion del videojuego : ");
				calificacion = Integer.parseInt(leer.readLine());
			   if (calificacion > 10 || calificacion < 0 ) {
				   System.err.println("ERROR: Introduzca la nota correctamente entre 0 y 10 ");
			   		continue;
			   }
			   System.out.println("Comentario sobre el juego : ");
			   comentario = leer.readLine();
			todoOk = true;
		}catch (Exception e) {
			System.err.println("Ha habido un error al registrar los datos. Intentelo de nuevo.");
		}
	} while (!todoOk);
}

public void escribirFichero() {
	try {
		File f = new File("./reseñas.txt");
		FileWriter fw = new FileWriter(f, true); 
		PrintWriter pw = new PrintWriter(fw);
		pw.println(nombre +";" + nombreJuego+";" +calificacion +";" +comentario);
	
		pw.flush();
		pw.close();
		fw.close();
	} catch (IOException e) {
		System.err.println("Error al escribir ");
	}

}
public String getNombre() {
	return nombre;
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}


public String getNombreJuego() {
	return nombreJuego;
}


public void setNombreJuego(String nombreJuego) {
	this.nombreJuego = nombreJuego;
}


public int getCalificacion() {
	return calificacion;
}


public void setCalificacion(int calificacion) {
	this.calificacion = calificacion;
}


public String getComentario() {
	return comentario;
}


public void setComentario(String comentario) {
	this.comentario = comentario;
}



}
