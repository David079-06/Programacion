import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExamenArrays {

	static BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) {
		int opcion = 0;
		String[] participantes = new String[6];
		String[] tentadores = new String[6];
		int[][] matrizTentacion = new int[6][6];

		do {
			try {
				System.out.println("\n=== LA ISLA DE JAVA ===");
				System.out.println("1. Llegada a la villa (Carga de Datos) ");
				System.out.println("2. ¡Hay más imágenes! (Actualizar Tentación)");
				System.out.println("3. Hoguera de Confrontación (Matriz y Estadísticas)");
				System.out.println("4. La luz de la tentación (Alarma) ");
				System.out.println("5. Montoya, por favor (Salir)");

				opcion = leerInt("Elige una opción: ");

				switch (opcion) {
				case 1:
					llegadaVilla(participantes, tentadores,  matrizTentacion);
					break;
				case 2:
					actualizarTentacion(participantes, tentadores, matrizTentacion);
					break;
				case 3:
					hogueraConfrontacion(participantes, tentadores, matrizTentacion);
					break;
				case 4:
					luzTentacion(participantes, tentadores, matrizTentacion);
					break;
				case 5:
					System.out.println("Montoya, por favor");
					System.out.println("Nos vemos en la proxima edición");
					break;
				default:
					System.out.println("Opción no válida. Introduce un número entre 1 y 5.");
				}
			} catch (NumberFormatException e) {
				System.out.println("Error: Debes introducir un número válido.");
			} catch (IOException e) {
				System.out.println("Error de entrada/salida: " + e.getMessage());
			}
		} while (opcion != 5);
	}

	// OPCION 1
	public static void llegadaVilla(String[] participantes, String[] tentadores, int[][] matrizTentacion) throws IOException {
		System.out.println("\n--- LLEGADA A LA VILLA ---");

		// Leer participantes
		System.out.println("Introduce los nombres de los 6 PARTICIPANTES:");
		for (int i = 0; i < participantes.length; i++) {
			String nombre;
			do {
				nombre = leerString("Participante " + (i + 1) + ": ");
				if (nombre.isEmpty() || nombre.isBlank() || nombre.equalsIgnoreCase("")) {
					System.out.println("El nombre no puede estar vacío. Inténtalo de nuevo.");
				}
			} while (nombre.isEmpty() || nombre.isBlank() || nombre.equalsIgnoreCase(""));
			participantes[i] = nombre;
		}

		// Leer tentadores
		System.out.println("\nIntroduce los nombres de los 6 TENTADORES:");
		for (int i = 0; i < tentadores.length; i++) {
			String nombre;
			do {
				nombre = leerString("Tentador  " + (i + 1) + ": ");
				if (nombre.isEmpty() || nombre.isBlank() || nombre.equalsIgnoreCase("")) {
					System.out.println("El nombre no puede estar vacío. Inténtalo de nuevo.");
				}
			} while (nombre.isEmpty() || nombre.isBlank() || nombre.equalsIgnoreCase(""));
			tentadores[i] = nombre;
		}

		System.out.println("\n¡Todos los participantes y tentadores han llegado a la villa!");

		// Inicializar matriz con ceros
		for (int i = 0; i < matrizTentacion.length; i++) {
			for (int j = 0; j < matrizTentacion[i].length; j++) {
				matrizTentacion[i][j] = 0;
			}
		}
		System.out.println("Matriz inicial, creada correctamente con 0");

	}

	// OPCION 2
	public static void actualizarTentacion(String[] participantes, String[] tentadores, int[][] matrizTentacion)
			throws IOException {
		System.out.println("\n--- ¡HAY MÁS IMÁGENES! ---");

		// Mostrar lista de participantes
		System.out.println("\nPARTICIPANTES:");
		for (int i = 0; i < participantes.length; i++) {
			System.out.println(i + ". " + participantes[i]);
		}

		// Mostrar lista de tentadores
		System.out.println("\nTENTADORES:");
		for (int i = 0; i < participantes.length; i++) {
			System.out.println(i + ". " + tentadores[i]);
		}

		try {
			// Pedir índice del participante
			int indiceParticipante = leerInt("\nIntroduce el índice del participante (0-5): ");

			while (indiceParticipante < 0 || indiceParticipante > 5) {
				System.out.println("Índice de participante no válido.");
				indiceParticipante = leerInt("Introduce el índice del participante (0-5): ");
			}

			// Pedir índice del tentador
			int indiceTentador = leerInt("Introduce el índice del tentador (0-5): ");

			while (indiceTentador < 0 || indiceTentador > 5) {
				System.out.println("Índice de tentador no válido.");
				indiceTentador = leerInt("Introduce el índice del tentador (0-5): ");
			}
		
			// Pedir grado de tentación
			int gradoTentacion = leerInt("Introduce el grado de tentación a sumar: ");

			// Actualizar matriz
			matrizTentacion[indiceParticipante][indiceTentador] += gradoTentacion;

			// No puede superar 100
			if (matrizTentacion[indiceParticipante][indiceTentador] > 100) {
				matrizTentacion[indiceParticipante][indiceTentador] = 100;
			}

			System.out.println("\n¡Tentación actualizada! " + participantes[indiceParticipante] + " y "
					+ tentadores[indiceTentador] + " ahora tienen un nivel de "
					+ matrizTentacion[indiceParticipante][indiceTentador]);

		} catch (NumberFormatException e) {
			System.out.println("Error: Debes introducir números válidos.");
		}

	}

	// OPCION 3
	public static void hogueraConfrontacion(String[] participantes, String[] tentadores, int[][] matrizTentacion)
			throws IOException {
		System.out.println("\n--- HOGUERA DE CONFRONTACIÓN ---");

		System.out.println("\nMATRIZ DE TENTACIÓN:");

		 // Mostrar matriz con formato tabla
        System.out.println("\nMATRIZ DE TENTACIÓN:");
        System.out.print("            ");
        for (int j = 0; j < 6; j++) {
            System.out.printf("%-12s", tentadores[j]);
        }
        System.out.println();
        
        for (int i = 0; i < 6; i++) {
            System.out.printf("%-12s", participantes[i]);
            for (int j = 0; j < 6; j++) {
                System.out.printf("%-12d", matrizTentacion[i][j]);
            }
            System.out.println();
        }
		
		// Calcular participante más infiel (suma de fila más alta)
		int maxSuma = 0;
		int indiceMaxInfiel = 0;

		for (int i = 0; i < 6; i++) {
			int sumaFila = 0;
			for (int j = 0; j < 6; j++) {
				sumaFila += matrizTentacion[i][j];
			}
			if (sumaFila > maxSuma) {
				maxSuma = sumaFila;
				indiceMaxInfiel = i;
			}
		}

		System.out.println("\nPARTICIPANTE MÁS INFIEL: " + participantes[indiceMaxInfiel]
				+ " con una tentación total de " + maxSuma);

		// Encontrar el grado de tentación más alto
		int maxTentacion = 0;
		int participanteMaxTentacion = 0;
		int tentadorMaxTentacion = 0;

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (matrizTentacion[i][j] > maxTentacion) {
					maxTentacion = matrizTentacion[i][j];
					participanteMaxTentacion = i;
					tentadorMaxTentacion = j;
				}
			}
		}

		System.out.println("MAYOR CONEXIÓN: " + participantes[participanteMaxTentacion] + " y "
				+ tentadores[tentadorMaxTentacion] + " con un nivel de tentación de " + maxTentacion);

	}
	
	//OPCION 4
	public static void luzTentacion(String[] participantes, String[] tentadores, int[][] matrizTentacion) throws IOException {
		System.out.println("\n--- LA LUZ DE LA TENTACIÓN ---");
		
		try {
            int umbral;
            do {
                umbral = leerInt("Introduce el umbral de alarma (1-100): ");
                
                if (umbral < 1 || umbral > 100) {
                    System.out.println("El umbral debe estar entre 1 y 100. Inténtalo de nuevo.");
                }
            } while (umbral < 1 || umbral > 100);
            
            boolean hayAlarma = false;
            
            System.out.println("\nBUSCANDO CONEXIONES PELIGROSAS...\n");
            
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 6; j++) {
                    if (matrizTentacion[i][j] >= umbral) {
                        System.out.println("¡ALARMA! " + participantes[i] + " y " + 
                                         tentadores[j] + " tienen un nivel de tentación de " + 
                                         matrizTentacion[i][j]);
                        hayAlarma = true;
                    }
                }
            }
            
            if (!hayAlarma) {
                System.out.println("Noche tranquila. La isla duerme. Por ahora");
            }
            
        } catch (NumberFormatException e) {
            System.out.println("Error: Debes introducir un número válido.");
        }
	}

	// UTILS
	public static int leerInt(String mensaje) throws NumberFormatException, IOException {
		System.out.print(mensaje);
		int num = Integer.parseInt(leer.readLine());
		return num;
	}

	public static String leerString(String mensaje) throws IOException {
		System.out.print(mensaje);
		return leer.readLine();
	}

}