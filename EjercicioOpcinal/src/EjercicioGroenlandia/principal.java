package EjercicioGroenlandia;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class principal {
	static BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

	  public static void main(String[] args) throws IOException {
		  
		  BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
		  ArrayList<Groenlandia> Groenlandia = new ArrayList<Groenlandia>();

		  boolean salir = false;
			do {
				System.out.println("== GESTIÓN DE OFERTAS POR GROENLANDIA  ==");
				System.out.println("1. ¿Quién da más? (Añadir oferta)");
				System.out.println("2  Nej tak (Mostrar todas las ofertas)");
				System.out.println("3. Congelando los precios (Filtros especiales) ");
				System.out.println("4. El interrogatorio del pingüino (Buscar por oferente)");
				System.out.println("5. Aranceles para todos (Salir)");
				System.out.println("Introduce una opcion: ");

				int opcion = -1;
				boolean datosOK = false;
				while (!datosOK) {
				
						try {
							opcion = Integer.parseInt(leer.readLine());
						} catch (NumberFormatException | IOException e) {
							System.err.println("Solo puedes introducir numeros");
						}
				
					datosOK = true;
				}

				switch (opcion) {
				case 1:
					System.out.println("===  AÑADIR NUEVA OFERTA  ===");
					AñadirOferta(Groenlandia);
					break;
				case 2:
					System.out.println("===  TODAS LAS OFERTAS ===");
					MostrarOfertas(Groenlandia);
					break;
				case 3:
					System.out.println("===  FILTROS OFERTAS RIDICULAS Y RESORT ===");
					break;
				case 4:
					System.out.println("===  BUSCAR POR NOMBRE  == ");
					//AQUI VA LA OPCION 4
					//CREA UN METODO
					break;
				case 5:
					//AQUI VA LA OPCION 5
					salir = true;
					break;
				default:
					System.out.println("Opcion no valida");
				}

			} while (!salir);
		}
	  
	  private static void AñadirOferta( ArrayList<Groenlandia> Groenlandia) throws IOException {
				System.out.println("-- Añadiendo oferta " + (Groenlandia.size() + 1)+ "-- ");
				Groenlandia.add(new Groenlandia());
				Groenlandia.getLast().PedirDatos(Groenlandia);
			
			}
	  private static void MostrarOfertas( ArrayList<Groenlandia> Groenlandia) throws IOException {
			for (Groenlandia a: Groenlandia) {
				a.MostrarOfertas();
			}
		
		}
	  
	  
}
