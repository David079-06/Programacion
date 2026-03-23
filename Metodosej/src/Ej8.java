import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej8 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		boolean salir = false;
		System.out.println("=== CALCULADORA DE GASTOS UNIVERSITARIOS ===");
		float Gastosbasicos=0;
		float Gastosocio=0;
		float Gastostotales=Gastosbasicos+Gastosocio;
		float presupuesto=0;
		do {
		System.out.println("\n--- MENÚ PRINCIPAL ---");
		System.out.println("1. Calcular gastos básicos (alquiler, comida, transporte)");
		System.out.println("2. Calcular gastos de ocio (salidas, suscripciones)");
		System.out.println("3. Comparar con presupuesto disponible");
		System.out.println("4. Salir");
	    int opcion = leerint1("Elige una opción: ");
		switch (opcion) {
		case 1:
		float Alquiler= leerint("Factura del alquiler:");
		float comida=leerint("Gasto en comida:");
		float transporte=leerint("Gasto en transporte:");
		float resultado=Suma(Alquiler,comida);
		float resultado1=Suma(resultado,transporte);
			Gastosbasicos=resultado1;
			System.out.println("Gastos basicos del mes son:" +Gastosbasicos + " euros");
		break;
		case 2:
			float salidas= leerint("Gasto en salidas:");
			float suscripciones=leerint("Gasto en suscripciones:");
			float resultado2= Suma(salidas,suscripciones);
				Gastosocio=resultado2;
				System.out.println("Gastos de ocio del mes son:" +Gastosocio + " euros");
		break;
		case 3:
			float beca= leerint("Dinero de la beca:");
			float dineropadres=leerint("Dinero de los padres:");
			float resultado3=Suma(beca,dineropadres);
			presupuesto=resultado3;
		break;
	
		case 4:
			salir = true;
			System.out.println("¡Hasta luego!");
			break;
			default:
			System.out.println("Opción no válida");
			}
			}while(!salir);
}
public static float Suma(float num1,float num2) {
float resultado=num1+num2;
return resultado;
}
public static float Resta(float num1,float num2) {
float resultado=num1-num2;
return resultado;
}
public static float leerint(String mensaje) throws NumberFormatException, IOException {
BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
System.out.println(mensaje);
float num = Float.parseFloat(leer.readLine());
return num;

	}
public static int leerint1(String mensaje) throws NumberFormatException, IOException {
BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
System.out.println(mensaje);
int num = Integer.parseInt(leer.readLine());
return num;

	}

}
