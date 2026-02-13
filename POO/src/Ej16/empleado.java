package Ej16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

public class Empleado {
 private int ID;
 private String nombreEmpleado;
 private double[] horasSemanales = new double [7];
 private double tarifaHora;
 
 
 public void pedirDatosEmpleado (int id) {
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
		boolean datosOK = false;
		while (!datosOK) {
	 this.id=id;
	try {
		System.out.println("Introduce el nombre del empleado: ");
		nombre= leer.readLine();
		System.out.println("Introduce la tarifa horaria del empleado: ");
		tarifahora= Double.parseDouble(leer.readLine());
		datosOK=true;
	}catch (IOException e) {
		System.err.println("Has introducido algun dato mal");
		
		e.printStackTrace();
	}
		}	
 }
 
 public void pedirHorasEmpleado () {
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
		boolean datosOK = false;
		while (!datosOK) {
		int dia;
		double horas;
	try {
		do {
			
			System.out.println("Introduce el dia de la semana (0-Lunes, 6-Domingo): ");
		    dia= Integer.parseInt(leer.readLine());
			if((dia)<0 || (dia)>6) {
				System.err.println("Introduce el dia correctamente");
			}
			
		}
		while(dia<0 || dia>6);
		
	
		do {
		System.out.println("Introduce las horas para el día " + dia + ": ");
         horas = Double.parseDouble(leer.readLine());

        if (horas < 0 || horas > 24) {
            System.err.println("Error: Las horas deben estar entre 0 y 24.");
          
        } 
        
            this.horastrabajadas[dia] = horas;
            System.out.println("Horas registradas correctamente.");
            datosOK = true; 
		}while(horas < 0 || horas > 24);
	}catch (IOException e) {
		System.err.println("Has introducido algun dato mal");
		
		e.printStackTrace();
	}
		}	
}
 public void mostrarSemana () throws IOException {
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("--- Resumen Semanal de " + nombre + " ---");
	double sumaTotal = 0;
	for (int i = 0; i < horastrabajadas.length; i++) {
	    System.out.println("Día " + i + ": " + horastrabajadas[i] + " horas");
	    sumaTotal += horastrabajadas[i];
	}
	System.out.println("Total horas acumuladas: " + sumaTotal);
			
}
 
	 public double salario () throws IOException {
			BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
			double suma=0;
			for (double horas :horastrabajadas) {
				suma+= horas;
			}
			return suma*tarifahora;
				
	}
	 
	 public double getTotalhoras () throws IOException {
			BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
			double suma=0;
			for (double horas :horastrabajadas) {
				suma+= horas;
			}
			return suma;
				
	}
	 
	 public  void tienedescanso () throws IOException {
			BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
			double suma=0;
			String descanso="";
			try {
				for (double horas :horastrabajadas) 
				if(horas==0) {
					System.out.println("Empleado con ID "+ getId());
					System.out.println("Tiene descando" + getnombre());
					break;
				}
			
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
			
			
				
	}
 
 

	public int getId() {
		return id;
	}
	
	public  String getnombre() {
		return nombre;
	}
}

