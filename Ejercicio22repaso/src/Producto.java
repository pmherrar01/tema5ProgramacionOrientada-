
public class Producto {
	private String nombre;
	private int precio;
	private int stock;

	public Producto() {
		this.nombre = "";
		this.precio = 0;
		this.stock = 0;
	}

	public Producto(String nombre, int precio, int stock) {
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
	}
	public String getNombre() {
		return nombre;
	}
	public int getPrecio() {
		return precio;
	}
	public int getStcok() {
		return stock;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public void setStcok(int stock) {
		this.stock = stock;
	}

	@Override

	public String toString() {
		return " un " + nombre +" que cuesta: " + precio + " y nos quedan: " + stock+ " unidades";
	}



}
