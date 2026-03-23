
import java.io.*;

public class principal2 {

	public static void verCandidatosPorPartido() throws IOException {
		File FICHERO_CANDIDATOS = new File("candidatos.txt");

		if (FICHERO_CANDIDATOS.exists()) {
			String partidoBuscado = Lecturas.leerOpcion("Introduce el partido (PP, PSOE, VOX, SUMAR):",
					new String[] { "PP", "PSOE", "VOX", "SUMAR" });

			BufferedReader br = new BufferedReader(new FileReader(FICHERO_CANDIDATOS));
			int totalVotosPartido = 0;
			boolean hayCandidatos = false;

			String linea = br.readLine();
			while (linea != null) {
				Candidato can = new Candidato();
				can.leerCandidato(linea);

				if (can.getPartido().equalsIgnoreCase(partidoBuscado)) {
					System.out.println("\tCANDIDATO: " + can.getNombre() + " | Votos: " + can.getVotos());
					totalVotosPartido += can.getVotos();
					hayCandidatos = true;
				}
				linea = br.readLine();
			}
			br.close();

			if (hayCandidatos) {
				System.out.println("\tTOTAL PARTIDO: " + totalVotosPartido);
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
			int idBuscar = Lecturas.leerEntero("Introduce el ID del candidato a actualizar: ");
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
						nuevosVotos = Lecturas.leerEntero("Nuevos votos para " + candidatos.getNombre() + " (actuales: " + candidatos.getVotos() + "): ");
						if (nuevosVotos < candidatos.getVotos()) System.out.println("Error: No pueden ser menores.");
					} while (nuevosVotos < candidatos.getVotos());
					candidatos.setVotos(nuevosVotos);
				}
				candidatos.escribirFichero(temp, true);
				linea = br.readLine();
			}
			br.close();

			if (enc) {
				if (FICHERO_CANDIDATOS.delete()) {
					temp.renameTo(FICHERO_CANDIDATOS);
					System.out.println("Votos actualizados.");
				}
			} else {
				System.out.println("No se encontró ningún candidato con ese ID.");
				temp.delete();
			}

		} else System.out.println("Fichero no encontrado.");
	}

	public static void generarActaPorCandidato() throws IOException {
		File FICHERO_CANDIDATOS = new File("candidatos.txt");
		
		if (!FICHERO_CANDIDATOS.exists()) {
			System.out.println("No hay candidatos registrados.");
			return;
		}

		int idBuscar = Lecturas.leerEntero("Introduce el ID del candidato para generar su acta: ");
		
		BufferedReader br = new BufferedReader(new FileReader(FICHERO_CANDIDATOS));
		boolean encontrado = false;
		String linea = br.readLine();
		
		while (linea != null && !encontrado) {
			Candidato candidatos = new Candidato();
			candidatos.leerCandidato(linea);
			
			if (candidatos.getId() == idBuscar) {
				encontrado = true;
				
				File Acta = new File("acta_" + candidatos.getNombre() + ".txt");
				PrintWriter pw = new PrintWriter(new FileWriter(Acta));
				
				pw.println("--- ACTA INDIVIDUAL DE CANDIDATO ---");
				pw.println("ID: " + candidatos.getId());
				pw.println("NOMBRE: " + candidatos.getNombre());
				pw.println("PARTIDO: " + candidatos.getPartido());
				pw.println("VOTOS TOTALES: " + candidatos.getVotos());
				pw.println("------------------------------------");
				
				pw.close();
				System.out.println("Acta generada con éxito: " + Acta.getName());
			}
			linea = br.readLine();
		}
		br.close();
		
		if (!encontrado) {
			System.out.println("No se encontró ningún candidato con el ID " + idBuscar);
		}
	}

	public static int menu() throws IOException {
		int opcion = 0;
		do {
			System.out.println("\n--- SISTEMA DE VOTOS ---");
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
				case 4: generarActaPorCandidato(); break;
			}
		} while (opcion != 5);
	}
}