package ejercicio3;

import java.util.List;

import utilidades.Leer;

public class Secretaria {

	public void imprimirAlumnos(List<Alumno> listaAlumnos) {
		int cont=1;
		
		for(Alumno a : listaAlumnos) {
			System.out.println(cont+". "+a);
			cont++;
		}
		System.out.println();
	}
	
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
			a.setApellido2(apellido2);
			break;
		}
	}
	
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
	}
}
