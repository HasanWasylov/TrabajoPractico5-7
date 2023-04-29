package Principal;

public class Carrito {
	private int codigo;
	
	public Carrito(int codigo) {
		this.codigo = codigo;
	}
	
	public Carrito() {
		
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public double sumaPrecio(double precio, int cantidad) {
		
		double result = precio*cantidad;
		return result ;
	}
}

