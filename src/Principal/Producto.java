package Principal;

public class Producto {
	private static int codigo = 0;
	private String nombre;
	private double precio;
	private String descripcion;
	private int stock;
	
	public Producto(String nombre, double precio, String descripcion, int stock) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.descripcion = descripcion;
		this.stock = stock;
		incrementarContador();
	}
	
	public Producto() {
		incrementarContador();
	}
	
    private static void incrementarContador() {
        codigo++;
    }

	public int getCodigo() {
		return codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
	
}
