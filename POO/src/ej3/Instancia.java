package ej3;

public class Instancia {
  private String titular;
  private double saldo;


public void ingresarSaldo (double cantAIngresar) {
		saldo=saldo + cantAIngresar;
		System.out.println("El nuevo saldo es:" + saldo);
	}
public void retirarSalda (double cantARetirar) {
	if(saldo>=cantARetirar) {
		saldo= saldo - cantARetirar;
		System.out.println("El nuevo saldo es:" + saldo);
	}else {
		System.out.println("No se puede retirar el saldo, no hay fondos suficientes ");

	}
	
}






}
