package ExamenHerencia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Heroe extends Personaje{
private String organizacion;
private boolean identidad;
private ArrayList<String> ultimasMisiones = new ArrayList<>();







public void pedirDatos(ArrayList<Personaje> personajes){
	BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

	if(ultimasMisiones.size() < 3) {
		super.pedirDatos(personajes);
		System.out.print("--- DATOS DE HÉROE ---");
		String identidadsecreta = "";
		String  aliaspersonaje = "";
		String misiones= "";
		boolean datosOK = false;
		while (!datosOK) {

			try {
				System.out.print("Organización: ");
				organizacion = leer.readLine();
			
				System.out.print("¿Tiene identidad secreta? (s/n): s ");
				identidadsecreta = leer.readLine();
				if (identidadsecreta.equalsIgnoreCase("S")) {
					identidad=true;
				}else if (identidadsecreta.equalsIgnoreCase("N")) {
					identidad=false;
							continue;
				}else {
					System.err.print("Has introducido mal algún dato, crack");
				}
				System.out.print("Ultimas 3 misiones:");
				ultimasMisiones.add(leer.readLine());
			
			
			
		}catch (IOException e) {
			System.out.println("Has introducido mal algún dato, crack");
			e.printStackTrace();
		

	}

		}
	}else {
		System.out.println("No se puede añadir mision pq ya hay 3 :(");
	}
	
}
protected void mostrarDatos() {
	super.mostrarDatos();
	System.out.println("Alias: " + this.organizacion);
	System.out.println("Nivel de poder " + this.ultimasMisiones);
	
	
	
}
public String getOrganizacion() {
	return organizacion;
}
public boolean isIdentidad() {
	return identidad;
}
public ArrayList<String> getUltimasMisiones() {
	return ultimasMisiones;
}

}


