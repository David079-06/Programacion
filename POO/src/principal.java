import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class principal {

	public static void main(String[] args) {
		  BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
		boolean salir = false;
		do {
			System.out.println("== Regristo de empleados  ==");
			System.out.println("1. Regristar empleadp");
			System.out.println("2  Clasificacion");
			System.out.println("3. Datoa empleado) ");
			System.out.println("4. Aumentar salario");
			System.out.println("5. Salir");
			
			System.out.println("Introduce una opcion: ");
			int opcion = -1;
			boolean datosOK = false;
			while (!datosOK) {
			
					try {
						opcion = Integer.parseInt(leer.readLine());
					} catch (NumberFormatException | IOException e) {
						System.err.println("Solo puedes introducir numeros");
					}
			
				datosOK = true;
			}

			switch (opcion) {
			case 1:
				
			
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
			
				break;
			case 5:
				
				salir = true;
				break;
			default:
				System.out.println("Opcion no valida");
			}

		} while (!salir);
	}
	

}
