package ejercicio1;

<<<<<<< HEAD
=======
import java.util.ArrayList;
>>>>>>> c3fe93d2e0d50a0fe6f5a41c1ea14541cd8f096a
import java.util.List;

public class Nota {

	private String titulo,contenido,autor;
	
	public Nota(String titulo, String contenido, String autor) {
		super();
		this.titulo = titulo;
		this.contenido = contenido;
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Nota [titulo=" + titulo + ", contenido=" + contenido + ", autor=" + autor + "]";
	}
	
	public void imprimirNotas(List<Nota> listaNotas) {
		if(listaNotas.isEmpty()) {
			System.out.println("El programa no contiene ninguna nota.");
		}else {
			for(int i=0;i<listaNotas.size();i++) {
				System.out.println((i+1)+". "+listaNotas.get(i));
			}
		}
		
		System.out.println();
	}
}
