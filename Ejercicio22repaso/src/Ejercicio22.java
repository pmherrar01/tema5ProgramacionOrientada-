import java.util.Scanner;

public class Ejercicio22 {

	public static void menu(Producto producto1, Producto producto2, Producto producto3) {
		Scanner entrada = new Scanner(System.in);
		Scanner entrada1 = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);
		int num, cantidad;
		String opcion;
		do {
			System.out.println("Bienvenido a mi tienda de Mascotas \n"
					+ " Pulse 1 para compar" + producto1.toString() + "\n"
					+ " Pulse 2 para compar" + producto2.toString() + "\n"
					+ " Pulse 3 para compar" + producto3.toString() + "\n");
			num=entrada.nextInt();

			switch (num) {
			case 1:
				System.out.println("Has selecionado el " + producto1.getNombre());
				System.out.println("¿Cuantas unidades desea?");
				cantidad=entrada2.nextInt();
				Producto.reducirStock(cantidad);
				System.out.println("Desea comprar otro producto");
				break;
			case 2:
				System.out.println("Has selecionado el " + producto2.getNombre());
				System.out.println("¿Cuantas unidades desea?");
				cantidad=entrada2.nextInt();
				System.out.println("Venta realizada con exito");

				System.out.println("Desea comprar otro producto");
				break;
			case 3:
				System.out.println("Has selecionado el " + producto3.getNombre());
				System.out.println("¿Cuantas unidades desea?");
				cantidad=entrada2.nextInt();
				System.out.println("Venta realizada con exito");

				System.out.println("Desea comprar otro producto");
				break;
			default:
				System.out.println("Opción no válida");
			}            
			opcion=entrada1.nextLine();
		}while(opcion.equalsIgnoreCase("Si"));
	}

	public static void main(String[] args) {
		Producto producto1 = new Producto("Mordedor", 5, 60);
		Producto producto2 = new Producto("Pelota", 7, 10);
		Producto producto3 = new Producto("Cuenco", 9, 20);

		menu(producto1, producto2, producto3);

	}

}
