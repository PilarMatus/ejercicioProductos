package Producto;

public class  productoCongelado extends Producto {
	
	   double temperatura;

	public productoCongelado() {
		temperatura = -10;
	}

	public productoCongelado(double temperatura) {
		super();
		this.temperatura = temperatura;
	}

	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

	@Override
	public String toString() {
		return "productoCongelado [temperatura=" + temperatura + "]";
	}
	   

}
