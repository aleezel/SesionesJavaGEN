package loops;

import java.util.Scanner;

public class WhileLoop {

	public static void main (String[] args) {
		
		/*
		 * While. El ciclo While ejecuta continuamente un bloque de código hata que se cumpla la condición
		 * While(expresión){
		 * bloque de código a ejecutar
		 * (contador - iterador) 
		 *} 
		 */
		
		int cuenta = 1;
		while (cuenta <= 11) {
			System.out.println("La cuenta es de: " + cuenta);
			cuenta++;
		}
		
		
		//Crear un programa que solicite al usuario un número. Dicho número será tomado como el número final de una cuenta. Dicha cuenta inicia en 1. Debe mostrar en consola la cuenta del 1 hasta el número proporcionado.
		//1. Importar el Scanner e implementarlo
		//2. UIn mensaje para darle contexto al usuario
		//3. Alamacenar el número del usuario en una variable
		//4. Guardar en variable el número que inicia la cuenta (1)
		//5. Implementar un ciclo While
		//6. Mostrar por consola el resultado
		
		
		//1. Importar el Scanner
		Scanner scanner = new Scanner(System.in);
		
		
		//2. 
		System.out.println("Escribe un número que servirá como un número final de una cuenta");
		
		//3.
		int numFinal = scanner.nextInt();
		scanner.close();
		
		//4.
		int numInicial = 1;
		
		//5.
		while(numInicial <= numFinal) {
			System.out.println("La cuenta va en " + numInicial);
			numInicial++;
			
		}
		
		
		
		
	}
	
}
