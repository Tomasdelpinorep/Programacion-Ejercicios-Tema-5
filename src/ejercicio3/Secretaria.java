package ejercicio3;

<<<<<<< HEAD
=======
<<<<<<< HEAD
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

import utilidades.Leer;

public class Secretaria implements Set {

	public void imprimirAlumnos(Set<Alumno> setAlumnos) {
		int cont = 1;

		for (Alumno a : setAlumnos) {
			System.out.println(cont + ". " + a);
=======
>>>>>>> 3457a02bc4389328046ef41b757f0cd3d413bb9e
import java.util.List;

import utilidades.Leer;

public class Secretaria {

	public void imprimirAlumnos(List<Alumno> listaAlumnos) {
		int cont=1;
		
		for(Alumno a : listaAlumnos) {
			System.out.println(cont+". "+a);
<<<<<<< HEAD
=======
>>>>>>> c3fe93d2e0d50a0fe6f5a41c1ea14541cd8f096a
>>>>>>> 3457a02bc4389328046ef41b757f0cd3d413bb9e
			cont++;
		}
		System.out.println();
	}
<<<<<<< HEAD
=======
<<<<<<< HEAD

//	public void imprimirAlumnosV2(Set<Alumno> setAlumnos) {
//		Iterator<Alumno> it = setAlumnos.iterator();
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}
//
//	}

//	public Alumno findByApellido(Set<Alumno> setAlumnos, String apellido) {
//		int i = 0;
//		boolean encontrado = false;
//
//		while (i < setAlumnos.size() && !encontrado) {
//			if (setAlumnos.get(i).getApellido1().equalsIgnoreCase(apellido)) {
//				encontrado = true;
//			} else {
//				i++;
//			}
//		}
//
//		if (encontrado) {
//			return setAlumnos.get(i);
//		} else {
//			return null;
//		}
//	}

	public void modificarAlumno(Alumno a, int mod) {
		String nombre, apellido1, apellido2;

		switch (mod) {
		case 1:
			System.out.println("Indique el nuevo nombre:");
			nombre = Leer.dato();
			a.setNombre(nombre);
			break;

		case 2:
			System.out.println("Indique el nuevo apellido:");
			apellido1 = Leer.dato();
			a.setApellido1(apellido1);
			break;

		case 3:
			System.out.println("Indique el nuevo apellido:");
			apellido2 = Leer.dato();
=======
>>>>>>> 3457a02bc4389328046ef41b757f0cd3d413bb9e
	
	public Alumno findByApellido(List<Alumno> listaAlumnos,String apellido) {
		int i=0;
		boolean encontrado = false;
		
		while(i<listaAlumnos.size() && !encontrado) {
			if(listaAlumnos.get(i).getApellido1().equalsIgnoreCase(apellido)) {
				encontrado = true;
			}else {
				i++;
			}
		}
		
		if(encontrado) {
			return listaAlumnos.get(i);
		}else {
			return null;
		}
	}
	
	public void modificarAlumno( Alumno a, int mod) {
		String nombre,apellido1,apellido2;
		
		switch(mod) {
		case 1:
			System.out.println("Indique el nuevo nombre:");
			nombre=Leer.dato();
			a.setNombre(nombre);
			break;
			
		case 2:
			System.out.println("Indique el nuevo apellido:");
			apellido1=Leer.dato();
			a.setApellido1(apellido1);
			break;
			
		case 3:
			System.out.println("Indique el nuevo apellido:");
			apellido2=Leer.dato();
<<<<<<< HEAD
=======
>>>>>>> c3fe93d2e0d50a0fe6f5a41c1ea14541cd8f096a
>>>>>>> 3457a02bc4389328046ef41b757f0cd3d413bb9e
			a.setApellido2(apellido2);
			break;
		}
	}
<<<<<<< HEAD
=======
<<<<<<< HEAD

	public float calcularNotaMedia(float[] notas) {
		float suma = 0;
		int cont = 0;

		for (int i = 0; i < notas.length; i++) {
			suma += notas[i];
			cont++;
		}

		return suma / cont;
	}

	public int contarNotasSuspensas(float[] notas) {
		int cont = 0, notaSuspensa = 5;

		for (int i = 0; i < notas.length; i++) {
			if (notas[i] < notaSuspensa)
				cont++;
		}

		return cont;
	}

	public float calcularMediaNotasSuspensas(float[] notas) {
		float[] notasSuspensas = new float[notas.length];
		float suma = 0;
		int notaSuspensa = 5;
		int cont = 0;

		for (int i = 0; i < notas.length; i++) {
			if (notas[i] < notaSuspensa) {
				notasSuspensas[cont] = notas[i];
				cont++;
			}
		}

		for (int i = 0; i < notasSuspensas.length; i++) {
			suma += notasSuspensas[i];
		}

		return suma / cont;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray(Object[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(Object e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

=======
>>>>>>> 3457a02bc4389328046ef41b757f0cd3d413bb9e
	
	public float calcularNotaMedia(float [] notas) {
		float suma=0;
		int cont=0;
		
		for(int i =0;i<notas.length;i++) {
			suma+=notas[i];
			cont++;
		}
		
		return suma/cont;
	}
	
	public int contarNotasSuspensas(float [] notas) {
		int cont=0, notaSuspensa=5;
		
		for(int i =0;i<notas.length;i++) {
			if(notas[i] < notaSuspensa)
				cont++;
		}
		
		return cont;
	}
	
	public float calcularMediaNotasSuspensas(float [] notas) {
		float [] notasSuspensas = new float [notas.length];
		float suma=0;
		int notaSuspensa=5;
		int cont=0;
		
		for(int i =0;i<notas.length;i++) {
			if(notas[i] < notaSuspensa) {
				notasSuspensas[cont]=notas[i];
				cont++;
			}
		}
		
		for(int i=0;i<notasSuspensas.length;i++) {
			suma+=notasSuspensas[i];
		}
		
		return suma/cont;
<<<<<<< HEAD
=======
>>>>>>> c3fe93d2e0d50a0fe6f5a41c1ea14541cd8f096a
>>>>>>> 3457a02bc4389328046ef41b757f0cd3d413bb9e
	}
}
