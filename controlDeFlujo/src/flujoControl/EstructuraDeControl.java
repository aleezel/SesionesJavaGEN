package flujoControl;
import java.util.Scanner;

public class EstructuraDeControl {
//Debe coincidir la clase con el nombre de nuestro documento
	
	public static void main (String[] args) {
	//Todo dentro del método main
		
		//Scanner para pedirle un prompt al usuario
		Scanner scanner = new Scanner(System.in);
		
		//Recordar que para que algo se ejecute, debe estar dentro del método principal
		
		//Primero genero una variable del tipo String donde almaceno un fato
		String citaProgramada = null;
		//Dejamos en Null y después lo cambiamos a una fecha "28-09-23"
		
		//La variable declarada se incia en null a propósito para tener un especio de memoria ya asignado y solo reemplazarlo con un nuevo dato.
		
		if (citaProgramada != null) {
			System.out.println("Ya hay una cita programada, una disculpita."); //Porque la variable ya está ocupada o llena
		}else {
			System.out.println("Puede registrar su cita.");
		}
		
		//Creamos un menú
				System.out.println("Menú del diente feliz");
				System.out.println("1. ¿Desea programar una cita?");
				System.out.println("2. Verificar cita programada");
				System.out.println("3. Cencelar cita");
				System.out.println("4. Salir del menú");
				
		
		//para perdirle un entero a través del escaner al usuario
		System.out.println("Escribe un número del menú.");
		
		//Seleccionamos una opción y almacenamos la variable opción
		int opcion = scanner.nextInt();
		//se cierra el scanner para que ya no ocupe memoria
		scanner.close();
		

		switch (opcion) {
		case 1:
			System.out.println("Usted ha seleccionado la opción de programar cita.");
			//Agregar la lógica para programar cita
			break;
		
		case 2:
			System.out.println("Usted ha seleccionado la opción de verificar cita.");
			//Agregar la lógica para programar cita
			break;
			
		case 3:
			System.out.println("Usted ha seleccionado la opción de cancelar cita.");
			//Agregar la lógica para programar cita
			break;
			
		case 4:
			System.out.println("Usted ha seleccionado la opción de salir del menú.");
			//Agregar la lógica para programar cita
			break;
			default: 
				System.out.println("La opción que usted seleccionó no es válida. Por favor, seleccione una opción de nuestro menú.");
				break;
			
		}//switch cierre
	}
	
	//verificar la edad del paciente y checar el operador ? el ternario, faltante y un ejemplo
	
}
