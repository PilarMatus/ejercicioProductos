package Producto;

public class Producto {

	int fecha_de_caducidad;  
	int número_de_lote;
	
	public Producto() {
		super();
	}

	public Producto(int fecha_de_caducidad, int número_de_lote) {
		super();
		this.fecha_de_caducidad = fecha_de_caducidad;
		this.número_de_lote = número_de_lote;
	}

	public int getFecha_de_caducidad() {
		return fecha_de_caducidad;
	}

	public void setFecha_de_caducidad(int fecha_de_caducidad) {
		this.fecha_de_caducidad = fecha_de_caducidad;
	}

	public int getNúmero_de_lote() {
		return número_de_lote;
	}

	public void setNúmero_de_lote(int número_de_lote) {
		this.número_de_lote = número_de_lote;
	}

	@Override
	public String toString() {
		return "Producto [fecha_de_caducidad=" + fecha_de_caducidad + ", número_de_lote=" + número_de_lote + "]";
	}
	
	
}
