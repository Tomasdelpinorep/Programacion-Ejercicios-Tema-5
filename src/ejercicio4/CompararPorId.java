package ejercicio4;

import java.util.Comparator;

public class CompararPorId implements Comparator<Contacto>{

	@Override
	public int compare(Contacto c1, Contacto c2) {
		if(c1.getId() < c1.getId()) {
			return -1;
		}else if (c1.getId() == c2.getId()) {
			return 0;
		}else {
			return 1;
		}
	}

}
