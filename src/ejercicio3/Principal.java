package ejercicio3;

import java.util.ArrayList;
<<<<<<< HEAD
import java.util.List;
=======
<<<<<<< HEAD
import java.util.HashSet;
import java.util.List;
import java.util.Set;
=======
import java.util.List;
>>>>>>> c3fe93d2e0d50a0fe6f5a41c1ea14541cd8f096a
>>>>>>> 3457a02bc4389328046ef41b757f0cd3d413bb9e

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		/*Realizar un programa que guarde Alumnos de una clase. Se deben poder mostrar, modificar y borrar los que se quiera de forma individual, 
		 * es decir, el usuario debe decir quién quiere mostrar, modificar o borrar. Se puede crear otra clase con funcionalidades 
		 * como sacar nota media del curso, dar el número de suspensos en total, media de suspensos, etc. Usa la interfaz Set implementada por HashSet.*/
		
		int opcion,mod,tam;
		String apellido;
		float [] notas;
<<<<<<< HEAD
=======
<<<<<<< HEAD

		Alumno a1 = new Alumno("Tomas","del Pino","Coffey");
		Alumno a2 = new Alumno("Alfonso","Rodríguez","Pezuelo");
=======
>>>>>>> 3457a02bc4389328046ef41b757f0cd3d413bb9e
		
		Alumno a;
		Alumno a1 = new Alumno("Tomas","del Pino","Coffey");
		Alumno a2 = new Alumno("Alonso","Rodríguez","Pezuelo");
<<<<<<< HEAD
=======
>>>>>>> c3fe93d2e0d50a0fe6f5a41c1ea14541cd8f096a
>>>>>>> 3457a02bc4389328046ef41b757f0cd3d413bb9e
		Alumno a3 = new Alumno("Martín","Hidalgo","Pérez");
		Alumno a4 = new Alumno("Ángel","Naranjo","Díaz");
		Alumno a5 = new Alumno("Cristiano","Ronaldo","Pereira");
		Secretaria s = new Secretaria();
		
<<<<<<< HEAD
=======
<<<<<<< HEAD
		Set<Alumno> setAlumnos = new HashSet<Alumno>();
		setAlumnos.add(a1);
		setAlumnos.add(a2);
		setAlumnos.add(a3);
		setAlumnos.add(a4);
		setAlumnos.add(a5);
=======
>>>>>>> 3457a02bc4389328046ef41b757f0cd3d413bb9e
		List<Alumno> listaAlumnos = new ArrayList<Alumno>();
		listaAlumnos.add(a1);
		listaAlumnos.add(a2);
		listaAlumnos.add(a3);
		listaAlumnos.add(a4);
		listaAlumnos.add(a5);
<<<<<<< HEAD
=======
>>>>>>> c3fe93d2e0d50a0fe6f5a41c1ea14541cd8f096a
>>>>>>> 3457a02bc4389328046ef41b757f0cd3d413bb9e
		
		do {
			imprimirMenu();
			opcion=Leer.datoInt();
			
			switch(opcion) {
			case 0:
				System.out.println("Gracias por utilizar el programa.");
				break;
			
			case 1:
<<<<<<< HEAD
=======
<<<<<<< HEAD
				s.imprimirAlumnos(setAlumnos);
				break;
				
//			case 2:
//				s.imprimirAlumnos(setAlumnos);
//				System.out.println("Elija el apellido1 del alumno que desea modificar:");
//				apellido=Leer.dato();
//				if(s.findByApellido(setAlumnos, apellido) == null) {
//					System.out.println("No se ha encontrado un alumno con ese apellido.");
//					System.out.println();
//				}else {
//					System.out.println("¿Qué atributo quiere cambiar?");
//					System.out.println("1. Nombre | 2. Primer Apellido | 3. Tercer apellido");
//					mod=Leer.datoInt();
//					s.modificarAlumno(s.findByApellido(setAlumnos, apellido),mod);
//					System.out.println();
//				}
//				break;
				
//			case 3:
//				s.imprimirAlumnos(setAlumnos);
//				System.out.println("Elija el apellido1 del alumno que desea modificar:");
//				apellido=Leer.dato();
//				if(s.findByApellido(setAlumnos, apellido) == null) {
//					System.out.println("No se ha encontrado un alumno con ese apellido.");
//					System.out.println();
//				}else {
//					setAlumnos.remove(s.findByApellido(setAlumnos, apellido));
//					System.out.println();
//				}
//				break;
				
//			case 4:
//				s.imprimirAlumnos(setAlumnos);
//				System.out.println("Elija el apellido1 del alumno que desea modificar:");
//				apellido=Leer.dato();
//				if(s.findByApellido(setAlumnos, apellido) == null) {
//					System.out.println("No se ha encontrado un alumno con ese apellido.");
//					System.out.println();
//				}else {
//					System.out.println("¿Cuántas notas quiere introducir para el alumno?");
//					tam=Leer.datoInt();
//					
//					notas=new float[tam];
//					
//					System.out.println("Introduzca las notas para el alumno:");
//					for(int i =0;i<notas.length;i++) {
//						System.out.println((i+1)+": ");
//						notas[i]=Leer.datoFloat();
//					}
//					
//					System.out.printf("La media de las notas del alumno es de %.2f \n",s.calcularNotaMedia(notas));
//					System.out.println();
//				}
//				break;
				
//			case 5: 
//				s.imprimirAlumnos(setAlumnos);
//				System.out.println("Elija el apellido1 del alumno que desea modificar:");
//				apellido=Leer.dato();
//				if(s.findByApellido(setAlumnos, apellido) == null) {
//					System.out.println("No se ha encontrado un alumno con ese apellido.");
//					System.out.println();
//				}else {
//					System.out.println("¿Cuántas notas quiere introducir para el alumno?");
//					tam=Leer.datoInt();
//					
//					notas=new float[tam];
//					
//					System.out.println("Introduzca las notas para el alumno:");
//					for(int i =0;i<notas.length;i++) {
//						System.out.println((i+1)+": ");
//						notas[i]=Leer.datoFloat();
//					}
//					
//					System.out.println("El alumno ha suspendido "+s.contarNotasSuspensas(notas)+" exámenes");
//				}
//				break;
				
//			case 6: 
//				s.imprimirAlumnos(setAlumnos);
//				System.out.println("Elija el apellido1 del alumno que desea modificar:");
//				apellido=Leer.dato();
//				if(s.findByApellido(setAlumnos, apellido) == null) {
//					System.out.println("No se ha encontrado un alumno con ese apellido.");
//					System.out.println();
//				}else {
//					System.out.println("¿Cuántas notas quiere introducir para el alumno?");
//					tam=Leer.datoInt();
//					
//					notas=new float[tam];
//					
//					System.out.println("Introduzca las notas para el alumno:");
//					for(int i =0;i<notas.length;i++) {
//						System.out.println((i+1)+": ");
//						notas[i]=Leer.datoFloat();
//					}
//					
//					System.out.printf("La media de sólo las notas suspensas del alumno es de %.2f \n",s.calcularMediaNotasSuspensas(notas));
//					System.out.println(); //hace falta arreglarlo
//				}
//				break;
=======
>>>>>>> 3457a02bc4389328046ef41b757f0cd3d413bb9e
				s.imprimirAlumnos(listaAlumnos);
				break;
				
			case 2:
				s.imprimirAlumnos(listaAlumnos);
				System.out.println("Elija el apellido1 del alumno que desea modificar:");
				apellido=Leer.dato();
				if(s.findByApellido(listaAlumnos, apellido) == null) {
					System.out.println("No se ha encontrado un alumno con ese apellido.");
					System.out.println();
				}else {
					System.out.println("¿Qué atributo quiere cambiar?");
					System.out.println("1. Nombre | 2. Primer Apellido | 3. Tercer apellido");
					mod=Leer.datoInt();
					s.modificarAlumno(s.findByApellido(listaAlumnos, apellido),mod);
					System.out.println();
				}
				break;
				
			case 3:
				s.imprimirAlumnos(listaAlumnos);
				System.out.println("Elija el apellido1 del alumno que desea modificar:");
				apellido=Leer.dato();
				if(s.findByApellido(listaAlumnos, apellido) == null) {
					System.out.println("No se ha encontrado un alumno con ese apellido.");
					System.out.println();
				}else {
					listaAlumnos.remove(s.findByApellido(listaAlumnos, apellido));
					System.out.println();
				}
				break;
				
			case 4:
				s.imprimirAlumnos(listaAlumnos);
				System.out.println("Elija el apellido1 del alumno que desea modificar:");
				apellido=Leer.dato();
				if(s.findByApellido(listaAlumnos, apellido) == null) {
					System.out.println("No se ha encontrado un alumno con ese apellido.");
					System.out.println();
				}else {
					System.out.println("¿Cuántas notas quiere introducir para el alumno?");
					tam=Leer.datoInt();
					
					notas=new float[tam];
					
					System.out.println("Introduzca las notas para el alumno:");
					for(int i =0;i<notas.length;i++) {
						System.out.println((i+1)+": ");
						notas[i]=Leer.datoFloat();
					}
					
					System.out.printf("La media de las notas del alumno es de %.2f \n",s.calcularNotaMedia(notas));
					System.out.println();
				}
				break;
				
			case 5: 
				s.imprimirAlumnos(listaAlumnos);
				System.out.println("Elija el apellido1 del alumno que desea modificar:");
				apellido=Leer.dato();
				if(s.findByApellido(listaAlumnos, apellido) == null) {
					System.out.println("No se ha encontrado un alumno con ese apellido.");
					System.out.println();
				}else {
					System.out.println("¿Cuántas notas quiere introducir para el alumno?");
					tam=Leer.datoInt();
					
					notas=new float[tam];
					
					System.out.println("Introduzca las notas para el alumno:");
					for(int i =0;i<notas.length;i++) {
						System.out.println((i+1)+": ");
						notas[i]=Leer.datoFloat();
					}
					
					System.out.println("El alumno ha suspendido "+s.contarNotasSuspensas(notas)+" exámenes");
				}
				break;
				
			case 6: 
				s.imprimirAlumnos(listaAlumnos);
				System.out.println("Elija el apellido1 del alumno que desea modificar:");
				apellido=Leer.dato();
				if(s.findByApellido(listaAlumnos, apellido) == null) {
					System.out.println("No se ha encontrado un alumno con ese apellido.");
					System.out.println();
				}else {
					System.out.println("¿Cuántas notas quiere introducir para el alumno?");
					tam=Leer.datoInt();
					
					notas=new float[tam];
					
					System.out.println("Introduzca las notas para el alumno:");
					for(int i =0;i<notas.length;i++) {
						System.out.println((i+1)+": ");
						notas[i]=Leer.datoFloat();
					}
					
					System.out.printf("La media de sólo las notas suspensas del alumno es de %.2f \n",s.calcularMediaNotasSuspensas(notas));
					System.out.println(); //hace falta arreglarlo
				}
				break;
<<<<<<< HEAD
=======
>>>>>>> c3fe93d2e0d50a0fe6f5a41c1ea14541cd8f096a
>>>>>>> 3457a02bc4389328046ef41b757f0cd3d413bb9e
				
				default:
					System.out.println("Elija una opción correcta.");
				
				
			}
		}while(opcion != 0);

	}

	public static void imprimirMenu() {
		System.out.println("1. Mostrar todos los alumnos");
		System.out.println("2. Modificar los datos de algún alumno");
		System.out.println("3. Borrar algún alumno");
		System.out.println("4. Sacar nota media");
		System.out.println("5. Contar número de suspenos");
		System.out.println("6. Calcular media de notas suspensas");
		System.out.println("0. Salir del programa");
	}
}
