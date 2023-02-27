package ejercicio2;

import java.util.List;

<<<<<<< HEAD
=======
import utilidades.Leer;

>>>>>>> c3fe93d2e0d50a0fe6f5a41c1ea14541cd8f096a
public class GestionClub {

	public Socio findByDNI(List<Socio> listaSocios, String dni) {
		boolean encontrado = false;
		int i = 0;

		while (i < listaSocios.size() && !encontrado) {
			if (listaSocios.get(i).getDni().equalsIgnoreCase(dni)) {
				encontrado = true;
			} else {
				i++;
			}
		}
		
		if (encontrado) {
			return listaSocios.get(i);
		} else {
			return null;
		}

	}
	
<<<<<<< HEAD
=======
	public Socio modificarSocio(List<Socio> listaSocios,int pos, int mod) {
		String nuevoNombre, nuevoDNI;
		
		switch(mod) {
		case 1:
			System.out.println("Escriba el nuevo nombre del socio:");
			nuevoNombre=Leer.dato();
			listaSocios.get(pos).setNombre(nuevoNombre);
			break;
		case 2:
			System.out.println("Escriba el nuevo DNI del socio:");
			nuevoDNI=Leer.dato();
			listaSocios.get(pos).setNombre(nuevoDNI);
			break;
		case 3:
			System.out.println("Escriba el nuevo nombre del socio:");
			nuevoNombre=Leer.dato();
			listaSocios.get(pos).setNombre(nuevoNombre);
			System.out.println("Escriba el nuevo DNI del socio:");
			nuevoDNI=Leer.dato();
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
	
>>>>>>> c3fe93d2e0d50a0fe6f5a41c1ea14541cd8f096a
	public void imprimirSocios(List<Socio> listaSocios) {
		int cont=1;
		
		for(Socio s : listaSocios) { //muy pro 
			System.out.println((cont)+". "+s);
			cont++;
		}
		System.out.println();
	}
}
