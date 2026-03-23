package Ej1;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Producto {
private int id;
private String nombre;
private double precio;
private int stock;

public void pedirDatos() throws IOException {
	System.out.println("Introduce los datos del nuevo candidato:");
	
		this.id = Lecturas.leerEntero("Introduce el id del producto: ");
	this.nombre = Lecturas.leerString("Introduce el nombre del producto: ");
	this.precio = Lecturas.leerEntero("Introduce el precio del producto: " );
	this.stock = Lecturas.leerEntero("Introduce unidades disponibles: " );
	
}

public void escribirFichero() throws IOException {
	FileOutputStream fos = new FileOutputStream ("inventario.dat" , true);
	DataOutputStream dos = new DataOutputStream (fos);
	dos.writeInt(id);
	dos.writeUTF(nombre);
	dos.writeDouble(precio);
	dos.write(stock);
}


public int getStock() {
	return stock;
}

public void setStock(int stock) {
	this.stock = stock;
}

public int getId() {
	return id;
}

public String getNombre() {
	return nombre;
}

public double getPrecio() {
	return precio;
}


}
