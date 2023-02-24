package ejercicio4;

import java.util.Iterator;
import java.util.Map;

public class Agenda {

	private Map<Contacto, Integer> lista;

	public Agenda(Map<Contacto, Integer> lista) {
		super();
		this.lista = lista;
	}

	public Map<Contacto, Integer> getLista() {
		return lista;
	}

	public void setLista(Map<Contacto, Integer> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Agenda [lista=" + lista + "]";
	}

	public void agregar(Contacto c, Integer numTel) {
		lista.put(c, numTel);
	}

	public void agregarV2(Contacto c, int numTel) { // deprecated
		lista.put(c, new Integer(numTel));
	}

	public void mostrarTodos() {
		for (Contacto c : lista.keySet()) {
			System.out.println(c);
		}
	}

	public Contacto findById(int id) {
		Contacto c;
		Iterator<Contacto> it = lista.keySet().iterator();

		while (it.hasNext()) {
			c=it.next();
			if (c.getId() == id) 
				return c;
		}
		return null;
	}
	
	public void eliminarContacto(int id) {
		lista.remove(findById(id));
	}
}
