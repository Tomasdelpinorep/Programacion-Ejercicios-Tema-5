package ejercicio2;

import java.util.List;

import utilidades.Leer;

public class CrudSocio {

	public void agregarSocio(List<Socio> listaSocios, int pos) {
		listaSocios.add(listaSocios.get(pos));
	}

	public Socio modificarSocio(List<Socio> listaSocios, int pos, int mod) {
		String nuevoNombre, nuevoDNI;

		switch (mod) {
		case 1:
			System.out.println("Escriba el nuevo nombre del socio:");
			nuevoNombre = Leer.dato();
			listaSocios.get(pos).setNombre(nuevoNombre);
			break;
		case 2:
			System.out.println("Escriba el nuevo DNI del socio:");
			nuevoDNI = Leer.dato();
			listaSocios.get(pos).setNombre(nuevoDNI);
			break;
		case 3:
			System.out.println("Escriba el nuevo nombre del socio:");
			nuevoNombre = Leer.dato();
			listaSocios.get(pos).setNombre(nuevoNombre);
			System.out.println("Escriba el nuevo DNI del socio:");
			nuevoDNI = Leer.dato();
			listaSocios.get(pos).setNombre(nuevoDNI);
			break;

		default:
			System.out.println("El atributo que ha elegido es inexistente.");
			break;
		}
		return listaSocios.get(pos);
	}
	
	public void eliminarSocio(List<Socio> listaSocios, int pos) {
		if(pos > listaSocios.size() || pos < 0) {
			System.out.println("El socio que ha indicado no existe en el programa.");
		}else {
			listaSocios.remove(pos);
			System.out.println("El socio se ha borrado con éxito.");
		}
	}
}
