package ejercicio6;

import java.util.Comparator;

public class ordenarPorSueldo implements Comparator<Trabajador> {

	@Override
	public int compare(Trabajador t1, Trabajador t2) {
		if (t1.getSueldoFinal() > t2.getSueldoFinal()) {
			return 1;
		} else if (t1.getSueldoFinal() < t2.getSueldoFinal()) {
			return -1;
		}
		return 0;

	}
}