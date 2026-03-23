import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Pokemon {
 
	private int id;
	private String nombre;
	private String tipo;
	private int nivel;
	private double ps;
	private String[] ataques= new  String[4] ;

	
	
	public void PedirDatos (ArrayList<Pokemon> Pokedex) {
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
		boolean datosOK = false;
		while (!datosOK) {
	
		
	try {
		do {
		System.out.println("Introduce el número de Pokédex (1-1025):");
		id= Integer.parseInt(leer.readLine());
		if ( id<1 || id >1025) {
			System.err.println("Introduce el número de pokedex correctamente");
		}
		}while(id<1 || id >1025 || estaRepetido(Pokedex, id));
		System.out.println("Introduce el nombre: ");
		nombre= leer.readLine();
		do {
		System.out.println("Introduce el tipo: ");
		tipo= leer.readLine();
		if (tipo.equalsIgnoreCase("Agua")||tipo.equalsIgnoreCase("Fuego")|| tipo.equalsIgnoreCase("eléctrico")||tipo.equalsIgnoreCase("Planta")) {
		 continue;
		}else {
			System.err.println("Introduce el tipo de pokemon  correctamente");
		}
			
		}while (!(tipo.equalsIgnoreCase("Agua")||tipo.equalsIgnoreCase("Fuego")|| tipo.equalsIgnoreCase("eléctrico")||tipo.equalsIgnoreCase("Planta")));
		
		do {
		System.out.println("Introduce el nivel");
		nivel= Integer.parseInt(leer.readLine());
		if ( nivel<1 || nivel >100) {
			System.err.println("Introduce el nivel correctamente");
		}
		}while(nivel<1 || nivel >100);
		System.out.println("Introduce los PS:");
		ps= Double.parseDouble(leer.readLine());
		datosOK=true;
	}catch (IOException e) {
		System.err.println("Has introducido algun dato mal");
		
		e.printStackTrace();
	}
		}
	}
	
	
	public void MostrarDatos () throws IOException {
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
		
	System.out.println("--- POKÉMON DE TIPO "+ tipo+ " ---");
			System.out.println("\tId: " + id + " | " + nombre);
			System.out.println("\tNivel: " + nivel + " | Ps: " + ps);
			if (nivel>=50) {
				System.out.println("\tEstado: !Pokémon fuerte ¡");
			}else if (nivel<50) {
				System.out.println("\tEstado: !Pokémon debil ¡");
			}
			
			if ()	{
				System.out.println("\tAtaques: Sin ataques. Le hace falta entrenamiento ");
			}else {
				System.out.println("\tAtaques: " +ataques);
			}
			
		}
	
	public void aprender (int id ) throws IOException {
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Pokémon encontrado:" + nombre + "(" +nivel+")");
		System.out.println("Ataques actuales:" + ataques );
		
		System.out.println("Introduce el nombre del nuevo ataque:");
		String  Ataquesnuevos= leer.readLine();
		 
		}
	
	
	private  boolean estaRepetido(  ArrayList<Pokemon> Pokedex,int id ) {
		for (int i = 0; i < (Pokedex.size() - 1); i++) {
			if (Pokedex.get(i).getId() == id) {
				System.err.println("El numero de pokedex esta repetido");
				return true;
			}

		}
		return false;

	}
	public int getId() {
		return id;
	}
	
	public String getNombre() {
		return nombre;
	}
	public String getTipo() {
		return tipo;
	}

}

