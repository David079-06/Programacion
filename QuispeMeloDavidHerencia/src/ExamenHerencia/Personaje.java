package ExamenHerencia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


public class Personaje {
private String alias;
private String nombreReal;
private int nivelPoder;
private LocalDate fechaRegistro;


protected void pedirDatos(ArrayList<Personaje> personajes) {
	BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
	System.out.print("--- DATOS COMUNES ---");
	String  aliaspersonaje = "";
	boolean datosOK = false;
	while (!datosOK) {

		try {
			do {
			System.out.print("Alias:");
			aliaspersonaje = leer.readLine();
			if (estaRepetido(personajes, aliaspersonaje)== true) {
				System.err.print("ERROR: Ya existe un personaje con el alias ");
			}
			}while (estaRepetido(personajes, aliaspersonaje));
			
			alias = aliaspersonaje;

			System.out.print("Nombre real: ");
			nombreReal = leer.readLine();
			
			do {
				System.out.print("Nivel de poder (1-100): ");
				nivelPoder = Integer.parseInt(leer.readLine());
				if (nivelPoder < 0 || nivelPoder>100)
					System.err.println("EL nivel de poder solo puede ser entre 0-1000");
			} while (nivelPoder < 0 || nivelPoder>100);
			
			

			System.out.print("Fecha de registro (dd/MM/yyyy): ");
			DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			String fechaTemp = leer.readLine();
			fechaRegistro = LocalDate.parse(fechaTemp, formato);
		

			datosOK = true;
		} catch (IOException e) {
			System.out.println("Has introducido mal algún dato, crack");
			e.printStackTrace();
		}

	}

	
}
protected void mostrarDatos() {
	System.out.println("-- HÉROES CON IDENTIDAD SECRETA ---");
	System.out.println("Alias: " + this.alias);
	System.out.println("Nombre real: " + this.nombreReal);
	System.out.println("Nivel de poder " + this.nivelPoder);
	System.out.println("Fecha de nacimiento " + this.fechaRegistro);
	
	
}

private boolean estaRepetido(ArrayList<Personaje> personajes, String aliaspersonaje) {
	for (int i = 0; i < (personajes.size() - 1); i++) {
		
		if (personajes.get(i).getAlias().equalsIgnoreCase(aliaspersonaje) ) {
			return true;
		}

	}
	return false;
	
}


public String getAlias() {
	return alias;
}

public String getNombreReal() {
	return nombreReal;
}


public int getNivelPoder() {
	return nivelPoder;
}


public LocalDate getFechaRegistro() {
	return fechaRegistro;
}





}
