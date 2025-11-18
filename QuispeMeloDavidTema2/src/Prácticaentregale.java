import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prácticaentregale {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		main();
	}
	public static int  leerint(String mensaje) throws NumberFormatException, IOException {
		BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
		System.out.println(mensaje);
		int num = Integer.parseInt(leer.readLine());
		return num;
}
	public static String  leerint1(String mensaje) throws NumberFormatException, IOException {
		BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
		System.out.println(mensaje);
		String num =leer.readLine();
		return num;
	}
	
		public static void case1()throws NumberFormatException, IOException {
			boolean salirusuarios = false;
			do {
				
				System.out.println("--- GESTIÓN DE USUARIOS ---");
				System.out.println("1. Crear nuevo usuario");
				System.out.println("2. Calcular edad del usuario");
				System.out.println("3. Volver al menú principal");
				int opcion1 = leerint("Elige una opción: ");
				switch (opcion1) {
				case 1:
				String nombre=leerint1("Introduzca su nombre:");
				int añonacido=leerint("Introduzca su año de nacimiento:");
				String plataforma=leerint1("Introduzca su plataforma favorita  (PC, PlayStation, Xbox, Nintendo):");
				String suscripción=leerint1("¿Tiene suscripción premium? (S/N)");
				System.out.println("ID Usuario:" +  id(nombre,añonacido));
				System.out.println("Edad:" + edad(añonacido));
				System.out.println("Tipo de usuario:"); 
				typeuser(añonacido);
				plataformafav(plataforma);
				premium(suscripción);
				break;
				case 2:
				int añonacido2=leerint("Introduzca su año de nacimiento:");
				System.out.println("Edad:" + edad(añonacido2));
				etiqueta(añonacido2);
				break;	
				case 3:
				main();
				salirusuarios = true;
				break;
				default:
				System.out.println("Opción no válida");
				}
				}while(!salirusuarios);
		}
		public static void case2()throws NumberFormatException, IOException {
			boolean salirusuarios = false;
			do {
				
				System.out.println("--- CATÁLOGO DE JUEGOS ---");
				System.out.println("1. Añadir juegos a la biblioteca");
				System.out.println("2. Calcular espacio total ocupado");
				System.out.println("3. Volver al menú principal");
				int opcion1 = leerint("Elige una opción: ");
				switch (opcion1) {
				case 1:
				int numjuegos=leerint("¿Cuántos juegos quieres añadir?: ");	
				
				break;
				case 2:
		
				break;	
				case 3:
				main();
				salirusuarios = true;
				break;
				default:
				System.out.println("Opción no válida");
				}
				}while(!salirusuarios);
		}
		public static void main() throws NumberFormatException, IOException{
			boolean salir=false;
			do {
				//MOSTRAR MENU
				System.out.println("=== BIBLIOTECA Calasanz Games ===");
				System.out.println("1.Gestión de Usuarios");
				System.out.println("2.Catálogo de Juegos");
				System.out.println("3.Sistema de Valoraciones");
				System.out.println("4.Estadísticas y Reportes");
				System.out.println("5.Calculadora de Descuentos");
				System.out.println("6.Salir");
				int opcion = leerint("Elige una opción: ");
				switch (opcion) {
				case 1:
				case1();
				break;
				case 2:
				case2();
				break;
				case 3:
				
	            break;
				case 4:
				
				break;
				case 5:
					
		        break;
				case 6:
					salir = true;
					System.out.println("¡Hasta luego!");
					break;
					default:
					System.out.println("Opción no válida");
				}       
		}while (salir);
		}
		public static String id(String nombre,int numero ){
		String cadena1=nombre.substring(0,3);
		String cadena2=cadena1.toUpperCase();
		String cadena3="GAME";
		String resultado= cadena2+cadena3+numero;
			return resultado;
		}
		public static int edad(int numero) {
			int año=2025;
			int resultado=año-numero;
			return resultado;
		}
		public static void typeuser(int numero) {
		if (edad(numero)<=17) {
			System.out.println("Junior Game");
		}else if (edad(numero)>=18&&edad(numero)<=30) {
			System.out.println("Pro Gamer");
		}else {
			System.out.println("Master Gamer");
		}
		}
		
		public static void plataformafav(String mensaje) {
		for (String i=mensaje;i==mensaje;);
			if (mensaje.equals("PC")) {
				System.out.println("Plataforma favorita: PC");
			}else if (mensaje.equals("PlayStation")) {
				System.out.println("Plataforma favorita: PlayStation");
			}else if (mensaje.equals("Nintendo")){
				System.out.println("Plataforma favorita: Nintendo");
			}else if (mensaje.equals("Xbox")) {
				System.out.println("Plataforma favorita: Xbox");
			}else  {
				System.out.println("Plataforma incorrecta");
			}
		}
		public static void premium(String mensaje) {}
		
		public static void etiqueta(int numero) {
		if (edad(numero)>=16&&edad(numero)<18) {
			System.out.println("Puede jugar a juegos con etiqueta: PEGI 16");
		}else if (edad(numero)>=18) {
			System.out.println("Puede jugar a juegos con etiqueta: PEGI 18");
		}else if (edad(numero)>=12&& edad(numero)<16) {
			System.out.println("Puede jugar a juegos con etiqueta: PEGI 12");
		}else if (edad(numero)>=7&& edad(numero)<12) {
			System.out.println("Puede jugar a juegos con etiqueta: PEGI 7");
		}else  {
			System.out.println("Puede jugar a juegos con etiqueta: PEGI 3");
		}
		}
		public static void biblioteca(int numero) throws NumberFormatException, IOException {
		
		for (int i=0;i==numero;i++);
		String nombrejuego=leerint1("Nombre del juego: ");
		}
}
