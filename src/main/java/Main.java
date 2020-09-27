import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String dato;
		Alumno1 estudiante1 = new Alumno1();
		Scanner scanner = new Scanner(System.in);

		estudiante1.SetNombre("Maria");
		estudiante1.SetApellido("Perez");
		estudiante1.SetCorreo("mariaperez@hotmail.es");

		do {
			System.out.println("Introduzca su nombre");
			dato = scanner.next();

			if (dato.equals(estudiante1.getNombre())) {
				System.out.println("Su nombre es " + estudiante1.getNombre() + " " +estudiante1.getApellido()
						+ " con correo " + estudiante1.getCorreo());
			} else {
				System.out.println("No le tenemos identificado, intentelo de nuevo:");
			}
		} while (!dato.equals(estudiante1.getNombre()));

	}

}
