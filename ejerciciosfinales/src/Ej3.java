import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej3 {



public static void main(String[] args)throws NumberFormatException, 
IOException  {

BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
boolean salir = false;
System.out.println("==== BIENVENIDO A TU CUENTA BANCARIA ====");
float saldo=0;
do {
	
	System.out.println("\n--- MENÚ PRINCIPAL ---");
	System.out.println("1. Ingresar dinero");
	System.out.println("2. Retirar dinero");
	System.out.println("3. Consultar saldo actual");
	System.out.println("4. Comprobar si puedes comprar videojuego (60€)");
	System.out.println("5. Simular ahorro mensual");
	System.out.println("6. Salir");
	System.out.print("Elige una opción: ");
	int opcion = Integer.parseInt(leer.readLine());
	switch (opcion) {
	case 1:
	System.out.println("=== INGRESAR DINERO ===");
	System.out.println("Introduce la cantidad a ingresar: ");
	float ingresar = Float.parseFloat(leer.readLine());
	 saldo =saldo + ingresar;
		 System.out.println("Has ingresado " + ingresar + "€");
		 System.out.println("Tu nuevo saldo es: " +saldo + "€");
    break;
	case 2:
	System.out.println("=== RETIRAR DINERO ===");
	System.out.println("Introduce la cantidad a retirar: ");
	float retirar = Float.parseFloat(leer.readLine());
	saldo=saldo-retirar;
	System.out.println("Has retirado"+ retirar + "€");  
	 System.out.println("Tu nuevo saldo es: " +saldo + "€");
	break;
	case 3:
	System.out.println("=== CONSULTAR SALDO ===");
	System.out.println("Tu saldo actual es:" + saldo);
	
	break;
	case 4:
	System.out.println("=== COMPRAR VIDEOJUEGO ===");
	  int juego=60;
	if (saldo<60) { 
	float faltan=juego-saldo;
		 System.out.println("No tienes suficiente dinero para el videojuego");
		 System.out.println("Precio videojuego: "+ juego + "€");
		 System.out.println("Tu saldo: "+ saldo + "€");
		 System.out.println("Te faltan: "+ faltan + "€");
	 } else {
		 float sobra=saldo-juego;
		 System.out.println("Tienes suficiente dinero para el videojuego");
		 System.out.println("Precio videojuego: "+ juego + "€");
		 System.out.println("Tu saldo: "+ saldo + "€");
		 System.out.println("Te sobra: "+ sobra + "€");
		 
		 
	 }
		
    break;
	
	
	case 5:
	System.out.println("=== SIMULAR AHORRO MENSUAL ===");
	System.out.println("¿Cuánto quieres ahorrar cada mes?: ");
	float ahorro = Float.parseFloat(leer.readLine());
	
	System.out.println("¿Para cuántos meses?: ");
	float meses= Float.parseFloat(leer.readLine());
	float ahorro2=saldo;
	for (int i=1;i<=meses;i++) {
		 ahorro2=ahorro2+ahorro;
		 System.out.println("Mes " + i + ":" + ahorro2 +"€");
		
	}
	System.out.println("Resumen:");
	System.out.println("Saldo actual: " + saldo +"€");
	System.out.println("Total ahorrado en 7 meses: " + (meses*ahorro) +"€");
	System.out.println("Saldo final proyectado: " + (saldo+ahorro2) +"€");

	
	break;
	case 6:
	salir = true;
	System.out.println("¡Hasta luego!");
	break;
	default:
	System.out.println("Opción no válida");
	}
	}while(!salir);
		
}
}