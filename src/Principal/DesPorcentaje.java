package Principal;

public class DesPorcentaje extends Descuento {
	private int codigo;
	private int cant;
	
	public DesPorcentaje(int codigo, int cant) {
		this.codigo = codigo;
		this.cant = cant;
	}
	
	public DesPorcentaje() {
		
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
