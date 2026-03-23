import java.io.*;

public class Jugador {
private int id;
private String nombre;
private double puntosTotales;
private int partidasJugadas;

public void pedirDatos(File f) throws IOException {
	do {
		this.id = Lecturas.leerEntero("Introduce el id: ");
	}while (idRepetido(this.id,f));
		this.nombre = Lecturas.leerString("Introduce el nombre: ");
		this.puntosTotales = Lecturas.leerDoubleMayorQue("Introduce los puntos iniciales: ",0);
		this.partidasJugadas = Lecturas.leerEnteroMayorQue("Introduce las partidas jugadas: ",0);
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


public double getPuntosTotales() {
	return puntosTotales;
}


public void setPuntosTotales(double puntosTotales) {
	this.puntosTotales = puntosTotales;
}


public int getPartidasJugadas() {
	return partidasJugadas;
}


public void setPartidasJugadas(int partidasJugadas) {
	this.partidasJugadas = partidasJugadas;
}


public int getId() {
	return id;
}


public String getNombre() {
	return nombre;
}


}