package ejerciciosprogram;

public class Ejercicio7 {
	public static void main(String[] args) {
		
		String frase = "Programar en Java es divertido";
		
		System.out.println(frase.length());
		System.out.println(frase.substring(13,17));
		System.out.println(frase.replace("Java" , "Python"));
		System.out.println(frase.toUpperCase());
		System.out.println(frase.startsWith("Programar"));
	}
}
