import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
		boolean salir = false;
		System.out.println("=== BIENVENIDO AL GESTOR DE NOTAS DE EXAMEN ===");
		float nota=0;
		do {
			System.out.println("\n--- MENÚ PRINCIPAL ---");
			System.out.println("1. Introducir nota del examen");
			System.out.println("2. Comprobar si está aprobado o suspenso");
			System.out.println("3. Calcular nota con extra de participación (+0.5)");
			System.out.println("4. Comparar nota con la media del grupo");
			System.out.println("5. Salir");
			System.out.print("Elige una opción: ");
			int opcion = Integer.parseInt(leer.readLine());
			switch (opcion) {
			case 1:
			System.out.println("=== INTRODUCIR NOTA ===");
			System.out.println("Introduce la nota del examen (0-10):  ");
			float nota2 = Float.parseFloat(leer.readLine());
			nota = nota+nota2;
				 System.out.println("Nota registrada: " + nota );
				 
		    break;
			case 2:
			System.out.println("=== COMPROBAR APROBADO/SUSPENSO ===");
			if (nota>=5 && nota<=10) {
				 System.out.println("Aprobado. Tu nota es:" + nota);
				 
			}else 
				 System.out.println("Suspenso. Tu nota es:" + nota);
			break;
			case 3:
			System.out.println("=== CALCULAR CON EXTRA DE PARTICIPACIÓN ===");
             float extra = (float) 0.5;
				 System.out.println("Nota original: "+ nota );
				 System.out.println("Extra de participación: "+ "+"+ extra);
				 System.out.println("Nota final: "+ (nota+extra));
		    break;
			case 4:
			System.out.println("=== COMPARAR CON MEDIA DEL GRUPO ===");
			System.out.println("Introduce la media del grupo:  ");
			float media = Float.parseFloat(leer.readLine());
			System.out.println("Tu nota:" + nota);
			System.out.println("Media del grupo: "+media);
			if (nota<media) {
				float diferencia=nota-media;
				
				System.out.println("Estás por debajo de la media" );
				System.out.println("Diferencia: " +diferencia);
				
			}else if (nota>media) {
            float diferencia=nota-media;
				
				System.out.println("Estás por encima  de la media" );
				System.out.println("Diferencia: " +diferencia);
			}else if (nota==media) {
				System.out.println("Igual a la media" );
			    System.out.println("Diferencia: 0");
			}
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

	}


