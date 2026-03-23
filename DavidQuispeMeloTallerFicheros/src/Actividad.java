import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;

public class Actividad {
private int id;
private String nombreActividad;
private String seccion;
private int numeroPlazas;
private double precio;

public void pedirDatos() {
	BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
	int idGenerado=-1;

	boolean todoOk = false;
	while (!todoOk) {
		try {
			
			do {
			System.out.print("Introduce el id de la actividad: ");
			idGenerado = Integer.parseInt(leer.readLine());
			}while(estaRepetido(idGenerado));
			id=idGenerado;
			
			System.out.print("Introduce el nombre de la actividad: ");
			nombreActividad = leer.readLine();
			do {
				System.out.println("Introduce la sección (Chiqui, Preas, Centro): ");
				seccion = leer.readLine();
			   if (!(seccion.equalsIgnoreCase("chiqui") || seccion.equalsIgnoreCase("Preas")  || seccion.equalsIgnoreCase("Centro"))) {
				   System.err.println("ERROR: No has introducido una sección correcta");
			   }
			}while (!(seccion.equalsIgnoreCase("chiqui") || seccion.equalsIgnoreCase("Preas")  || seccion.equalsIgnoreCase("Centro")));
			   
			System.out.println("Introduce el número de plazas disponibles: ");
			   numeroPlazas = Integer.parseInt(leer.readLine());
			   System.out.println("Introduce el precio de la actividad: ");
			   precio = Integer.parseInt(leer.readLine());
			todoOk = true;
		}catch (Exception e) {
			System.err.println("Ha habido un error al registrar los datos. Intentelo de nuevo.");
		}
		
		}
}

public void escribirActividad() throws IOException {
	File archivoactividades = new File("actividad.txt");
	FileWriter fw = new FileWriter(archivoactividades, true);
	PrintWriter pw = new PrintWriter(fw);
	pw.println("---DATOS ACTIVIDAD---");
	pw.println("Id: " + this.id);
	pw.println("Nombre: " + this.nombreActividad);
	pw.println("Sección: " + this.seccion);
	pw.println("Número de plazas: " + this.numeroPlazas);
	pw.println("Precio: " + this.precio);
	pw.flush();
	pw.close();
}

public boolean  estaRepetido( int idGenerado) {
	ArrayList<Actividad> datosactividad = new ArrayList<Actividad>();
	boolean enc = false;
	File f = new File("./actividad.txt");
	if (f.exists()) {
		try {	
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String linea = br.readLine();
			while (linea != null) {
				String[] datos = linea.split(";");
				int idactividad = Integer.parseInt(datos[1]);

				for (int i = 0; i < datosactividad.size() && enc == false; i++) {
					if (datosactividad.get(i).getId()==idactividad ) {
						System.err.println("Repetido");
						enc=true;
					}
					
				}


			}
			br.close();
			fr.close();
	} catch (IOException e) {
		System.err.println("Error al leer el archivo");
	}
	return enc;
	}
	return false;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNombre() {
	return nombreActividad;
}
public void setNombre(String nombre) {
	this.nombreActividad = nombre;
}
public String getSeccion() {
	return seccion;
}
public void setSeccion(String seccion) {
	this.seccion = seccion;
}
public int getNumeroPlazas() {
	return numeroPlazas;
}
public void setNumeroPlazas(int numeroPlazas) {
	this.numeroPlazas = numeroPlazas;
}
public double getPrecio() {
	return precio;
}
public void setPrecio(double precio) {
	this.precio = precio;
}


}
