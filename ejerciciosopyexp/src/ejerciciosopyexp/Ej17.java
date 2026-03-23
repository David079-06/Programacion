package ejerciciosopyexp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej17 {

	public static void main(String[] args)throws NumberFormatException, 
	IOException {
		// TODO Auto-generated method stub
		BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Su Nombre: ");
		String nomb = leer.readLine();
		System.out.println("Sus apellidos: ");
		String apellido = leer.readLine();
		System.out.println("Sus años: ");
		int años = Integer.parseInt(leer.readLine());
		System.out.println("Introduzca su email: ");
		String email = leer.readLine();
	    System.out.println("Número de asignaturas: ");
		int asig = Integer.parseInt(leer.readLine());
		System.out.println("Su nota media: ");
		int media= Integer.parseInt(leer.readLine());
        boolean mayor = años >18;
		boolean aprobado = media > 5;
		System.out.println("El estudiante " + nomb + " " + apellido);
		System.out.println("--------------------------------------- ");
		System.out.println("Email: " + email);
		System.out.println("Edad: " + años + " años");
		System.out.println("Número de asignaturas: " + asig );
		System.out.println("Nota media: " + media);
		System.out.println("Es mayor de edad:" + mayor );
		System.out.println("Aprobado: " + aprobado);
		System.out.println("Años para llegar a los 30: " + (30-años) + " años");
	}

}
