import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Principal {

	public static void verCandidatosPorPartido() throws IOException {
		File FICHERO_CANDIDATOS = new File("candidatos.txt"); 

		if (FICHERO_CANDIDATOS.exists()) {
			String partidoBuscado = Lecturas.leerOpcion("Introduce el partido (PP, PSOE, VOX, SUMAR):",
					new String[] { "PP", "PSOE", "VOX", "SUMAR" });

			BufferedReader br = new BufferedReader(new FileReader(FICHERO_CANDIDATOS));
			int votosPartido = 0;
			boolean enc = false;

			String linea = br.readLine();
			while (linea != null) {
				Candidato candidatos = new Candidato();
				candidatos.leerCandidato(linea);

				if (candidatos.getPartido().equalsIgnoreCase(partidoBuscado)) {
					System.out.println("\tCANDIDATO: " + candidatos.getNombre() + " | Votos: " + candidatos.getVotos());
					votosPartido += candidatos.getVotos();
					enc = true;
				}
				linea = br.readLine();
			}
			br.close();

			if (enc) {
				System.out.println("\tTOTAL PARTIDO: " + votosPartido);
			} else {
				System.out.println("No hay candidatos para este partido.");
			}
		} else {
			System.out.println("El fichero de candidatos no existe.");
		}
	}

	public static void actualizarVotos() throws IOException {
		File FICHERO_CANDIDATOS = new File("candidatos.txt");

		if (FICHERO_CANDIDATOS.exists()) {
			int idBuscar;
			boolean enc = false;

			
			do {
				idBuscar = Lecturas.leerEntero("Introduce el ID del candidato: ");
				enc = Candidato.idRepetido(idBuscar);
				if (!enc) System.out.println("Error: ID no existe.");
			} while (!enc);

			File temp = new File("temp_candidatos.txt");
			BufferedReader br = new BufferedReader(new FileReader(FICHERO_CANDIDATOS));
			
			String linea = br.readLine();
			while (linea != null) {
				Candidato can = new Candidato();
				can.leerCandidato(linea);

				if (can.getId() == idBuscar) {
					int nuevosVotos;
					do {
						nuevosVotos = Lecturas.leerEntero("Nuevos votos (actuales: " + can.getVotos() + "): ");
						if (nuevosVotos < can.getVotos()) System.out.println("Error: No pueden ser menores.");
					} while (nuevosVotos < can.getVotos());
					can.setVotos(nuevosVotos);
				}
				can.escribirFichero(temp, true);
				linea = br.readLine();
			}
			br.close();

			if (FICHERO_CANDIDATOS.delete()) {
				temp.renameTo(FICHERO_CANDIDATOS);
			}

		} else System.out.println("Fichero no encontrado.");
	}

	public static void generarActaFinal() throws IOException {
		File FICHERO_CANDIDATOS = new File("candidatos.txt");
		
		if (!FICHERO_CANDIDATOS.exists()) {
			System.out.println("No existe el fichero de candidatos.");
			return;
		}

		File acta = new File("acta_final.txt");
		BufferedReader br = new BufferedReader(new FileReader(FICHERO_CANDIDATOS));
		PrintWriter pw = new PrintWriter(new FileWriter(acta));
		
		int totalGlobal = 0;
		int maxVotos = -1;
		String ganador = "";

		String linea = br.readLine();
		while (linea != null) {
			Candidato can = new Candidato();
			can.leerCandidato(linea);
			totalGlobal += can.getVotos();
			
			if (can.getVotos() > maxVotos) {
				maxVotos = can.getVotos();
				ganador = can.getNombre();
			}
			// Escribir lista en el acta
			pw.println(can.getNombre() + " - Votos: " + can.getVotos());
			linea = br.readLine();
		}
		
		pw.println("\nTotal votos globales: " + totalGlobal);
		pw.println("Ganador: " + ganador + " con " + maxVotos + " votos.");
		
		pw.close();
		br.close();
		System.out.println("Acta generada correctamente en " + acta.getName());
	}

	public static int menu() throws IOException {
		int opcion = 0;
		do {
			System.out.println("\n--- EXAMEN ELECTORAL ---");
			System.out.println("1. Añadir Candidato");
			System.out.println("2. Ver por Partido");
			System.out.println("3. Actualizar Votos");
			System.out.println("4. Acta Final");
			System.out.println("5. Salir");
			opcion = Lecturas.leerEntero("Selecciona: ");
		} while (opcion < 1 || opcion > 5);
		return opcion;
	}

	public static void main(String[] args) throws IOException {
		int opcion;
		File FICHERO_CANDIDATOS = new File("candidatos.txt"); 
		do {
			opcion = menu();
			switch (opcion) {
				case 1: 
					Candidato c = new Candidato();
					c.pedirCandidato();
					c.escribirFichero(FICHERO_CANDIDATOS, true);
					break;
				case 2: verCandidatosPorPartido(); break;
				case 3: actualizarVotos(); break;
				case 4: generarActaFinal(); break;
			}
		} while (opcion != 5);
	}
}