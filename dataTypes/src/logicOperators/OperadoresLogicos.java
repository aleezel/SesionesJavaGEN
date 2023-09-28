package logicOperators;

public class OperadoresLogicos {
	public static void main (String[] args) {
		/*
		 * Operadores aritméticos (+ - *  /  %)
		 * Operadores lógicos.
		 * Operadores relacionales = += -= *= /= < > <= >= 
		 * 
		 */
		double num1 = 12d;
		double num2 = 7d;
		
		double resultado = num1 / num2;
		System.out.println(resultado);
		
		
		
		int numeroUno = 5;
		int numeroDos = 7;
		
		boolean comparacionUno = numeroUno == numeroDos;
		System.out.println(comparacionUno);
		
		boolean comparacionDos = (numeroUno < numeroDos) && (numeroUno > numeroDos);
		System.out.println(comparacionDos); //false
		
		boolean comparacionTres = (numeroUno < numeroDos) || (numeroUno > numeroDos);
		System.out.println(comparacionTres); //true
		
		boolean comparacionCuatro = false;
		System.out.println(!comparacionCuatro);//true
	}
}
