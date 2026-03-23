package ExamenFicheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Principal {


	public static void main(String[] args) throws IOException {
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

		boolean salir = false;
		do {
			System.out.println("\n=== CONSEJO DE PROGRAMADORES DE CYL ===");
			System.out.println("1. Añadir candidato");
			System.out.println("2. Ver candidatos de un partido");
			System.out.println("3. Actualizar votos de un candidato");
			System.out.println("4. Exportar acta final de resultados");
			System.out.println("5. Salir");
			System.out.print("Introduce una opción: ");

			int opcion = -1;
			boolean datosOK = false;
			while (!datosOK) {
				try {
					opcion = Integer.parseInt(leer.readLine());
					datosOK = true;
				} catch (NumberFormatException | IOException e) {
					System.err.println("Solo puedes introducir números.");
				}
			}

			switch (opcion) {
			case 1:
				System.out.println("-- AÑADIR CANDIDATO --");
				 AñadirCandidato();
				break;
			case 2:
				System.out.println("-- BUSCAR POR PARTIDO --");
				verCandidatosPorPartido();
				break;
			case 3:
				System.out.println("-- ACTUALIZAR VOTOS --");
				actualizarVotosCandidato();
				break;
			case 4:
				System.out.println("-- EXPORTAR ACTA FINAL --");
				exportarActaFinal();
				break;
			case 5:
				System.out.println("Saliendo del programa. ¡Hasta pronto!");
				salir = true;
				break;
			default:
				System.out.println("Opción no válida. Introduce un número entre 1 y 5.");
			}

		} while (!salir);
	}
	
	private static void AñadirCandidato ( ) throws IOException {
		Candidato c = new Candidato();
		File FICHERO_CANDIDATOS = new File("candidatos.txt");
		c.pedirCandidato();
		c.escribirCandidato(FICHERO_CANDIDATOS, true);
	}
	
	public static void verCandidatosPorPartido() throws IOException {
		File FICHERO_CANDIDATOS = new File("candidatos.txt");

		if (FICHERO_CANDIDATOS.exists()) {
	        String partidoBuscado = Lecturas.leerOpcion("Introduce el partido (Partido JavaScriptero / Alianza Java Enterprise / P.C.D. /\r\n"+ "Movimiento IA First):", 
			new String[] {"Partido JavaScriptero", "Alianza Java Enterprise", "P.C.D.","Movimiento IA First"});
			BufferedReader br = new BufferedReader(new FileReader(FICHERO_CANDIDATOS));
			int totalVotos = 0;
			boolean candidato_enc = false;

			String linea = br.readLine();
			while (linea != null) {
				Candidato candidatos = new Candidato();
				candidatos.leerCandidato(linea);
				if (candidatos.getPartido().equalsIgnoreCase(partidoBuscado)) {
					totalVotos += candidatos.getNumeroVotos();
					System.out.println("PARTIDO:" + candidatos.getPartido());
					System.out.println("\tCandidato: " + candidatos.getNombre() + " | Votos: " + candidatos.getNumeroVotos());
					System.out.println("--------------------------------");
					candidato_enc = true;
				}
				linea = br.readLine();
			}
			br.close();

			if (candidato_enc) {
				System.out.println("\tTOTAL PARTIDO: " + totalVotos);
			} else {
				System.out.println("No hay candidatos para este partido.");
			}
		} else {
			System.out.println("El fichero de candidatos no existe.");
		}
	}
	
	public static void actualizarVotosCandidato() throws IOException {
		File FICHERO_CANDIDATOS = new File("candidatos.txt");

		if (FICHERO_CANDIDATOS.exists()) {
			int idBuscar = Lecturas.leerEntero("Introduce el ID del candidato: ");
			boolean enc = false;
			File temp = new File("temp_candidatos.txt");
			BufferedReader br = new BufferedReader(new FileReader(FICHERO_CANDIDATOS));
			String linea = br.readLine();
			while (linea != null) {
				Candidato candidatos = new Candidato();
				candidatos.leerCandidato(linea);
				if (candidatos.getId() == idBuscar) {
					enc = true;
					int nuevosVotos;
					do {
						System.out.println( candidatos.getNombre() +" tiene actualmente " + candidatos.getNumeroVotos());
						nuevosVotos = Lecturas.leerEntero("Introduce el nuevo número de votos:");
						if (nuevosVotos < candidatos.getNumeroVotos()) 
							System.out.println("Error: No pueden ser menores.");
					} while (nuevosVotos < candidatos.getNumeroVotos());
					candidatos.setNumeroVotos(nuevosVotos);
				}
				candidatos.escribirCandidato(temp, true);
				linea = br.readLine();}
			br.close();
			if (enc) {
				if (FICHERO_CANDIDATOS.delete()) {
					temp.renameTo(FICHERO_CANDIDATOS);
					System.out.println("Votos actualizados correctamente.");
				}
			} else {
				System.out.println("No se encontró ningún candidato con ese ID.");
				temp.delete();
			}
		} else System.out.println("Fichero no encontrado.");
	}
	
	public static void exportarActaFinal() throws IOException {
		File FICHERO_CANDIDATOS = new File("candidatos.txt");
		
		if (!FICHERO_CANDIDATOS.exists()) {
			System.out.println("No existe el fichero de candidatos.");
			return;
		}
		
		File acta = new File("acta_final.txt");
		BufferedReader br = new BufferedReader(new FileReader(FICHERO_CANDIDATOS));
		PrintWriter pw = new PrintWriter(new FileWriter(acta));
		int totalGlobal = 0;
		double maxVotos = -1;
		String ganador = "";
		String linea = br.readLine();
		while (linea != null) {
			Candidato candidatos = new Candidato();
			candidatos.leerCandidato(linea);
			totalGlobal += candidatos.getNumeroVotos();
			if (candidatos.getNumeroVotos() > maxVotos) {
				maxVotos = candidatos.getNumeroVotos();
				ganador = candidatos.getNombre();
			}
			pw.println(candidatos.getNombre()+"-"+candidatos.getPartido()  +"-"+  candidatos.getNumeroVotos() + "Votos");
			linea = br.readLine();
	}
		 pw.println("\nTotal votos: " + totalGlobal);
		    pw.println("Ganador: " + ganador );
			
		pw.close();
		br.close();
	}
}