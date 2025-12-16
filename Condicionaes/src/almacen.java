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
