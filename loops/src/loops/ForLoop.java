package loops;

public class ForLoop {
	public static void main(String[] args) {
		//El ciclo for proporciona una forma compacta de itrar sobre valores.
		//for ( inicialización; condición; contador (incremento/decremento)){ bloque de código}
		
		
		//for con varible local
		for (int numero = 1; numero <= 10; numero++) {
			System.out.println("Número igual a " + numero);
		}
		
		//for con variable local
		int contador;
		for (contador = 1; contador <= 5; contador++) {
			System.out.println("La cuenta es " + contador);
		}
		
		/*
		 * Bucle anidado. 
		 */
		
		//Imprimir una forma triangulas de asteriscos. El for aninado se itera de adentro hacia afuera, del hijo al padre.
		int filas = 5;
		
		for (int i = 0; i < filas; i++) {
			//Bloque de código que va a iterar sobre el primer bucle
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		//Imprimir potencias
		System.out.println("El valor de PI es " + Math.PI);
		
		int potencias = 5;
		for (int base = 1; base <= potencias; base++) {
			double resultado = Math.pow(Math.PI, base);
			System.out.println("PI elevado a la " + base + "es igual a " + resultado);
		}
		
		
	}

}
