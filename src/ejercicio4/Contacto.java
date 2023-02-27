package ejercicio4;

import java.util.Objects;

public class Contacto {

	private String nombre;
	private String email;
	private int id;
	
	public Contacto(String nombre, String email, int id) {
		super();
		this.nombre = nombre;
		this.email = email;
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", email=" + email + ", id=" + id + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, id, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contacto other = (Contacto) obj;
		return Objects.equals(email, other.email) && id == other.id && Objects.equals(nombre, other.nombre);
	}
	
	public int compareTo(Contacto c) {
		return this.nombre.toLowerCase().compareTo(c.getNombre().toLowerCase());
	}
	
}
