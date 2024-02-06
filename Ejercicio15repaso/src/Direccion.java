
public class Direccion {
	private String calle;
	private int numero;
	private int piso;
	private String ciudad;
	
	public Direccion()	{
		this.calle="";
		this.numero=0;
		this.piso=0;
		this.ciudad="";
	}
	public Direccion(String calle, int numero, int piso, String ciudad) {
		this.calle = calle;
		this.numero = numero;
		this.piso = piso;
		this.ciudad = ciudad;
	}
	public String getCalle() {
		return calle;
	}
	public int getNumero() {
		return numero;
	}
	public int getPiso() {
		return piso;
	}
	public String getCiudad() {
		return ciudad;
	}
	
	
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public void setPiso(int piso) {
		this.piso = piso;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}	
	
	@Override
	
	public String toString() {
		return "Direccion" + "Calle: " + calle + "\n" + "Número" + numero + "\n" + "Puerta: " + piso + "\n" + "Ciudad: " + ciudad; 
	}

}
