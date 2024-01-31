
public class Curso {

	private String nombre;
	private int numeroHoras;
	
	private static int numeroDeCursos=0;
	
	public String getNombre() {
		return nombre;
	}
	
	public int getnumeroHoras() {
		return numeroHoras;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setNumeroHoras(int numeroHoras) {
		this.numeroHoras = numeroHoras;
	}

	private static void sumarCursos() {
		numeroDeCursos++;
	}
	
	public static void verNumeroCursos() {
		System.out.println("Hay " + numeroDeCursos + " cursos.");
	}

	public Curso(String nombre, int numeroHoras) {
		this.nombre = nombre;
		this.numeroHoras = numeroHoras;
		sumarCursos();
	}
	
	public Curso() {
		this.nombre = "";
		this.numeroHoras = 0;
		sumarCursos();
	}
	
	
}
