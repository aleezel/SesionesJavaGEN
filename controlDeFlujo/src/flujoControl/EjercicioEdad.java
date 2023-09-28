package flujoControl;
import java.util.Scanner;

public class EjercicioEdad extends EstructuraDeControl {
	public static void main (String [] args) {
		
		//Condición para determinar si el paciente es o no mayor de edad

		//como si fuera el constructor de Objeto con system.in, como si le dieramos un parámetro
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Escribe tu edad a continuación");
		//para perdirle un entero a través del escaner al usuario
		int edad = scanner.nextInt();
		
		//se cierra el scanner para que ya no ocupe memoria
		scanner.close();
		
		if(edad >= 19) {
			System.out.println("Felicidades, ya no necesitas que tu mamá te acompañe a hacer el trámite");
		}else {
			System.out.println("Dile a tu mamá que venga.");
		}
		
		//El operador ternario es ?  . Sirve para simplificar a una línea de código ua comparación. Es como si el signo preguntara sobre la condición antes especificada.
		boolean pago = false;
		
		String resultado = (pago) ? "Ya pagó su cita." : "Págame pa' atenderte.";
		System.out.println(resultado);
		
	}
}
