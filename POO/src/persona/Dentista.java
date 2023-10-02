package persona;

//todos los dentistas son personas, pero no todas las personas son dentistas
public class Dentista extends Persona {
	// 1 Atributos
	
	/*
	 * Ya no creo los valores como nombre, edad, apellido, etc, porque van a hererdar de la clase Persona. Por eso es POO. 
	 */
	
	
	String especialidad;
	String cedula;
	String consultorioAsignado;
	String experiencia;
	String turno;
	int salario;
	
	
	// 2 constructor
	
	public Dentista(String nombre, String apellido, byte edad, String telefono, String email, String especialidad, String cedula, String consultorioAsignado, String experiencia, String turno, int salario) {
		super(nombre, apellido, edad, telefono, email);//extendido de la clase persona
		
		//informacion de la clase dentista
		this.especialidad = especialidad;
		this.cedula = cedula;
		this.consultorioAsignado = consultorioAsignado;
		this.experiencia = experiencia;
		this.turno = turno;
		this.salario = salario;
	}//cerrar constructor Dentista con información heredada
	
	// 2 mÉTODOS
	
	//3 Metodos (Metodo para calcular salario basado en la experiencia
		//Experiencia  = basico, intermedio, avanzado 
		
		//Si el dentista esta en rango basico, gana 30,000. Si es intermedio, gana 40000, si es avanzado gana 50000
	
	void calcularSalario() {
		//Lógica de programación
		if(experiencia.equals("basico")) {
			salario = 30000;
		}
		else if (experiencia.equals("intermedio")) {
			salario = 4000;
		}
		else if (experiencia.equals("Avanzado")) {
			salario = 5000;
			
		}
		
	}
	
	void imprimirInfoDentista() {
		System.out.println("La especialidad: " + especialidad);
		System.out.println("El salario: " + salario);
	}

}
