package Producto;

public class productoFresco extends Producto{
	
	 String producto;
	 String fecha_de_envasado;
	 String país_de_origen;
	 
	 
	public productoFresco() {
		producto = "manzanas";
		fecha_de_envasado= "23-01-2020";
		país_de_origen = "chile";
	}


	
	public productoFresco(String producto, String fecha_de_envasado, String país_de_origen) {
		super();
		this.producto = producto;
		this.fecha_de_envasado = fecha_de_envasado;
		this.país_de_origen = país_de_origen;
	}




	public String getProducto() {
		return producto;
	}



	public void setProducto(String producto) {
		this.producto = producto;
	}



	public String getFecha_de_envasado() {
		return fecha_de_envasado;
	}


	public void setFecha_de_envasado(String fecha_de_envasado) {
		this.fecha_de_envasado = fecha_de_envasado;
	}


	public String getPaís_de_origen() {
		return país_de_origen;
	}


	public void setPaís_de_origen(String país_de_origen) {
		this.país_de_origen = país_de_origen;
	}



	@Override
	public String toString() {
		return "productoFresco [producto=" + producto + ", fecha_de_envasado=" + fecha_de_envasado + ", país_de_origen="
				+ país_de_origen + "]";
	}



	 
	 
	 
	 

}
