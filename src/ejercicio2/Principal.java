package ejercicio2;

import java.util.ArrayList;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		int opcion,pos,mod;
		String nombre,dni;
		
		Socio s;
		Socio s1 = new Socio("Tomás","29586300C");
		Socio s2 = new Socio("Jaime","58391035D");
		Socio s3 = new Socio("Ricardo","501495'3F");
		Socio s4 = new Socio("Rafa","59458602T");
		
		GestionClub g = new GestionClub();
<<<<<<< HEAD
		CrudSocio crud = new CrudSocio();
=======
>>>>>>> c3fe93d2e0d50a0fe6f5a41c1ea14541cd8f096a
		List<Socio> listaSocios = new ArrayList<Socio>();
		listaSocios.add(s1);
		listaSocios.add(s2);
		listaSocios.add(s3);
		listaSocios.add(s4);

		System.out.println("Bienvenido al programa. Elija una opción:");
		
		do {
			imprimirMenu();
			opcion = Leer.datoInt();
			
			switch(opcion) {
			
			case 0:
				System.out.println("Gracias por utilizar el programa");
				break;
				
			case 1:
				System.out.println("Nombre:");
				nombre=Leer.dato();
				System.out.println("DNI:");
				dni=Leer.dato();
				
				s=new Socio(nombre,dni);
				listaSocios.add(s);
				
				break;
				
			case 2:
				System.out.println("Elija el dni de algún socio:");
				g.imprimirSocios(listaSocios);
				dni=Leer.dato();
				if(g.findByDNI(listaSocios, dni) == null) {
					System.out.println("No se han encontrado socios con ese DNI.");
				}else {
					System.out.println(g.findByDNI(listaSocios, dni));
				} 
				System.out.println();
				break;
				
			case 3:
				System.out.println("Elija algún socio:");
				g.imprimirSocios(listaSocios);
				pos=Leer.datoInt()-1;
				
				while(pos > listaSocios.size() || pos < 0) {
					System.out.println("El socio que ha elegido no existe en el programa. Indique otro.");
					pos=Leer.datoInt()-1;
				}
					
				System.out.println("Indique el número del atributo que desea modificar:");
				System.out.println("1. Nombre | 2. DNI | 3. Todo");
				mod=Leer.datoInt();
<<<<<<< HEAD
				crud.modificarSocio(listaSocios, pos, mod);
=======
				g.modificarSocio(listaSocios, pos, mod);
>>>>>>> c3fe93d2e0d50a0fe6f5a41c1ea14541cd8f096a
				System.out.println();
				break;
				
			case 4:
				g.imprimirSocios(listaSocios);
				System.out.println();
				break;
				
			case 5:
				System.out.println("Indique el socio que desea borrar:");
				g.imprimirSocios(listaSocios);
				pos=Leer.datoInt()-1;
<<<<<<< HEAD
				crud.eliminarSocio(listaSocios,pos);
=======
				g.eliminarSocio(listaSocios,pos);
>>>>>>> c3fe93d2e0d50a0fe6f5a41c1ea14541cd8f096a
				System.out.println();
				break;
				
			default:
				System.out.println("Elija una opción correcta.");
			}
		}while(opcion!=0);
	}
	
	public static void imprimirMenu() {
		System.out.println("1. Añadir nuevo socio");
		System.out.println("2. Buscar socio por DNI");
		System.out.println("3. Modificar datos de un socio");
		System.out.println("4. Mostrar socios");
		System.out.println("5. Borrar socio");
		System.out.println("0. Salir del programa");
	}
}
