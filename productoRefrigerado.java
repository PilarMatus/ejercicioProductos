package Producto;

public class productoRefrigerado extends Producto{
	
	int cod_de_supervision;

	public productoRefrigerado() {
		cod_de_supervision = 1234;
	}

	public productoRefrigerado(int cod_de_supervision) {
		super();
		this.cod_de_supervision = cod_de_supervision;
	}

	public int getCod_de_supervision() {
		return cod_de_supervision;
	}

	public void setCod_de_supervision(int cod_de_supervision) {
		this.cod_de_supervision = cod_de_supervision;
	}

	@Override
	public String toString() {
		return "productoRefrigerado [cod_de_supervision=" + cod_de_supervision + "]";
	}

	
	
}
