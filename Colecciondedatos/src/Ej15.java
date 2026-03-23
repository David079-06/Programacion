import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej15 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
boolean salir = false;
		
		do {
			System.out.println("SISTEMA DE GESTIÓN DE TORNEO DE VIDEOJUEGOS");
			System.out.println("Opción 1: Registro de Equipos");
			System.out.println("Opción 2: Registrar Puntuación de Jornada.");
			System.out.println("Opción 4: Análisis de Rendimiento.");
            System.out.println("Opción 5: Descalificar Equipo.");
            System.out.println("Opción 6: Salir.");
			
			int opcion = leerInt("Introduce una opcion: ");
			
			switch(opcion) {
			case 1:
			
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
               
                break;
            case 5:
               
                break;
            case 6:
                System.out.println("¡Hasta pronto!");
                salir = true;
                break;
			default:
				System.out.println("Opcion no valida");
			}
			
		}while(!salir);
	}
	
	public static int leerInt(String mensaje) throws NumberFormatException, IOException  {
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(mensaje);
		int num = Integer.parseInt(leer.readLine());
		return num;
	}
	
	public static String leerString(String mensaje) throws IOException {
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(mensaje);
		return leer.readLine();
	}
}
