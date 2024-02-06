
public class Empleado {
	private String nombre;
	private int salario;
	private Direccion direccion;
	
	public Empleado() {
		this.nombre="";
		this.salario=0;
		this.direccion= new Direccion();
	}
	
	public Empleado(String nombre, int salario, Direccion direccion) {
		super();
		this.nombre = nombre;
		this.salario = salario;
		this.direccion = direccion;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public int getSalario() {
		return salario;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	
	
}
