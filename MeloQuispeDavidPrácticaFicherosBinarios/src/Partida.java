import java.io.*;



public class Partida {
	private int id;
	private int idImpostor;
	private String nombre;
	private double duracionPartida;
	private boolean ganador;
		
	public void pedirDatos(File f) throws IOException {
	do {
		this.id = Lecturas.leerEntero("Id del impostor: ");
	}while (idRepetido(this.id,f));
	this.nombre = Lecturas.leerOpcion("Introduce el partido ( The Skeld / Polus / Airship):", 
			new String[] {"The Skeld", "Polus", "Airship"});
		this.duracionPartida = Lecturas.leerDouble("Introduce los puntos iniciales: ");
		   
}

public void escribirJugador(File f, boolean añadir) throws IOException {
	FileWriter fw = new FileWriter(f, añadir);
	PrintWriter pw = new PrintWriter(fw);
	pw.println(this.id + ";" + this.nombre + ";" + this.puntosTotales + ";" + this.partidasJugadas);
	pw.flush();
	pw.close();
	fw.close();
}

protected static boolean idRepetido(int id, File f) throws IOException {
    if (!f.exists())
      return false;
    
    boolean enc = false;
    try (BufferedReader br = new BufferedReader(new FileReader(f))) {
        String linea;
        while ((linea = br.readLine()) != null && !enc) {
            String[] datos = linea.split(";"); 
            if (Integer.parseInt(datos[0].trim()) == id) {
                enc = true;
                System.out.println("ID Repetido");
            }
            linea = br.readLine();
        }
        br.close();
    }
    return enc;
}
public void leerJugador(String linea) throws IOException {
	String[] datos = linea.split(",");

        this.id = Integer.parseInt(datos[0].trim());
        this.nombre = datos[1].trim();
        this.puntosTotales = Double.parseDouble(datos[2].trim());
        this.partidasJugadas = Integer.parseInt(datos[3].trim());
    
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public double getDuracionPartida() {
	return duracionPartida;
}

public boolean isGanador() {
	return ganador;
}

}
