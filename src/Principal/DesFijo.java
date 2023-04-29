package Principal;

public class DesFijo extends Descuento{
	private int codigo;
	private int cant;
	
	public DesFijo(int codigo, int cant) {
		this.codigo = codigo;
		this.cant = cant;
	}
	
	public DesFijo() {
		
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getCant() {
		return cant;
	}

	public void setCant(int cant) {
		this.cant = cant;
	}
	
	
	
}
