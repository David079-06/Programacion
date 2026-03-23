import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalasanzGames {
	public static void main(String[] args) throws IOException {
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
		boolean salir = false;
		System.out.println("=== BIENVENIDO A BIBLIOTECA Calasanz Games  ===");
		do {
			// MOSTRAR MENU
			System.out.println("\n--- MENÚ PRINCIPAL ---");
			System.out.println("1. Gestión de Usuarios");
			System.out.println("2. Catálogo de Juegos");
			System.out.println("3. Sistema de Valoraciones");
			System.out.println("4. Estadísticas y Reportes");
			System.out.println("5. Calculadora de descuentos");
			System.out.println("6. Salir");
			System.out.print("Elige una opción: ");

			int opcion = leerOpcion(leer, 1, 6);

			switch (opcion) {
			case 1:
				gestionUsuarios(leer);
				break;
			case 2:
				catalogoJuegos(leer);
				break;
			case 3:
				sistemaValoraciones(leer);
				break;
			case 4:
				estadisticasReportes(leer);
				break;
			case 5:
				calculadoraDescuentos(leer);
				break;
			case 6:
				salir = true;
				System.out.println("¡Hasta luego!");
				break;
			default:
				System.out.println("Opción no válida");
			}
		} while (!salir);
	}

	// OPCION 1
	public static void gestionUsuarios(BufferedReader leer) {
		int opcion;
		do {
			System.out.println("\n--- GESTIÓN DE USUARIOS ---");
			System.out.println("1. Crear nuevo usuario");
			System.out.println("2. Calcular edad del usuario");
			System.out.println("3. Volver al menú principal");

			opcion = leerOpcion(leer, 1, 3);

			switch (opcion) {
			case 1:
				crearUsuario(leer);
				break;
			case 2:
				calcularEdadUsuario(leer);
				break;
			}
		} while (opcion != 3);
	}

	// OPCION 1.1
	public static void crearUsuario(BufferedReader leer) {
		boolean todoOK = false;
		while(!todoOK) {
		try {
			System.out.print("Nombre: ");
			String nombre = leer.readLine();

			System.out.print("Año de nacimiento: ");
			int año = Integer.parseInt(leer.readLine());

			String plataforma = "";
			while (!plataforma.equalsIgnoreCase("PC") && !plataforma.equalsIgnoreCase("PlayStation")
					&& !plataforma.equalsIgnoreCase("Xbox") && !plataforma.equalsIgnoreCase("Nintendo")) {
				System.out.print("Plataforma favorita (PC, PlayStation, Xbox, Nintendo): ");
				plataforma = leer.readLine();
				if(!plataforma.equalsIgnoreCase("PC") && !plataforma.equalsIgnoreCase("PlayStation")
					&& !plataforma.equalsIgnoreCase("Xbox") && !plataforma.equalsIgnoreCase("Nintendo"))
					System.out.println("Plataforma incorrecta");
			}

			System.out.print("¿Tiene suscripción premium? (S/N): ");
			String premium = leer.readLine();
			String premiunMostrar = "No";
			if (premium.equalsIgnoreCase("S"))
				premiunMostrar = "Si";

			String idUsuario = nombre.substring(0, 3).toUpperCase() + "GAME" + año;
			int edad = calcularEdad(año);
			String tipoUsuario = "";
			if (edad < 18)
				tipoUsuario = "Junior Gamer";
			else if (edad <= 30)
				tipoUsuario = "Pro Gamer";
			else
				tipoUsuario = "Master Gamer";

			System.out.println("ID Usuario: " + idUsuario);
			System.out.println("Edad: " + edad);
			System.out.println("Tipo de usuario: " + tipoUsuario);
			System.out.println("Plataforma favorita: " + plataforma);
			System.out.println("Premium: " + premiunMostrar);
			
			todoOK = true;

		} catch (IOException e) {
			System.out.println("Error de lectura.");
		} catch (NumberFormatException e) {
			System.out.println("Año inválido.");
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Nombre demasiado corto para generar ID.");
		}
		}
	}

	public static int calcularEdad(int añoNacimiento) {
		return 2025 - añoNacimiento;
	}

	// OPCION 1.2
	public static void calcularEdadUsuario(BufferedReader leer) {

		boolean entradaValida = false;

		while (!entradaValida) {

			try {
				System.out.print("Introduce el año de nacimiento: ");
				int año = Integer.parseInt(leer.readLine());

				if (año < 1920 || año > 2025) {
					throw new IllegalArgumentException("Año fuera de rango.");
				}

				int edad = calcularEdad(año);

				String pegi;

				if (edad >= 18) {
					pegi = "PEGI 18";
				} else if (edad >= 16) {
					pegi = "PEGI 16";
				} else if (edad >= 12) {
					pegi = "PEGI 12";
				} else if (edad >= 7) {
					pegi = "PEGI 7";
				} else {
					pegi = "PEGI 3";
				}

				System.out.println("Edad: " + edad);
				System.out.println("Puede jugar a juegos con etiqueta: " + pegi);

				entradaValida = true;
			} catch (IOException e) {
				System.out.println("Error de lectura.");
			} catch (NumberFormatException e) {
				System.out.println("Número inválido.");
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	// OPCION 2 - MENU
	public static void catalogoJuegos(BufferedReader leer) {
		int opcion;
		do {
			System.out.println("\n--- CATÁLOGO DE JUEGOS ---");
			System.out.println("1. Añadir juegos a la biblioteca");
			System.out.println("2. Calcular espacio total ocupado");
			System.out.println("3. Volver al menú principal");

			opcion = leerOpcion(leer, 1, 3);

			switch (opcion) {
			case 1:
				añadirJuegos(leer);
				break;
			case 2:
				calcularEspacio(leer);
				break;
			}
		} while (opcion != 3);
	}

	// OPCION 2.1
	public static void añadirJuegos(BufferedReader leer) {
		boolean todoOK = false;
		while(!todoOK) {
		try {
			System.out.print("¿Cuántos juegos quieres añadir?: ");
			int cantidad = Integer.parseInt(leer.readLine());

			int contador = 0;
			double totalGastado = 0;

			while (contador < cantidad) {
				System.out.print("Nombre del juego: ");
				String nombre = leer.readLine();

				System.out.print("Tamaño en GB de " + nombre + ": ");
				Double.parseDouble(leer.readLine());

				System.out.print("Precio de " + nombre + ": ");
				double precio = Double.parseDouble(leer.readLine());

				totalGastado += precio;
				contador++;
			}

			System.out.println("Total de juegos: " + contador);
			System.out.println("Total gastado: " + totalGastado + "€");
			todoOK = true;

		} catch (IOException e) {
			System.out.println("Error de lectura.");
		} catch (NumberFormatException e) {
			System.out.println("Número inválido.");
		}
		}
	}

	// OPCION 2.2
	public static void calcularEspacio(BufferedReader leer) {
		boolean todoOK = false;
		while(!todoOK) {
		try {
			System.out.print("Memoria disponible en GB: ");
			double memoria = Double.parseDouble(leer.readLine());

			System.out.print("¿Cuántos juegos vas a instalar?: ");
			int cantidad = Integer.parseInt(leer.readLine());

			double ocupado = 0; // Memoria real ocupada
			double ocupadoTemp = 0; // Para "probar" que todvia queda memoria
			for (int i = 1; i <= cantidad && ocupadoTemp <= memoria; i++) {
				System.out.print("Tamaño del juego " + i + " en GB: ");
				double tamaño = Double.parseDouble(leer.readLine());

				if (ocupado + tamaño > memoria) {
					System.out.println("¡Memoria superada! No puedes instalar más juegos.");
				} else {
					ocupado += tamaño;
				}
				ocupadoTemp += tamaño;

			}

			System.out.println("Espacio total ocupado: " + ocupado + " GB");
			todoOK = true;

		} catch (IOException e) {
			System.out.println("Error de lectura.");
		} catch (NumberFormatException e) {
			System.out.println("Número inválido.");
		}
		}
	}

	// OPCION 3
	public static void sistemaValoraciones(BufferedReader leer) {
		boolean todoOK = false;
		while(!todoOK) {
		try {
			System.out.print("Nombre del juego a valorar: ");
			String juego = leer.readLine();

			System.out.print("¿Cuántos usuarios han valorado el juego " + juego + " ?: ");
			int totalUsuarios = Integer.parseInt(leer.readLine());

			double suma = 0;
			for (int i = 1; i <= totalUsuarios; i++) {
				double nota = -1;
				while (nota < 0 || nota > 10) {
					try {
						System.out.print("Valoración del usuario " + i + " (0-10): ");
						nota = Double.parseDouble(leer.readLine());
						if (nota < 0 || nota > 10) {
							System.out.println("Nota inválida. Debe estar entre 0 y 10.");
						}
					} catch (NumberFormatException e) {
						System.out.println("Entrada inválida. Introduce un número.");
					} catch (IOException e) {
						System.out.println("Error de lectura.");
					}
				}
				suma += nota;
			}

			double media = suma / totalUsuarios;
			String resumen = "";
			if (media <= 4.9) {
				resumen = "Decepcionante";
			} else if (media >= 5 && media <= 6.9) {
				resumen = "Aceptable";
			} else if (media >= 7 && media <= 8.4) {
				resumen = "Bueno";
			} else if (media >= 8.5 && media <= 9.5) {
				resumen = "Excelente";
			} else {
				resumen = "Obra Maestra";
			}
			System.out.println("Nota media: " + media);
			System.out.println("Resumen: " + resumen);
			todoOK = true;

		} catch (IOException e) {
			System.out.println("Error de lectura.");
		} catch (NumberFormatException e) {
			System.out.println("Número inválido.");
		}
		}
	}

	// OPCION 3
	public static void estadisticasReportes(BufferedReader leer) {
		int opcion;
		do {
			System.out.println("\n--- ESTADÍSTICAS Y REPORTES ---");
			System.out.println("1. Contador de juegos completados");
			System.out.println("2. Calcular horas totales de juego");
			System.out.println("3. Volver al menú principal");

			opcion = leerOpcion(leer, 1, 3);

			switch (opcion) {
			case 1:
				contadorJuegosCompletados(leer);
				break;
			case 2:
				calcularHorasTotales(leer);
				break;
			}
		} while (opcion != 3);
	}

	// OPCION 3.1
	public static void contadorJuegosCompletados(BufferedReader leer) {
		boolean todoOK = false;
		while (!todoOK) {
			try {
				System.out.print("Número de juegos completados este año: ");
				int numero = Integer.parseInt(leer.readLine());

				if (numero < 0 || numero > 500) {
					throw new IllegalArgumentException("Número fuera de rango.");
				}

				mostrarJuegosCompletados(numero);
				todoOK = true;

			} catch (IOException e) {
				System.out.println("Error de lectura.");
			} catch (NumberFormatException e) {
				System.out.println("Número inválido.");
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	public static void mostrarJuegosCompletados(int numero) {
		if (numero == 0)
			return;
		System.out.println("Has completado el juego número: " + numero);
		mostrarJuegosCompletados(numero - 1);
	}

	// OPCION 3.2.
	public static void calcularHorasTotales(BufferedReader leer) {
		boolean todoOK = false;
		while(!todoOK) {
		try {
			System.out.print("¿Quieres introducir solo horas (H) o horas y minutos (HM)?: ");
			String tipo = leer.readLine();

			if (tipo.equalsIgnoreCase("H")) {
				System.out.print("Horas: ");
				int horas = Integer.parseInt(leer.readLine());
				System.out.println("Total de horas jugadas: " + calcularHorasTotales(horas));
			} else if (tipo.equalsIgnoreCase("HM")) {
				System.out.print("Horas: ");
				int horas = Integer.parseInt(leer.readLine());
				System.out.print("Minutos: ");
				int minutos = Integer.parseInt(leer.readLine());
				System.out.println("Total de horas jugadas: " + calcularHorasTotales(horas, minutos));
			} else {
				System.out.println("Opción inválida.");
			}
			todoOK = true;

		} catch (IOException e) {
			System.out.println("Error de lectura.");
		} catch (NumberFormatException e) {
			System.out.println("Número inválido.");
		}
		}
	}

	public static double calcularHorasTotales(int horas) {
		return horas;
	}

	public static double calcularHorasTotales(int horas, int minutos) {
		return horas + (minutos / 60.0);
	}

	// OPCION 4
	public static void calculadoraDescuentos(BufferedReader reader) {
		boolean todoOK = false;
		while (!todoOK) {
			try {
				System.out.print("Introduce el precio del juego: ");
				double precio = Double.parseDouble(reader.readLine());

				System.out.print("Introduce el porcentaje de descuento (0-100): ");
				double descuento = Double.parseDouble(reader.readLine());

				if (descuento < 0 || descuento > 100) {
					throw new IllegalArgumentException("Descuento fuera de rango.");
				}

				double precioFinal = calcularDescuento(precio, descuento);
				double ahorro = precio - precioFinal;

				System.out.println("Precio original: " + precio + "€");
				System.out.println("Precio final: " + precioFinal + "€");
				System.out.println("Ahorro total: " + ahorro + "€");
				
				todoOK = true;

			} catch (IOException e) {
				System.out.println("Error de lectura.");
			} catch (NumberFormatException e) {
				System.out.println("Número inválido.");
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	public static double calcularDescuento(double precio, double descuento) {
		double precioFinal = precio - (precio * descuento / 100);
		if (precioFinal > 15) {
			return calcularDescuento(precioFinal, 5);
		}
		return precioFinal;
	}

	// MÉTODOS AUXILIARES
	public static int leerOpcion(BufferedReader leer, int min, int max) {
		int opcion = -1;
		while (opcion < min || opcion > max) {
			try {
				System.out.print("Selecciona una opción: ");
				opcion = Integer.parseInt(leer.readLine());
			} catch (IOException e) {
				System.out.println("Error de lectura.");
			} catch (NumberFormatException e) {
				System.out.println("Entrada inválida. Introduce un número.");
			}
			if (opcion < min || opcion > max)
				System.out.println("Opción no valida.");
		}
		return opcion;
	}

}