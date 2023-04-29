package Principal;

import java.util.Date;

public class Descuento {
	private int codigo;
	private Date comienzo;
	private int duracion;
	
	public Descuento(int codigo, Date comienzo, int duracion) {
		this.codigo = codigo;
		this.comienzo = comienzo;
		this.duracion = duracion;
	}
	
	public Descuento() {
		
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Date getComienzo() {
		return comienzo;
	}

	public void setComienzo(Date comienzo) {
		this.comienzo = comienzo;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	
	
}
