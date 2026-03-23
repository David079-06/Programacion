import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej7 {

	
		public static void main(String[] args) throws IOException {
			boolean salir = false;
			System.out.println("=== Gestión de streams ===");
			do {
			//MOSTRAR MENU
			System.out.println("\n--- MENÚ PRINCIPAL ---");
			System.out.println("1.Cuánto dinero genero al mes");
			System.out.println("2. Cuántas horas está haciendo streaming a la semana");
			System.out.println("3. Medir su éxito");
			System.out.println("4. Calcular su CPM (coste por mil visualizaciones)");
			System.out.println("5. Salir");
			int opcion = leerint("Elige una opción: ");
			switch (opcion) {
			case 1:
			int preciosub= leerint("Precio subcripcion:");
			int subs=leerint("Numero de subcripciones:");
			float resultado =Multiplicar(preciosub,subs);
			System.out.println("Dinero generado este mes: " +resultado);
			break;
			case 2:
			
			int diasstream= leerint("Dias haciendo stream:");
			int horasstream= leerint("Horas de stream del dia:");
			float resultado1 = Multiplicar(diasstream,horasstream);
			System.out.println("Horas de stream en la semana: " +resultado1);
			break;
			case 3:
			
			int totalvisualizacion= leerint("Visualizaciones totales del mes:");
			int totalstream= leerint("Streams totales del mes:");
			float resultado2= division(totalvisualizacion,totalstream);
			System.out.println("Promedio de visualizaciones por stream: " +resultado2);
			break;
			case 4:
			
			float ingresostotal= leerint("Ingresos totales del mes:");
			float visualizacionestotal= leerint("Visualizaciones totales del mes:");
			float resultado3= division( ingresostotal,visualizacionestotal);
			System.out.println("Coste por mil visualizaciones: " +(resultado3*1000));
			break;
			case 5:
				salir = true;
				System.out.println("¡Hasta luego!");
				break;
				default:
				System.out.println("Opción no válida");
				}
				}while(!salir);
				

	}
public static float Multiplicar(int num1,int num2) {
	float resultado=num1*num2;
	return resultado;
}
public static float division(float num1,float num2) {
	float resultado=num1/num2;
	return resultado;
}
public static int  leerint(String mensaje) throws NumberFormatException, IOException {
	BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
	System.out.println(mensaje);
	int num = Integer.parseInt(leer.readLine());
	return num;
}
}
