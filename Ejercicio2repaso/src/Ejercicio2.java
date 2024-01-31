
public class Ejercicio2 {

	public static void main(String[] args) {
		Curso  curso1 = new Curso();
		Curso  curso2 = new Curso();
		
		curso1.setNombre("Programacion");
		curso1.setNumeroHoras(5);
		
		curso2.setNombre("base de datos");
		curso2.setNumeroHoras(5);
		
		System.out.println("Curso 1: " + curso1.getNombre() + ", " + curso1.getnumeroHoras() + "\ncurso 2: " + curso2.getNombre() + ", " + curso2.getnumeroHoras());
	}

}
