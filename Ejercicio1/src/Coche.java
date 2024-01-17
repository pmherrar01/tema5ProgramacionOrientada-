
public class Coche {
	private String marca;
	private String modelo;
	private String color;
	private int velocidad;
	private boolean motorEncendido=false;
	
	public void establecerMarca() {
		
	}
	
	public void establecerModelo() {
	
	}
	
	public void establecerColor() {
		
	}
	
	public void arrancarCoche() {
		motorEncendido=true;
		velocidad=10;
		
	}
	
	public void apagarCoche() {
		motorEncendido=false;
		velocidad=0;
	}
	
	public void acelerarCoche() {
		velocidad=velocidad+20;
	}
	
	public void frenarCoche() {
		velocidad=velocidad-6;
	}
	
	public void obtenerEstado() {
		System.out.println("El estado del coche " + motorEncendido + velocidad + color + modelo + marca);
	}
}


