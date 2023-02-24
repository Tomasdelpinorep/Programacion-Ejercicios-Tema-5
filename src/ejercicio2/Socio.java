package ejercicio2;

public class Socio {
	private String nombre, dni;

	public Socio(String nombre, String dni) {
		super();
		this.nombre = nombre;
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Socio [nombre=" + nombre + ", dni=" + dni + "]";
	}
	
	
}
