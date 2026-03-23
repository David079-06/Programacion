package Ej16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class Persona {
	
private int DNI;
private String nombre;
private int edad;
private String nacionalidad;
private LocalDate fechaNacimiento ;


public void pedirDatos(ArrayList<Deportista> deportistas  ) {
	BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
	Random rand = new Random();

	int idGenerado = -1;
	do {
		idGenerado = rand.nextInt(30) + 1;
		System.err.println("He generado el numero: " + idGenerado);
	} while (estaRepetido(deportistas, idGenerado));
	System.out.println("Asignado el id " + idGenerado);
	DNI = idGenerado;
	boolean datosOK = false;
	while (!datosOK) {
	
		try {

			System.out.print("Introduce el nombre del estudiante: ");
			nombre = leer.readLine();

			datosOK = true;
		} catch (IOException e) {
			System.out.println("Has introducido mal algún dato, crack");
			e.printStackTrace();
		}

	}

}

private boolean estaRepetido(ArrayList<Deportista> deportistas, int idGenerado) {
	for (int i = 0; i < (deportistas.size() - 1); i++) {
		if (deportistas.get(i).getId() == idGenerado) {
			System.err.println("El numero esta repetido");
			return true;
		}

	}
	return false;

}
public int getId() {
	return DNI;
}
}
