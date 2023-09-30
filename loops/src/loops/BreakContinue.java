package loops;

public class BreakContinue {

	public static void main (String[] args) {
		/*
		 * Sentencias utilizadas en loops:
		 * --break. Se utiliza para salir de un bucle en un punto específico
		 * --continue. Interrumple la iteración de un bucle, si se produce una condición específica y continúa con la siguiente
		 * 
		 * 
		 * */
		
		
		// Super oxxito va a realizar una rifa en la cual el cliente número 5 se ganará una CocaCola de por vida por cada visita una vez al día.
		
		
		
		//Con continue, ejecutando la sentencia condicional pero cumpliendo la condición del bucle
				for (int cliente = 1; cliente <= 20; cliente++) {
					if(cliente == 5) {
						System.out.println("Cliente número " + cliente + " ¡GANASTE!");
						continue;
					} System.out.println("Eres el cliente número " + cliente);
				}
		
		
	}
}
