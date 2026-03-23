import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej1 {

	public static void main(String[] args)throws NumberFormatException, 
	IOException  {
	
		
		BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("=== BIENVENIDO A GESTIÓN DE VENTAS ===");
		boolean salir=false;
		do {
			//MOSTRAR MENU
			System.out.println("\n--- MENÚ PRINCIPAL ---");
			System.out.println("1.Calcular IVA (21%) de un producto");
			System.out.println("2.Calcular descuento por comprar más de 3 figuras (10%)");
			System.out.println("3.Calcular cuánto falta para envío gratis (50€) ");
			System.out.println("4.Mostrar tabla de precios (1-10 unidades");
			System.out.println("5. Salir");
			
			System.out.print("Elige una opción: ");
			int opcion = Integer.parseInt(leer.readLine());
			switch (opcion) {
			case 1:
			System.out.println("=== CALCULAR IVA === ");
			System.out.println("Introduce el precio del producto: ");
			float precioproducto=Float.parseFloat(leer.readLine());
			System.out.println("Precio sin IVA: " + precioproducto + "€");
			System.out.println("IVA (21%): " + (precioproducto*0.21)+"€");
			System.out.println("Precio final con IVA: " +( precioproducto+(precioproducto*0.21)) +"€");
			break;
			case 2:
			System.out.println("=== CALCULAR DESCUENTO POR FIGURAS ===");
			System.out.println("Introduce el número de figuras: ");
			 int numfiguras  = Integer.parseInt(leer.readLine());
			System.out.println("Introduce el precio total: ");
			float preciototal = Float.parseFloat(leer.readLine());
             if (numfiguras<3 || numfiguras==3){
            System.out.println("No se aplica descuento (necesitas más de 3 figuras)");
            System.out.println("Precio final:" + preciototal+"€");
             } else {
            	 float descuento=(float)(preciototal-(preciototal*0.1));
             System.out.println("Precio final:" + descuento +"€");
             }
             
			break;
			case 3:
			System.out.println("=== CALCULAR ENVÍO GRATIS ===");
			System.out.println("Introduce el importe de tu pedido: ");
			float envio = Float.parseFloat(leer.readLine());

			if (envio>=50){
	            System.out.println("¡Felicidades! Tu pedido tiene envío gratis");
	           
	             } else {
	             System.out.println("Te faltan "+(50-envio)+"€ para conseguir envío gratis");
	             }
            break;
			case 4:
			
			System.out.println("--- Tabla de precios (sin IVA) ---");
			System.out.println("Introduce el precio unitario: ");
			float preciounitario = Float.parseFloat(leer.readLine());
             for (int i=1;i<=10;i++) {
		    double preciounitariototal=preciounitario*i;
		    float precioiva= (float) (preciounitariototal+(preciounitariototal*0.21));
			float descuento=(float)(precioiva-(precioiva*0.1));
			if (i<=3){
				System.out.println(i + " unidades: " + preciounitariototal + "€" + "(con IVA: "+ precioiva+  "€)" );
			}else {
		   
						 
		    System.out.println(i + " unidades: " + preciounitariototal + "€" + "(con IVA: "+ precioiva+  "€)" + "Precio con descuento: " +  descuento + 
		    		"(Descuento: " + (precioiva*0.1) +"€");
			}	
			
             }
			break;
			case 5:
				salir = true;
				System.out.println("¡Hasta luego!");
				break;
				default:
				System.out.println("Opción no válida");
			}       
	}while (salir);
	}
}
