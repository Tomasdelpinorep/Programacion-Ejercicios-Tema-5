package ejercicio5;

public class Persona implements Comparable <Persona>{

	private String nombre,apellido;
	private int edad;
	public Persona(String nombre, String apellido, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]";
	}

	@Override
	public int compareTo(Persona p) {
		return this.nombre.toLowerCase().compareTo(p.getNombre().toLowerCase()); 
	}
	
	//DUDA: ¿Cómo es que se llama compareTo a sí mismo? - Linea 51
}
