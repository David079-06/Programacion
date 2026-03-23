import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Ej8 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		ArrayList<Float> calificacion = new ArrayList<>();
		boolean salir = false;
		
		do {
			System.out.println("-----SISTEMA DE GESTIÓN CALIFICACIONES DE ALUMNOS-----");
			System.out.println(" 1: Añadir calificación");
			System.out.println(" 2: Eliminar una calificación por posición .");
			System.out.println(" 3: Mostrar todas las calificaciones.");
            System.out.println(" 4: Calcular la media de las calificaciones.");
            System.out.println(" 5: Mostrar cuántas calificaciones son aprobados.");
            System.out.println(" 6: Encontrar la calificación más alta y más baja.");
            System.out.println(" 7: Contar cuántas calificaciones hay por encima de la media.");
            System.out.println(" 8: Modificar una calificación.");
            System.out.println(" 9: salir.");
			
			int opcion = leerInt("Introduce una opcion: ");
			
			switch(opcion) {
			case 1:
				Opcion1(calificacion);
				break;
			case 2:
				Opcion2(calificacion);
				break;
			case 3:
				Opcion3(calificacion);
				break;
			case 4:
				Opcion4(calificacion);
                break;
            case 5:
            	Opcion5(calificacion);
                break;
            case 6:
            	Opcion62(calificacion);
                break;
            case 7:
            	Opcion7(calificacion);
                break;
            case 8:
            	Opcion8(calificacion);
                break;
            case 9:
                System.out.println("¡Hasta pronto!");
                salir = true;
                break;
			default:
				System.out.println("Opcion no valida");
			}
			
		}while(!salir);
	}
	
	public static void Opcion1(ArrayList<Float> calificacion) throws NumberFormatException, IOException  {
	
        float nota = -1;
        boolean valida = false;
        while (!valida) {
            try {
            	System.out.println("-------AÑADIR CALIFICACION-------");
                nota =leerFloat("Introduce la calificacion:");

                if (nota >= 0 && nota <= 10) {
                    valida = true;
                    calificacion.add(nota);
                } else {
                    System.out.println("Error: La nota debe estar entre 0 y 10.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Debes introducir un número válido.");
            }
        }
	}
	public static void Opcion2(ArrayList<Float>calificacion) throws IOException  {
		System.out.println("-------ELIMINAR NOTA POR POSICION-------");
		int pos=-1;
		try { 
			pos=leerInt("Introduce la posicion de la nota");
			
		}catch (NumberFormatException e) {
			pos=-1;
			System.out.println("Tienes que introducir un numero ");
		}while(pos<0||pos>calificacion.size());
		calificacion.remove(pos);
		 
	}
	public static void Opcion3(ArrayList<Float>calificacion) throws IOException  {
		System.out.println("-------MOSTRAR TODAS LAS CALIFICACIONES-------");
		for (int i=0;i<calificacion.size();i++) {
			System.out.println((i+1)+": "+calificacion.get(i));
		}
	}
	
	public static void Opcion4(ArrayList<Float>calificacion) throws IOException  {
		System.out.println("-------CALCULAR LA MEDIA DE LAS CALIFICACIONES-------");
		float sumatotal=0;
        float media;
		for (int i=0;i<calificacion.size();i++) {
			
		sumatotal+=calificacion.get(i);
		}
		media=sumatotal/calificacion.size();
		System.out.println(media);
	}
	public static void Opcion5(ArrayList<Float>calificacion) throws IOException  {
		System.out.println("-------MOSTRAR APROBADOS-------");
		
		for (int i=0;i<calificacion.size();i++) {
			if(calificacion.get(i)>=5) {
				System.out.println(calificacion.get(i) +" Esta aprobado");

			}else if (calificacion.get(i)<=5){
				System.out.println(calificacion.get(i) +" Esta suspendido");
			}
		}
	}
	public static void Opcion6(ArrayList<Float>calificacion) throws IOException  {
		System.out.println("-------ENCONTRAR CALIFICACION MAS ALTA Y BAJA-------");
		int calificacionalta=0;
		int calificacionbaja=0;
		for (int i=0;i<calificacion.size();i++) {
			if(calificacion.get(i)>=5) {
				System.out.println(calificacion.get(i) +" Esta aprobado");

			}else if (calificacion.get(i)<=5){
				System.out.println(calificacion.get(i) +" Esta suspendido");
			}
		}
	}
	public static void Opcion62(ArrayList<Float>calificacion) throws IOException  {
		System.out.println("-------ENCONTRAR CALIFICACION MAS ALTA Y BAJA-------");
		float numMayor=0 ;
		
		float numMenor=0;
		
		for(int i = 0; i < calificacion.size(); i++) {
			if (calificacion.get(i) > numMayor) {
				numMayor = calificacion.get(i);
				
			}else if(calificacion.get(i) < numMenor) {
				numMenor = calificacion.get(i);
				
			}
		}
		System.out.println("La calificacion mas alta es: " + numMayor);
		System.out.println("La calificacion mas baja es: " + numMenor);
	}
	public static void Opcion7(ArrayList<Float>calificacion) throws IOException  {
		System.out.println("-------CALIFICACIONES POR ENCIMA DE LA MEDIA-------");
		float mediacurso=calcularmedia(calificacion);
		int sobrelamedia=0;
		for (int i=0;i<calificacion.size();i++) {
			if(calificacion.get(i)>mediacurso) {
				sobrelamedia++;
		}
	}
		System.out.println("Hay " + sobrelamedia +  " notas por encima de la media");
	}
	
	public static void Opcion8(ArrayList<Float>calificacion) throws IOException  {
		System.out.println("-------CALIFICACIONES POR ENCIMA DE LA MEDIA-------");
		float mediacurso=calcularmedia(calificacion);
		int sobrelamedia=0;
		for (int i=0;i<calificacion.size();i++) {
			if(calificacion.get(i)>mediacurso) {
				sobrelamedia++;
		}
	}
		System.out.println("Hay " + sobrelamedia +  " notas por encima de la media");
	}
	
	public static float calcularmedia(ArrayList<Float>calificacion) throws IOException  {
		float sumatotal=0;
        float media;
		for (int i=0;i<calificacion.size();i++) {
			
		sumatotal+=calificacion.get(i);
		}
		media=sumatotal/calificacion.size();
		return media;
	}
      
	public static int leerInt(String mensaje) throws NumberFormatException, IOException  {
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(mensaje);
		int num = Integer.parseInt(leer.readLine());
		return num;
	}
	public static Float leerFloat(String mensaje) throws NumberFormatException, IOException  {
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(mensaje);
		float num = Float.parseFloat(leer.readLine());
		return num;
	}
	public static String leerString(String mensaje) throws IOException {
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(mensaje);
		return leer.readLine();
	}	
		
	

}
