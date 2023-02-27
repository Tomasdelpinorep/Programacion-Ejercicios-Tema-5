package ejercicio4;

import java.util.HashMap;
import java.util.Map;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		int opcion,id; // y las demás variables

		Contacto c1 = new Contacto ("Tomás","tomasdelpino28@gmail.com",1);
		Contacto c2 = new Contacto ("Kratos","kratos@gmail.com",2);
		Contacto c3 = new Contacto ("Mario","mario@gmail.com",3);
		
		Map<Contacto,Integer> lista = new HashMap<Contacto,Integer>();
		lista.put(c1, 111111111);
		lista.put(c2, 222222222);
		
		Agenda a = new Agenda(lista);
		a.agregar(c3, 333333333);
		

		System.out.println("Bienvenido al programa. Elija una opción:");
		
		do {
			imprimirMenu();
			opcion = Leer.datoInt();
			
			switch(opcion) {
			
			case 0:
				System.out.println("Gracias por utilizar el programa");
				break;
				
			case 1:
				a.mostrarTodos();
				break;
				
			case 2:
				break;
				
			case 3:
				System.out.println("Indique el id del contacto a borrar:");
				a.mostrarTodos();
				id=Leer.datoInt();
				a.eliminarContacto(id);
				
				break;
				
			case 4:
				break;
				
				default:
					System.out.println("Elija una opción correcta.");
			}
		}while(opcion!=0);
	}
	
	public static void imprimirMenu() {
		System.out.println("1. Mostrar todos los contactos.");
		System.out.println("2. ");
		System.out.println("3. Eliminar un contacto.");
		System.out.println("4. "); 
		System.out.println("0. Salir del programa");
	}
}
