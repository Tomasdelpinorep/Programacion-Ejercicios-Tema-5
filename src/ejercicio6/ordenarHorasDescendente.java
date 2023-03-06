package ejercicio6;

import java.util.Comparator;

public class ordenarHorasDescendente implements Comparator<Integer>{

	
	@Override
	public int compare(Integer h1, Integer h2) {
		if(h1 > h2) {
			return -1;
		}else if(h1 < h2) {
			return 1;
		}
		return 0;
	}

}
