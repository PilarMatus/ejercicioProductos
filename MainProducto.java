package Producto;
import java.util.Scanner;
public class MainProducto {

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		
		productoFresco producto_fresco = new productoFresco();
		productoRefrigerado producto_refrigerado = new productoRefrigerado();
		productoCongelado producto_congelado = new productoCongelado();
		
		System.out.println("El producto es: "+ producto_fresco.getProducto()+"."+" La fecha de envasado es: "+producto_fresco.getFecha_de_envasado()+"."
				+" El pais de origen es: "+ producto_fresco.getPaís_de_origen());
		
		

	}

}
