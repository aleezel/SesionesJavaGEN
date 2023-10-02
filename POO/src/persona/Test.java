package persona;

public class Test {
	public static void main (String[] args) {
		//Método principal para instanciar mis clases
		
		//Instancia de persona
		Persona Felipe = new Persona ("Felipe", "Maqueda", (byte)31, "5534653215", "felipe@mail.com");
		
		//Nunca se manda a imprimir así un método. Im´rime lugar
		System.out.println(Felipe);
		
		
		//Esta es la mejor práctica. Imprime información
		Felipe.imprimirInfo();
		Felipe.saludar();
		
		
		//instancia de Dentista
		Dentista Simi = new Dentista("Dr. Simi", "Lares", (byte)50, "1234567898", "simi@lares.com", "Odontología", "65452313256", "500", "Avanzado", "Matutino", 500);
		
		System.out.println("**************");
		Simi.calcularSalario();
		Simi.imprimirInfoDentista();
		
		//
	}
}
