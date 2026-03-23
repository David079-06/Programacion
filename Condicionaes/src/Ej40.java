import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej40 {

	public static void main(String[] args)throws NumberFormatException, 
	IOException  {
		// TODO Auto-generated method stub
int sumapares=0;
int sumaimpares=0;
int numpares = 0;
int numimpares = 0;
double media=0;
BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
for (int i=1 ; i<=10;i++) {
   int numero=Integer.parseInt(leer.readLine());
   
  if (numero%2==0) {
	 sumapares = sumapares + numero;
	  numpares++;
		  System.out.println(numero+" es par");
  } else {
	  sumaimpares +=numero;
	  numimpares++;
	  System.out.println(numero + " es impar");
  }
	}
media= sumaimpares/numimpares;
System.out.println("La suma de numero pares es " + sumapares);
System.out.println("Hay " + numpares + " numeros pares");
System.out.println("La media de numero impares es " + sumaimpares);

	}
}
