import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExamenTema1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
           boolean salir = false;
		
	
		
		do {
			System.out.println("GESTIÓN DE LA NAVIDAD");
			System.out.println("Opción 1: Registro de Carta a los Reyes Magos");
			System.out.println("Opción 2: Decoración de las calles ");
			System.out.println("Opción 3: Generador de Villancicos");
            System.out.println("Opción 4: Salir.");
			
			int opcion = leerInt("Introduce una opcion: ");
			
			switch(opcion) {
			case 1:
				Opcion1();
				break;
			case 2:
				Opcion2();
				break;
			case 3:
				Opcion3();
				break;
			
            case 4:
                System.out.println("¡Hasta pronto!");
                salir = true;
                break;
			default:
				System.out.println("Opcion no valida");
			}
			
		}while(!salir);

	}
	 public static void  Opcion1() throws NumberFormatException, IOException {
		 System.out.println("===CARTA A LOS REYES MAGOS ===");
		 boolean valido = false;
		 while(!valido) {
			 try {
		 String nombre=leerString("Introduce tu nombre:");
		 int edad= leerInt ("Introduce tu edad:");
		 float presupuesto=leerFloat("Presupuesto (€):");
		 float descuentomalcoportamiento= (float) (presupuesto*0.3);
		 String comportamiento =leerString("¿Has sido bueno? (S/N):");
		 
		 String  dosletrasnombre = nombre.substring(0,2).toUpperCase();
		 int ultimaletranombre=nombre.length();	 
		 System.out.println("===CARTA REGISTRADA ===");
		 System.out.println("Código:"+ dosletrasnombre+edad);
		 
		 if (edad>=0 && edad<=7){
			 System.out.println("Categoría: Infantil");
		 }else if (edad>=8 && edad<=12) {
			 System.out.println("Categoría: Niños");
		 }else if(edad>=13 && edad<=17) {
			 System.out.println("Categoría: Adolescente");
		 }else if(edad>=18) {
			 System.out.println("Categoría:Adulto");
		 }
		 
		
		 if (comportamiento.equalsIgnoreCase("S")){
			 System.out.println("Presupuesto final:"+presupuesto);
		 }else if (comportamiento.equalsIgnoreCase("N")) {
			 System.out.println("Presupuesto final:"+ (presupuesto-descuentomalcoportamiento));
		 }
		 
		 
		 if (presupuesto<30 ){
			 System.out.println("Tipo de lista: Modesta");
		 }else if (presupuesto>=30 && presupuesto<=70) {
			 System.out.println("Tipo de lista: Normal");
		 }else if(presupuesto>70 ) {
			 System.out.println("Tipo de lista: Premium");
		 }
		 valido=true;
			 
			 }
		  catch (NumberFormatException e) {
				System.out.println("Error: Debes introducir un número válido.");
			} catch (IOException e) {
				System.out.println("Error de lectura.");
			}catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		
		 }
	}
	 public static void  Opcion2() throws NumberFormatException, IOException {
		 System.out.println("===GESTIÓN DE LUCES DE NAVIDAD===");
		 boolean valido = false;
			while(!valido) {
			try {
				
				int callescompletas=0;
				int adornoscolocados=0;
				int numerocalles=leerInt("Introduzca el número de calles:");
				int numeroadornos=leerInt("Introduzca el número de adornos por calle:");
				int bolas=0;
				int estrellas=0;
				int campanas=0;
				
				for (int i = 1; i <= numerocalles; i++) {
					System.out.println("=== Calle " +i+ " ===");
					for (int j = 1; j <= numeroadornos; j++) {
						try {
							System.out.println("Colocando adorno " + j + " de la calle "+ i);
							String tipoadornos=leerString("Ingrese tipo (Bola, Estrella, Campana):");
						
							 if (tipoadornos.equalsIgnoreCase("Bola")){
								adornoscolocados++;
								bolas++;
							 }else if (tipoadornos.equalsIgnoreCase("Estrella")) {
								 adornoscolocados++;
									estrellas++;
							 }else if (tipoadornos.equalsIgnoreCase("Campana")) {
								 adornoscolocados++;
									campanas++;
							 }else if (tipoadornos.equalsIgnoreCase("FIN")){
								 i = numerocalles;
								 j = numeroadornos;
							 }
							
							
						}catch (NumberFormatException e) {
							System.out.println("Entrada inválida. Introduce un número.");
						}catch (IOException e) {
							System.out.println("Error de lectura.");
						}catch (IllegalArgumentException e) {
							System.out.println(e.getMessage());
						}
						
						
					}
					callescompletas++;
				}
				int adornostotales=numerocalles*numeroadornos;
				System.out.println("--RESUMEN DE LA INSTALACIÓN ---");
				System.out.println("Estado: se completó totalmente");
				System.out.println("Faltan por completar: "+ (numerocalles-callescompletas) +"calle(s) ");
				System.out.println("Faltaron: " + (adornostotales-adornoscolocados) + " adorno(s)");
				System.out.println("Total de adornos colocados: " + adornoscolocados);
				System.out.println("- Bolas: " + bolas);
				System.out.println("- Estrellas: " + estrellas);
				System.out.println("- Campanas: " + campanas);
				valido = true;
						} catch (NumberFormatException e) {
							System.out.println("Entrada inválida. Introduce un número.");
						}
					}
			
	 
			}
	 public static void Opcion3 () throws NumberFormatException, IOException {
	
			System.out.println("\n=== GENERADOR DE VILLANCICOS ===");
			boolean valido=false;
			
			char quiereMas = 'S';
			do {
				
				int numadjetivo = (int) (Math.floor(Math.random() * 4) + 1);
				int numSustantivo = (int) (Math.floor(Math.random() * 4) + 1);
			
				String adjetivo;
				switch (numadjetivo) {
				case 1:
					adjetivo = "Alegre";
					break;
				case 2:
					adjetivo = "Blanca";
					break;
				case 3:
					adjetivo = "Dulce";
					break;
				case 4:
					adjetivo = "Mágica";
					break;
				default:
					adjetivo = "Desconocido";
					break;
				}

				String sustantivo ;
				switch (numSustantivo) {
				case 1:
					sustantivo = "Navidad";
					break;
				case 2:
					sustantivo = "Noche";
					break;
				case 3:
					sustantivo = "Campana";
					break;
				case 4:
					sustantivo = "Estrella";
					break;
				default:
					sustantivo = "Desconocido";
					break;
				}

			
				String titulo = adjetivo + " " + sustantivo;

			
				int puntuacion = (int) (Math.floor(Math.random() * 10) + 1);

				
				System.out.println("\nRecomendación: " + titulo);
				System.out.println("Puntuación: " + puntuacion + "/10");

				
				quiereMas = leerChar("¿Otro villancico? (S/N):");
				
				

			} while (!valido);

			
	}
	 
	 public static int  leerInt(String mensaje) throws NumberFormatException, IOException {
			BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
			System.out.println(mensaje);
			int num = Integer.parseInt(leer.readLine());
			return num;
	}
	 
	
	  public static String leerString(String mensaje) throws IOException {
			BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
			System.out.print(mensaje);
			return leer.readLine();
		}
	  public static char leerChar(String mensaje) throws IOException {
			BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
			System.out.print(mensaje);
			return leer.readLine().toUpperCase().charAt(0);
		}
	  public static Float leerFloat(String mensaje) throws IOException {
			BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
			System.out.print(mensaje);
			float num = Float.parseFloat(leer.readLine());
			return num;
		}
	}


