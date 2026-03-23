
import java.io.*;

public class Candidato2 {
	private int id; 
	private String nombre;
	private String partido;
	private int votos;

	public void pedirCandidato() throws IOException {
		System.out.println("Introduce los datos del nuevo candidato:");
		
		
		this.id = Lecturas.leerEntero("ID (número): ");
		
		this.nombre = Lecturas.leerString("Nombre: ");
		this.partido = Lecturas.leerOpcion("Partido (PP, PSOE, VOX, SUMAR): ", 
				new String[] {"PP", "PSOE", "VOX", "SUMAR"});
		
		do {
			this.votos = Lecturas.leerEntero("Votos iniciales: ");
			if (this.votos < 0) System.out.println("ERROR: No pueden ser negativos.");
		} while (this.votos < 0);
	}

	public void escribirFichero(File f, boolean añadir) throws IOException {
		FileWriter fw = new FileWriter(f, añadir);
		PrintWriter pw = new PrintWriter(fw);
		pw.println(this.id + "-" + this.nombre + "-" + this.partido + "-" + this.votos);
		pw.flush();
		pw.close();
		fw.close();
	}

	public void leerCandidato(String linea) {
		String[] datos = linea.split("-"); 
		this.id = Integer.parseInt(datos[0].trim());
		this.nombre = datos[1].trim();
		this.partido = datos[2].trim();
		this.votos = Integer.parseInt(datos[3].trim());
	}

	// Getters y Setters
	public int getId() { return id; }
	public String getNombre() { return nombre; }
	public String getPartido() { return partido; }
	public int getVotos() { return votos; }
	public void setVotos(int votos) { this.votos = votos; }
}