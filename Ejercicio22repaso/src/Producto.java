
public class Producto {
	private String nombre;
	private int precio;
	private int stcok;
	
	public Producto() {
		this.nombre = "";
		this.precio = 0;
		this.stcok = 0;
	}
	
	public Producto(String nombre, int precio, int stcok) {
		this.nombre = nombre;
		this.precio = precio;
		this.stcok = stcok;
	}
	public String getNombre() {
		return nombre;
	}
	public int getPrecio() {
		return precio;
	}
	public int getStcok() {
		return stcok;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public void setStcok(int stcok) {
		this.stcok = stcok;
	}
	
	
}
