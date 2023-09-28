package dataTypes;

public class DatosEstructurados {
	public static void main (String[] args) {
		/*
		 * Datos estructurados. Son datos complejos que almacenan caracteres y/o cadenas de caracteres o bien, algún tipo de dato primitivo
		 * -- String. Cadena de Caracteres, se declaran entre comillas y hay que definir el tipo de dato con la palabra reservada String
		 * -- Arrays.
		 * -- Creados por el usuario (API Java)
		 */
		String myString = "Holi, soy un string<3";
		System.out.println(myString);
		
		/*
		 * mÉTODO PARA STRINGS
		 * -- String length. Método que permite medir la longitrud de una cadena de caracteres.
		 *  
		 */
		String texto = "ajfdajkdfasjkd";
		System.out.println("La longitud de la variable texto de tipo String es" + texto.length());
		
		/*
		 * Guardando la variable texto en una nueva variable de tipo int para pasarle el método length
		 * int metodoLength = texto.length();
		 *--Output: 10
		 *Imprimimos en consola la nueva variable
		 *System.out.println(metodoLength);
		 */
		
		// -- String: toUpperCase () y toLowerCase()
		String upperCase = texto.toUpperCase();
		System.out.println("Aplicando el método toUpperCase: " + upperCase);
		
		String lowerCase = texto.toLowerCase();
		System.out.println("Aplicando el método toLowerCase: " + lowerCase);
		
		
		//-- IndexOf(). Devuelve el índice de la primera aparición de un texto específico
		String fraseMotivacional = "Todo es temporal, Echale ganitas.";
		int indexOf = fraseMotivacional.indexOf("temporal");
		System.out.println("La palabra 'temporal' inicia en el índice: " + indexOf);
		
		// Concatenación
		String firstName = "Alejandra";
		String lastName = "Piedra";
		
		String userName = firstName + " " + lastName;
		System.out.println(userName);
		
		System.out.println(firstName.concat(lastName));
		
		// Método de conversión (parseo)
		String presupuesto = "5000";
		System.out.println("El presupuesto es de $ " + presupuesto + " y el tipo de dato es " + presupuesto.getClass().getSimpleName());
		
		int parseao = Integer.parseInt(presupuesto);
		System.out.println("Aplicando parseInt, el valor de " + presupuesto + " de tipo " + presupuesto.getClass().getSimpleName() + " ahora es " + parseao + " que ahora es de tipo " + ((Object)parseao).getClass().getSimpleName());
		
		
		
		// parsear a tipo double en l hora de la comida
		double parseao2 = Double.parseDouble(presupuesto);
		System.out.println("Aplicando parseInt el valor de " + presupuesto + " de tipo " + 		presupuesto.getClass().getSimpleName() + " ahora es " + parseao2 + " ahora es de tipo " + 		((Object)parseao2).getClass().getSimpleName());
		
		/*
		 * Arrays. Conocidos como arreglos, se trata de una colección de datos del mismo tipo dodnde cada elemento correcto a una posición identificada por los índices numéricos. Cuando trabajamos con arreglos de dos dimensiones (bidimensional), usamos el término matriz. 
		 */
		String[] cars = {"Volkswagen", "Mazda", "Kia", "Ford"};
		System.out.println(cars);
		
		/*
		 * Variable por tipo de declaración
		 * -- Variables dinámicas. Son aquellas que se declaran con un valor pero que dicho valor puede cambiar durante el proceso.
		 * -- Variables constantes o finales. Su valor no puede modificarse.
		 * -- Variables literales (palabras reservadas). Su identificador es la representación de su valor y ya tiene un significado en el código fuente de Java 
		 * 
		 */
		
		//Varibles dinámicas
		float gastosMensuales = 35684.30f;
		System.out.println(gastosMensuales);
		
		gastosMensuales = 42599.2f;
		System.out.println("Ahora mis gastos mensuales ascienden a " + gastosMensuales);
		
		//Variables finales o constantes
		final int SALARIO = 15000;
		System.out.println(SALARIO);
		
		int a = 15;
		
		
		
		
	}
}
