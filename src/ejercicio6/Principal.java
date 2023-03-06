package ejercicio6;

import java.util.HashMap;
import java.util.Map;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		int opcion;
		Trabajador t1 = new Trabajador("Joaquin", "11111111A", 160, 8);
		Trabajador t2 = new Trabajador("John", "11111111B", 120, 12.5f);
		Trabajador t3 = new Trabajador("Ronaldo", "11111111C", 200, 7.8f);
		Trabajador t4 = new Trabajador("Gabi", "11111111D", 140, 10.5f);

		Map<Integer, Trabajador> lista = new HashMap<Integer, Trabajador>();
		lista.put(t1.getHoras(), t1);
		lista.put(t2.getHoras(), t2);
		lista.put(t3.getHoras(), t3);
		lista.put(t4.getHoras(), t4);
		
		imprimirMenu();
		opcion = Leer.datoInt();
		switch(opcion) {
		case 1:
			t1.imprimirTree(t1.ordenarHorasAscendente(lista));
			break;
			
		case 2:
			t1.imprimirTree(t1.ordenarHorasDescendente(lista));
			break;
			
		case 3:
			t1.calcularSueldoFinal(lista);
			for(Trabajador t : t1.ordenarSueldo(lista)) {
				System.out.println(t);
			}
			break;
		}
	}

	public static void imprimirMenu() {
		System.out.println("1. Ordenar por horas trabajadas ascendente.");
		System.out.println("2. Ordenar por horas trabajadas descendente.");
		System.out.println("3. Ordenar por sueldo ascendente.");
	}
}
