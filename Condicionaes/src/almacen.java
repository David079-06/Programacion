import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class almacen {

	public static void main(String[] args)throws NumberFormatException, 
	IOException  {
		// TODO Auto-generated method stub
		BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
		
		
		tentacion[posparticipante][postentadores-1] = gradotentacion;
		System.out.println("¡Tentación actualizada! " + participantes[posparticipante] + " y " + tentadores[postentadores]+ " ahora tienen un nivel de "+gradotentacion);
		
	
		
		System.out.println("Nombre: ");
		String color= leer.readLine();
		
	    float alt = Float.parseFloat(leer.readLine());
	    int edad  = Integer.parseInt(leer.readLine());
		
	    if  (nota<=3) {
			System.out.println("Muy Deficiente ");
	    } else if ( 3 <= nota && nota <= 5) {
	    System.out.println("Insuficiente ");
	    } else if (nota <= 6 && nota == 5){
		System.out.println(" Bien ");}
	    else if (nota <= 9 && nota == 6){
			System.out.println(" Notable ");}
	    else if (nota <= 10 && nota == 9){
			System.out.println(" Sobresaliente ");}

	    
		if  (num1>=num2 &&  num1 >= num3) { 
			  if (num2>num3) {
				  System.out.println("El orden es: " + num1+">" + num2 + ">" + num3);
		    } else 
		    	System.out.println("El orden es:" + num1+ ">" + num3 + ">" + num2);
		    } else if (num2>num1 && num2> num3 ){
		    	if (num1>num3) {
		    		System.out.println(num2+">" + num1 + ">" + num3);
		    } else 
		    	System.out.println(num2+">" + num3 + ">" + num1);
		    } else if ((num3>num1) && (num3> num2)){
		    	if (num1>num2) {  
		    		System.out.println(num3+">" + num1 + ">" + num2);
		    	} else 
		    	System.out.println(num3+">" + num2 + ">" + num1);
		    
		    	 switch (Number) { 
		    case 1:
				 System.out.println("Invierno ");
				 break;
				 case 2:
					 System.out.println("Invierno ");
					 break;
				 case 3:
					 System.out.println("Primavera ");
					 break;
		    	 }
	    String cadena3 = color.substring( 0,1);
		String cadena4 = cadena3.toLowerCase();
		String cadena5 = cadena.toUpperCase();
		
		private static double leerNota(String mensaje) throws IOException {
		    // ... (Inicialización) ...
		    while (!valida) {
		        try {
		            // ... (Lectura y conversión) ...
		            nota = Double.parseDouble(leer.readLine()); // Permite decimales
		            
		            if (nota >= 0 && nota <= 10) { // Validación del rango
		                valida = true;
		            } else {
		                System.out.println("Error: La nota debe estar entre 0 y 10.");
		            }
		        } catch (NumberFormatException e) {
		            System.out.println("Error: Debes introducir un número válido.");
		        }
		    }
		    return nota;
		}
		
           for (int i=0 ;i <= 20; i++ ){
			
			System.out.println(i);

			public static int leerEntero(String mensaje) throws IOException {
			    // ... (Inicialización) ...
			    while (!valido) {
			        try {
			            // ... (Lectura) ...
			            numero = Integer.parseInt(leer.readLine()); // Intenta convertir a entero
			            valido = true;
			        } catch (NumberFormatException e) {
			            System.out.println("Debes introducir un número entero."); // Manejo de error
			        }
			    }
			    return numero;
			}
			
			
			
		
	}

}

		import java.io.BufferedReader;
		import java.io.IOException;
		import java.io.InputStreamReader;

		public class Principal {

			public static void main(String[] args) throws NumberFormatException, IOException {
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

				boolean salir = false;

				System.out.println("=== CALASANZ+ ===");

				do {
					// MOSTRAR MENU
					System.out.println("\n--- MENÚ PRINCIPAL ---");
					System.out.println("1. Creador de perfil de usuario");
					System.out.println("2. Maratón de series");
					System.out.println("3. Calificar series y capítulos");
					System.out.println("4. Sistema de recomendaciones");
					System.out.println("5. Salir");

					System.out.print("Elige una opción: ");
					int opcion = Integer.parseInt(br.readLine());

					switch (opcion) {
					case 1:
						System.out.println("\n=== CREADOR DE PERFIL DE USUARIO ===");
						// Pedir datos
						System.out.print("Introduce tu nombre: ");
						String nombre = br.readLine();

						System.out.print("Introduce tu género favorito: ");
						String genero = br.readLine();

						System.out.print("Introduce tu edad: ");
						int edad = Integer.parseInt(br.readLine());

						System.out.print("Introduce el precio base mensual: ");
						double precioBase = Double.parseDouble(br.readLine());

						System.out.print("Introduce el número de perfiles: ");
						int numPerfiles = Integer.parseInt(br.readLine());

						System.out.print("¿Quieres calidad 4K? (S/N): ");
						char tiene4K = br.readLine().charAt(0);

						// Crear ID de usuario
						String tresLetrasNombre = nombre.substring(0, 3).toUpperCase();
						String dosLetrasGenero = genero.substring(0, 2).toLowerCase();
						String idUsuario = tresLetrasNombre + dosLetrasGenero + edad;

						// Calcular precio
						double precioFinal = precioBase;
						precioFinal += numPerfiles * 3;

						if (tiene4K == 'S') {
							precioFinal += 5;
						}

						if (numPerfiles > 5) {
							precioFinal = precioFinal * 0.9;
						}

						// Determinar tipo de contenido
						String tipoContenido;
						if (edad >= 0 && edad <= 7) {
							tipoContenido = "Infantil";
						} else if (edad >= 8 && edad <= 12) {
							tipoContenido = "Familiar";
						} else if (edad >= 13 && edad <= 17) {
							tipoContenido = "Juvenil";
						} else {
							tipoContenido = "Todas las películas";
						}

						// Determinar tipo de plan
						String tipoPlan;
						if (precioFinal < 10) {
							tipoPlan = "Plan Básico";
						} else if (precioFinal >= 10 && precioFinal <= 15) {
							tipoPlan = "Plan Estándar";
						} else {
							tipoPlan = "Plan Premium";
						}

						// Mostrar resultados
						System.out.println("\n--- PERFIL CREADO ---");
						System.out.println("ID de usuario: " + idUsuario);
						System.out.println("Tipo de contenido: " + tipoContenido);
						System.out.println("Precio mensual: " + precioFinal + "€");
						System.out.println("Tipo de plan: " + tipoPlan);

						break;
					case 2:
						System.out.println("\n=== MARATÓN DE SERIES ===");

						System.out.print("Introduce el número total de capítulos de la serie: ");
						int totalCapitulos = Integer.parseInt(br.readLine());

						int capitulosVistos = 0;
						int minutosTotales = 0;
						int duracion;
						boolean seguir = true;

						for (int i = 1; i <= totalCapitulos && seguir; i++) {
							System.out.println("\nReproduciendo episodio " + i + " de un total de " + totalCapitulos);
							System.out.print("Introduce la duración en minutos del capítulo " + i + " (0 para parar): ");
							duracion = Integer.parseInt(br.readLine());

							if (duracion == 0) {
								seguir = false;
							}

							capitulosVistos++;
							minutosTotales += duracion;
						}

						System.out.println("\n--- RESUMEN ---");
						if (capitulosVistos == totalCapitulos) {
							System.out.println("Has visto toda la serie");
						} else {
							int capitulosRestantes = totalCapitulos - capitulosVistos;
							System.out.println("Te quedan " + capitulosRestantes + " capítulos");
						}

						System.out.println("Hoy has visto un total de " + capitulosVistos
								+ " capítulos, con una duración total de " + minutosTotales + " minutos");
						break;
					case 3:
						System.out.println("\n=== CALIFICAR SERIES Y CAPÍTULOS ===");

						System.out.print("Introduce el nombre de la serie: ");
						String nombreSerie = br.readLine();

						System.out.print("Introduce el número de temporadas: ");
						int numTemporadas = Integer.parseInt(br.readLine());

						System.out.print("Introduce el número de capítulos por temporada: ");
						int capitulosPorTemporada = Integer.parseInt(br.readLine());

						double sumaNotasTotal = 0;
						int totalCap = 0;

						// Bucle externo: temporadas
						for (int t = 1; t <= numTemporadas; t++) {
							System.out.println("\n--- TEMPORADA " + t + " ---");
							double sumaNotasTemporada = 0;

							// Bucle interno: capítulos de cada temporada
							for (int c = 1; c <= capitulosPorTemporada; c++) {
								double nota;

								// Bucle de validación
								do {
									System.out.print("Introduce la nota del capítulo " + c + " (0-10): ");
									nota = Double.parseDouble(br.readLine());

									if (nota < 0 || nota > 10) {
										System.out.println("La nota debe estar entre 0 y 10. Inténtalo de nuevo.");
									}
								} while (nota < 0 || nota > 10);

								sumaNotasTemporada += nota;
								sumaNotasTotal += nota;
								totalCap++;
							}

							double mediaTemporada = sumaNotasTemporada / capitulosPorTemporada;
							System.out.println("Nota media de la temporada " + t + ": " + mediaTemporada);
						}

						double mediaSerie = sumaNotasTotal / totalCap;
						System.out
								.println("\n--- NOTA MEDIA FINAL DE LA SERIE \"" + nombreSerie + "\": " + mediaSerie + " ---");
						break;
					case 4:
						System.out.println("\n=== SISTEMA DE RECOMENDACIONES ===");

						char quiereMas = 'S';

						do {
							// Generar números aleatorios
							int numAdjetivo = (int) (Math.floor(Math.random() * 5) + 1);
							int numSustantivo = (int) (Math.floor(Math.random() * 5) + 1);

							// Asignar adjetivo
							String adjetivo;
							switch (numAdjetivo) {
							case 1:
								adjetivo = "Increíble";
								break;
							case 2:
								adjetivo = "Épico";
								break;
							case 3:
								adjetivo = "Misterioso";
								break;
							case 4:
								adjetivo = "Oscuro";
								break;
							case 5:
								adjetivo = "Último";
								break;
							default:
								adjetivo = "Desconocido";
								break;
							}

							// Asignar sustantivo
							String sustantivo;
							switch (numSustantivo) {
							case 1:
								sustantivo = "Viaje";
								break;
							case 2:
								sustantivo = "Secreto";
								break;
							case 3:
								sustantivo = "Destino";
								break;
							case 4:
								sustantivo = "Horizonte";
								break;
							case 5:
								sustantivo = "Reino";
								break;
							default:
								sustantivo = "Desconocido";
								break;
							}

							// Crear título
							String titulo = adjetivo + " " + sustantivo;

							// Generar puntuación
							int puntuacion = (int) (Math.floor(Math.random() * 10) + 1);

							// Mostrar recomendación
							System.out.println("\nRecomendación: " + titulo);
							System.out.println("Puntuación: " + puntuacion + "/10");

							// Preguntar si quiere otra
							System.out.print("\n¿Quieres otra recomendación? (S/N): ");
							quiereMas = br.readLine().toUpperCase().charAt(0);

						} while (quiereMas != 'N');

						break;
					case 5:
						salir = true;
						System.out.println("Gracias por usar CALASANZ+. ¡Nos vemos en tu próxima maratón!” ");
						break;
					default:
						System.out.println("Opción no válida");
					}
				} while (!salir);
			}

		}