package ejercicio1;

import java.util.ArrayList;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		int opcion,pos;
		String titulo,contenido,autor;
		
		Nota n = new Nota("Nota","Genérica","Tomas del Pino");
		Nota n1;
		List<Nota> listaNotas = new ArrayList<Nota>();

		System.out.println("Bienvenido al programa. Elija una opción:");
		
		do {
			imprimirMenu();
			opcion = Leer.datoInt();
			
			switch(opcion) {
			
			case 0:
				System.out.println("Gracias por utilizar el programa.");
				break;
				
			case 1:
				n.imprimirNotas(listaNotas);
				break;
				
			case 2:
				System.out.println("En total hay " + listaNotas.size() + " notas guardadas");
				break;
				
			case 3:
				System.out.println("Título:");
				titulo=Leer.dato();
				System.out.println("Contenido:");
				contenido=Leer.dato();
				System.out.println("Autor:");
				autor=Leer.dato();
				
				n1=new Nota(titulo,contenido,autor);
				
				listaNotas.add(n1);
				break;
				
			case 4:
				n.imprimirNotas(listaNotas);
				if(!listaNotas.isEmpty()) {
					pos=Leer.datoInt()-1;
					listaNotas.remove(pos);
				}
				
				break;
				
				default:
					System.out.println("Elija una opción correcta.");
			}
		}while(opcion!=0);
	}
	
	public static void imprimirMenu() {
		System.out.println("1. Mostrar una nota");
		System.out.println("2. Mostrar número de notas guardadas");
		System.out.println("3. Crear una nueva nota");
		System.out.println("4. Borrar alguna nota"); //debes comprobar antes que la lista no esté vacía
													//y borrarlas por orden 
		System.out.println("0. Salir del programa");
	}
}
