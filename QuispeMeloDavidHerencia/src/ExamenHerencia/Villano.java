package ExamenHerencia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Villano extends Personaje {
private String archienemigo;
private int numeroCrimenes;


protected void pedirDatos(ArrayList<Personaje> personajes) {
	BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
	super.pedirDatos(personajes);
	System.out.print("--- DATOS DE HÉROE ---");
	String  aliaspersonaje = "";

	boolean datosOK = false;
	while (!datosOK) {

		try {
			System.out.print("Archienemigo: ");
			archienemigo = leer.readLine();
			System.out.print("Numero de crimenes");
			numeroCrimenes =Integer.parseInt(leer.readLine());
			if (numeroCrimenes <0) {
				System.err.print("ERROR:No puede ser negativo");
				continue;
			}
		datosOK = true;
	}catch (IOException e) {
		System.out.println("Has introducido mal algún dato, crack");
		e.printStackTrace();
	

}


}
}
}
	

