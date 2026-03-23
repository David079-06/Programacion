import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej5 {

	public static void main(String[] args)throws NumberFormatException, 
	IOException { 
		// TODO Auto-generated method stub
		BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
		boolean salir = false;
		System.out.println("=== BIENVENIDO A LA MINI CARRERA ===");
		int cocheA=0;
		int cocheB=0;
		int meta=50;
		do {
			System.out.println("\n--- MENÚ PRINCIPAL ---");
			System.out.println("1. Avanzar coche A");
			System.out.println("2. Avanzar coche B");
			System.out.println("3. Mostrar posiciones actuales");
			System.out.println("4. Comprobar si hay ganador");
			System.out.println("5. Simular carrera automática (10 turnos)");
			System.out.println("6. Reiniciar carrera");
			System.out.println("7. Salir");
			System.out.print("Elige una opción: ");
			int opcion = Integer.parseInt(leer.readLine());
			switch (opcion) {
			case 1:
			
				cocheA=(int) (cocheA+(Math.random() * 10) + 1);
			System.out.println("=== AVANZAR COCHE A ===");
			System.out.println("El coche A avanza " +cocheA + " metros");
	 
		    break;
			case 2:
			System.out.println("=== AVANZAR COCHE B ===");
              cocheB=(int) (cocheB+(Math.random() * 10) + 1);
			System.out.println("El coche A avanza " +cocheB + " metros");			
			break;
			case 3:
				
				 System.out.println("=== POSICIONES ACTUALES ===");
				 System.out.println("Coche A: "+cocheA + " metros");
				 System.out.println("Coche B: "+cocheB + " metros");
				 System.out.println("Meta: "+meta + " metros");
				 if (cocheA>cocheB) {
				int diferencia = cocheA-cocheB;
				 System.out.println("El coche A va ganando por " + diferencia + " metros");
				 }else {
			    int diferencia = cocheB-cocheA;
				 System.out.println("El coche B va ganando por " + diferencia + " metros");
				 }
				 
		    break;
			case 4:
			if (cocheA>=50) {
				
				System.out.println("Ganador coche A" );
				System.out.println("Coche A: " + cocheA +"/" + meta);
				System.out.println("Coche B: " + cocheB +"/" + meta);
			}else if (cocheB>=50) {
				System.out.println("Ganador coche B" );
				System.out.println("Coche A: " + cocheA +"/" + meta);
				System.out.println("Coche B: " + cocheB +"/" + meta);
			}else {
				System.out.println("Aún no hay ganador" );
				System.out.println("Coche A: " + cocheA +"/" + meta);
				System.out.println("Coche B: " + cocheB +"/" + meta);
				
			}
			break;
			case 5:
				System.out.println("=== SIMULACIÓN AUTOMÁTICA ===");
				System.out.println("¡Iniciando carrera automática de 10 turnos!");
				int	cocheA1=(int) (cocheA+(Math.random() * 10) + 1);
				int cocheB1=(int) (cocheB+(Math.random() * 10) + 1);
			
				for (int i=1;i<=10;i++) {
					int cocheA2=cocheA1+cocheA1;
					int cocheB2=cocheB1+cocheB1;
		
					System.out.println("--- TURNO "+i+ " ---");
					System.out.println("Coche A avanza "+cocheA1+ "→ Posición: " + cocheA2);
					System.out.println("Coche B avanza "+cocheB1+ "→ Posición: " + cocheB2 );
			
					if (cocheA1>=50) {
						System.out.println("¡¡¡HAY UN GANADOR!!!");
						System.out.println("¡EL COCHE A GANA!");
					}else if (cocheB1>=50){
						System.out.println("¡¡¡HAY UN GANADOR!!!");
						System.out.println("¡EL COCHE B GANA!");
					}
				if (cocheA2>=50||cocheB2>=50)break;
			
				}
			
			case 6:
				System.out.println("=== REINICIAR CARRERA ===");
				cocheA=0;cocheB=0;
				System.out.println("¡Carrera reiniciada! Ambos coches vuelven a la posición 0");
			break;
			case 7:
			salir = true;
			System.out.println("¡Hasta luego!");
			break;
			default:
			System.out.println("Opción no válida");
			}
			}while(!salir);
	}

}
