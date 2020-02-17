package Producto;

public class Producto {

	int fecha_de_caducidad;  
	int n�mero_de_lote;
	
	public Producto() {
		super();
	}

	public Producto(int fecha_de_caducidad, int n�mero_de_lote) {
		super();
		this.fecha_de_caducidad = fecha_de_caducidad;
		this.n�mero_de_lote = n�mero_de_lote;
	}

	public int getFecha_de_caducidad() {
		return fecha_de_caducidad;
	}

	public void setFecha_de_caducidad(int fecha_de_caducidad) {
		this.fecha_de_caducidad = fecha_de_caducidad;
	}

	public int getN�mero_de_lote() {
		return n�mero_de_lote;
	}

	public void setN�mero_de_lote(int n�mero_de_lote) {
		this.n�mero_de_lote = n�mero_de_lote;
	}

	@Override
	public String toString() {
		return "Producto [fecha_de_caducidad=" + fecha_de_caducidad + ", n�mero_de_lote=" + n�mero_de_lote + "]";
	}
	
	
}
