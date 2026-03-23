package EjercicioGroenlandia;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;


public class Groenlandia {
	private int id;
	private String nombre;
	private String resort;
	private double oferta;
	private String respuesta;
	
	public void PedirDatos(ArrayList<Groenlandia> Groenlandia) {
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
		Random rand = new Random();

		boolean datosOK = false;
		while (!datosOK) {
	
	try {
		System.out.print("Introduce el nombre del postor: ");
		nombre =leer.readLine();
		System.out.print("Introduce la cantidad de la oferta (en millones de dólares): ");
		oferta=Double.parseDouble(leer.readLine());
		do {
		System.out.print("¿Incluye resort de lujo? (true/false):");
		resort=leer.readLine();
		if (resort.equalsIgnoreCase("true") || resort.equalsIgnoreCase("false")) {
			
		}else {
			System.err.println("Introduce una respuesta correcta");
		}
		
		}while(!resort.equalsIgnoreCase("true") || resort.equalsIgnoreCase("false"));
		
		
		
		System.out.print("Introduce la respuesta de Dinamarca:");
		respuesta=leer.readLine();
		
		int idGenerado = -1;
		do {
		
			idGenerado = rand.nextInt(1000) + 1;
			System.err.println("--- Oferta registrada con ID: " + idGenerado);
			
		} while (estaRepetido(Groenlandia, idGenerado));
		id = idGenerado;
		
		datosOK=true;
	}catch (IOException e) {
		System.err.println("Has introducido algun dato mal");
		
		e.printStackTrace();
	}
		}	
		
	}
	
	public void MostrarOfertas() {
		System.out.println("--- OFERTA #" + id+ " –– ");
		System.out.println("\tPostor: " + nombre);
		System.out.println("\tCantidad: " + oferta + " €");
		System.out.println("\tResort: " + resort);
		System.out.println("\tRespuesta: " + respuesta);
		
		
	}
	
	private boolean estaRepetido(ArrayList<Groenlandia> Groenlandia, int idGenerado) {
		for (int i = 0; i < (Groenlandia.size() - 1); i++) {
			if (Groenlandia.get(i).getId() == idGenerado) {
				System.err.println("El numero esta repetido");
				return true;
			}

		}
		return false;

	}
	
	private static Groenlandia buscarPorId(ArrayList<Groenlandia> Groenlandia) {
		 BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
		int id = -1;
		boolean todoOk = false;

		do {
			try {
				System.out.print("Introduce el id del articulo: ");
				id = Integer.parseInt(leer.readLine());
				todoOk = true;
			} catch (NumberFormatException | IOException e) {
				e.printStackTrace();
			}
		} while (todoOk != true);

		for (int i = 0; i < Groenlandia.size(); i++) {
			if (Groenlandia.get(i).getId() == id) {
				return Groenlandia.get(i);
			}
		}

		return null;
	}
	
	
	public int getId() {
		return id;
	}
}

