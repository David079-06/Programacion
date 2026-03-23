import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej1examen {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
		boolean salir = false;
		System.out.println("=== BIENVENIDO AL GESTOR DE NOTAS DE EXAMEN ===");
		float nota=0;
		do {
			System.out.println("\n--- MENÚ PRINCIPAL ---");
			System.out.println("1. Creador de perfil de usuario");
			System.out.println("2. Maratón de series");
			System.out.println("3. Calificar series y capítulos");
			System.out.println("4. Sistema de recomendaciones");
			System.out.println("5. Salir");
			System.out.print("Elige una opción: ");
			int opcion = Integer.parseInt(leer.readLine());
			switch (opcion) {
			case 1:
				System.out.println("=== CREADOR DE PERFIL DE USUARIO ===");
				System.out.println("Introduce tu nombre:");
				String nombreperfil= leer.readLine();
				System.out.println("Introduce tu género favorito:");
				String nombregenero= leer.readLine();
				System.out.println("Introduce tu edad:");
				  int edadperfil  = Integer.parseInt(leer.readLine());
				System.out.println("Introduce el precio base mensual:");
				float preciobase = Float.parseFloat(leer.readLine());
				System.out.println("Introduce el número de perfiles:");
				 int numperfiles  = Integer.parseInt(leer.readLine());
				System.out.println("¿Quieres calidad 4K? (S/N):");
				String calidad= leer.readLine();
				
				String cadena1=nombreperfil.substring(0,3);
	            String cadena2=cadena1.toUpperCase();
	            String cadena1_genero=nombregenero.substring(0,2);
	            String cadena2_genero=cadena1_genero.toLowerCase();
	            String Idusuario=cadena2+cadena2_genero+edadperfil;
	            
	            
	            System.out.println("ID de usuario:"+Idusuario);
	            if (edadperfil<=7) {
	            	 System.out.println("infantil");
	            }else if (edadperfil>=8 && edadperfil<=12) {
	            	System.out.println("familiar");
	            }else if (edadperfil>=13 && edadperfil<=17) {
	            	System.out.println("juvenil");
	            }else {
	            	System.out.println("todas las películas");
	            }
	            
	            	
	            	
				if (calidad.equals("s")){
					int preciomensual= (int) (preciobase+(numperfiles*3))+5;
					
					if (numperfiles>5) {
			      	int descuento=(int) (preciomensual*0.1);
			      	
			    	System.out.println("Precio mensual:"+(preciomensual-descuento));
			    	
			    	}else {
			    	System.out.println("Precio mensual:"+preciomensual);
			    	}
					
				}else if(calidad.equals("n")) {
					 int preciomensual= (int) (preciobase+(numperfiles*3));
					 
					if (numperfiles>5) {
				      	int descuento=(int) (preciomensual*0.1);
				    	System.out.println("Precio mensual:"+(preciomensual-descuento));
				    }else {
				    	System.out.println("Precio mensual:"+preciomensual);
				    }

				}
				
		    break;
			case 2:
				 System.out.println("Introduce el número total de capítulos de la serie:");
				 int numcapitulos  = Integer.parseInt(leer.readLine());
				 int capitulostotales=numcapitulos;
				int duracioncap;
			do {
				
			 System.out.println("Reproduciendo episodio 1 de un total de 2");
			 System.out.println("Introduce la duración en minutos del capítulo 1 (0 para parar):" );
			  duracioncap  = Integer.parseInt(leer.readLine());
			 System.out.println("Reproduciendo episodio 2 de un total de 2");
			 System.out.println("Introduce la duración en minutos del capítulo 2 (0 para parar):" );
			  duracioncap  = Integer.parseInt(leer.readLine());
			}while(capitulostotales<numcapitulos||duracioncap!=0);
			
			 System.out.println("--- RESUMEN ---");
			 System.out.println("Has visto toda la serie");
			
			case 3:
			System.out.println(" Introduce el nombre de la serie:");
			String nombreserie= leer.readLine();
		    System.out.println("Introduce el número de temporadas:" );
		    int temporadas  = Integer.parseInt(leer.readLine());
		    System.out.println("Introduce el número de capítulos por temporada:");
		    int numerocapitulos = Integer.parseInt(leer.readLine());
		    numerocapitulos=2;
		    
		    for (int i=1;i<=temporadas;i++) {
		    	
		    	System.out.println("--- TEMPORADA "+i+" ---");
		    	System.out.println("Introduce la nota del capítulo 1 (0-10):");
		    	int notacapitulo1  = Integer.parseInt(leer.readLine());
		    	System.out.println("Introduce la nota del capítulo 2 (0-10):");
		    	int notacapitulo2  = Integer.parseInt(leer.readLine());
		    	int notatotal=notacapitulo1+notacapitulo2;
		    	int media= notatotal/numerocapitulos;
		    	System.out.println("Nota media de la temporada "+i+":"+media);
		    	int mediatotal=media++;
		    	
		    }
		    System.out.println("--- NOTA MEDIA FINAL DE LA SERIE" +nombreserie+":"+(mediatotal/i) );
		    
		    break;
			case 4:
				System.out.println("=== SISTEMA DE RECOMENDACIONES ===");
				int numaletoria1=(int) ((Math.random() * 5) + 1);
				int numaletoria2=(int) ((Math.random() * 5) + 1);
				
			break;
			case 5:
			salir = true;
			System.out.println("Gracias por usar CALASANZ");
			System.out.println("¡Nos vemos en tu próxima maratón!");
			break;
			default:
			System.out.println("Opción no válida");
			}
			}while(!salir);

	}
}
