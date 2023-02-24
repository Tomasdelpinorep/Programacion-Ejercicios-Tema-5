package ejercicio5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		int opcion;
		
		List<Persona> lista = new ArrayList<Persona>();
		lista.add(new Persona("Tomás","Bespino",19));
		lista.add(new Persona("Bejandro","Peña",23));
		lista.add(new Persona("Carlos","Rulo",18));
		lista.add(new Persona("Marcos","Alonso",29));
		lista.add(new Persona("Ginés","Aranda",31));
		lista.add(new Persona("Durmiendo","Pallares",25));
		
		do {
			System.out.println("¿Cómo desea ordenar la lista de personas?");
			imprimirMenu();
			opcion=Leer.datoInt();
			
			switch(opcion) {
			case 0:
				System.out.println("Gracias por utilizar el programa.");
				break;
				
			case 1:
				System.out.println("Lista de personas ordenadas alfabéticamente por nombre: \n");
				Collections.sort(lista);
				for(Persona p : lista) {
					System.out.println(p);
				}
				System.out.println();
				break;
				
			case 2:
				Collections.sort(lista, new CompararPorEdad());
				for(Persona p : lista) {
					System.out.println(p);
				}
				System.out.println();
				break;
			}
		}while(opcion !=0);
	}
	
	public static void imprimirMenu() {
		System.out.println("1. Ordenar alfabéticamente por nombre");
		System.out.println("2. Ordenar de menor a mayor por edad");
	}

}
