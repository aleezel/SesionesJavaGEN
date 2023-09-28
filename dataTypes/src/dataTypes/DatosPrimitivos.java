package dataTypes;

public class DatosPrimitivos {
	public static void main(String[] args) {
		/*
		 * Datos primitivos. Datos fundamentales en Java que sirven para gestionar los tipos de información más básicos
		 * Existen 8 tipos de datos primitivos: byte, short, int, long, float, dohble, boolean, char
		 */
		//Vmin y Vmax
		byte minByte = Byte.MIN_VALUE;
		byte maxByte = Byte.MAX_VALUE;
				System.out.println("El valor mínimo de Byte es: " + minByte);
		System.out.println("El valor máximo de Byte es: " + maxByte);
		
		
		//short. Vmin y Vmax
		short minShort = Short.MIN_VALUE;
		short maxShort = Short.MAX_VALUE;
		System.out.println("El valor mínimo de Short es: " + minShort);
		System.out.println("El valor máximo de Short es: " + maxShort);
		
		//char. Vmin y VMax
		char minChar = Character.MIN_VALUE;
		char maxChar = Character.MAX_VALUE;
		System.out.println("El valor mínimo de Char es: " + minChar);
		System.out.println("El valor máximo de Char es: " + maxChar);
		
		long isbn = 348329482832L;
		System.out.println(isbn);
		
		float salary = 15000f;
		System.out.println(salary);
		
		double ISR = 1239.45d;
		System.out.println(ISR);
		
		//int
		int minInt = Integer.MIN_VALUE;
		int maxInt = Integer.MAX_VALUE;
		System.out.println("El valor mínimo de Int es: " + minInt);
		System.out.println("El valor máximo de Int es: " + maxInt);
		
		//long
		long minLong = Long.MIN_VALUE;
		long maxLong = Long.MAX_VALUE;
		System.out.println("El valor mínimo de Long es: " + minLong);
		System.out.println("El valor máximo de Long es: " + maxLong);
		
		//float
		float minFloat = Float.MIN_VALUE;
		float maxFloat = Float.MAX_VALUE;
		System.out.println("El valor mínimo de Float es: " + minFloat);
		System.out.println("El valor máximo de Float es: " + maxFloat);
		
		//double
		double minDouble = Double.MIN_VALUE;
		double maxDouble = Double.MAX_VALUE;
		System.out.println("El valor mínimo de Double es: " + minDouble);
		System.out.println("El valor máximo de Double es: " + maxDouble);
		
		char valorChar1 = '3';//si le asigno comillas. lo fuerzo a reescribir el valor con uno que yo quiero
		char valorChar2 = 166;
		System.out.println(valorChar1);
		System.out.println(valorChar2);
		
		char aChiquita;
		
		/*
		 * Casteo (Conversión de tipos en Java)
		 * - Automático (dato más pequeño a un dato más grande)
		 * - Manual (tipo de dato más grande a tipo más pequeño)
		 * */
		
		int myNumber = 125;
		 System.out.println(myNumber);
		 // int < double
		 double myCasting = myNumber;
		 System.out.println(myCasting);
		 
		 short edad = 25;
		 int valorEdad = edad;
		 System.out.println(edad);
		 System.out.println(valorEdad);
		 
		 //-- Manual
		 int myNewCasting = (int) myCasting;
		 System.out.println(myNewCasting);
		 
		 //Convertir de float a int
		 float myFloart = 1.99f;
		 
		 
		
	}
	
}
