package ej7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class consecionario {

	private int id;
	private String marca;
	private String modelo;
	private int año;
	private double kilometraje;
	private double precio;
	
	public void pedirDatos(int id) throws IOException {
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
		this.id = id;
		boolean datosOK = false;
		while (!datosOK) {
	try {
		System.out.print("Introduce la marca del coche : ");
		marca =leer.readLine();
		System.out.print("Introduce el modelo del coche : ");
		modelo=leer.readLine();
		
		do {
			System.out.print("Introduce el año del coche : ");
			año=Integer.parseInt(leer.readLine());
			if (año<1900 || año>2026) {
				System.err.println("Introduce el año correctamente");
				System.err.println("");
			}
		}while(año<1900 || año>2026) ;
		
		do {
			System.out.print("Introduce el kilometraje del coche : ");
			kilometraje=Double.parseDouble(leer.readLine());
			if (kilometraje<0) {
				System.err.println("No puede ser negativo");
				System.err.println("");
			}
		}while(kilometraje<0) ;
		
		do {
			System.out.print("Introduce el precio del coche");
			precio=Double.parseDouble(leer.readLine());
			if (precio<0) {
				System.err.println("No puede ser negativo");
				System.err.println("");
			}
		}while(precio<0) ;
		
		
		datosOK=true;
	}catch (Exception e) {
		System.err.println("Has introducido algun dato mal");
		System.out.println("");
	}
		}
	}
	
	public int AñosdeAntiguedad ( ) {
	
	 int añoAntiguedad = 2026-año;
	 return añoAntiguedad;
		
	}
	public boolean cochenuevo () {
		 if(año>=2023) {
			 return true;
		 }else {
			 return false;
		 }
	
		}
	public void Añadirkilometros( int id) throws NumberFormatException, IOException {
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
		do {
		System.out.print("¿Cuantos kilometros desea añadirle?: "   );
		double kilometrosañadidos=Double.parseDouble(leer.readLine());
		kilometraje += kilometrosañadidos;
		if (kilometrosañadidos<0) {
			System.err.println("No puede ser negativo");
			System.err.println("");
		}
	}while(kilometraje<0) ;
	}
	public void  Descuento() throws NumberFormatException, IOException {
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("¿Que porcentaje de descuento desea aplicarle? "  );
		double porcentajedescuento=Double.parseDouble(leer.readLine());
		double descuento= (precio*(porcentajedescuento/100.0));
		double preciofinal= (precio-descuento);
		if (porcentajedescuento<0 || porcentajedescuento>100) {
			System.err.println("Introduzca un valor correcto");
		}
	while(preciofinal>0) ;
		System.out.println("Precio final del coche: " + preciofinal  );
	}
	public void mostrarDatos() {
		System.out.println("COCHE " + id);
		System.out.println("\tMarca: " + marca);
		System.out.println("\tModelo: " + modelo);
		System.out.println("\tAño: " + año);
		System.out.println("\tKilometraje: " + kilometraje + " KM");
		System.out.println("\tPrecio: " + precio+ " $");
	}
	
	public int getId() {
		return id;
	}
	
}
