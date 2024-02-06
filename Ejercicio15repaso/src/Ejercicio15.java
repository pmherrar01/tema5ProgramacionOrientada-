
public class Ejercicio15 {

	public static void main(String[] args) {
		Direccion  direccion1 = new Direccion("Doñana", 50, 3,"Badajoz");
		Direccion  direccion2 = new Direccion("Camineros", 3, 2, "Caceres");
		Direccion  direccion3 = new Direccion("Palomares", 4, 9, "madrid");
		
		Empleado empleado1 = new Empleado("pablo", 100, direccion1);
		Empleado empleado2 = new Empleado("pedro", 1000, direccion2);
		Empleado empleado3 = new Empleado("saul", 10001, direccion3);
		
		System.out.println(empleado1.toString());
		System.out.println(empleado2.toString());
		System.out.println(empleado3.toString());
	}

}
