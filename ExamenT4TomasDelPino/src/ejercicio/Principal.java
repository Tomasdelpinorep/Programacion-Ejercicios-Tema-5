package ejercicio;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		int opcion,eleccionEntrada,tam=3;
		double extra,descuento,donativos;
		
		General e1 = new Familias(1,6,15,2);
		General e2 = new Invitados (2,3,5,"Tomás");
		General e3 = new General (1,8,2);
		General [] lista = new General [tam];
		lista [0] = e1;
		lista [1] = e2;
		lista [2] = e3;
		
		Taquilla t = new Taquilla(lista);
		
		System.out.println("Bienvenido al programa. Se ha cargado un array de entradas antes de "
				+ "comenzar.");
		System.out.println("Cuál será el extra que paguen los invitados?");
		extra=Leer.datoDouble();
		System.out.println("¿Cuál será el % de descuento que reciban las familias?");
		descuento=Leer.datoDouble();
		
		do {
			imprimirMenu();
			opcion=Leer.datoInt();
			
			switch(opcion) {
			case 0:
				System.out.println("Gracias por utilizar el programa.");
				break;
				
			case 1:
				System.out.println("Elija una entrada:");
				t.imprimirEntradas();
				eleccionEntrada=Leer.datoInt()-1;
				
				System.out.printf("El precio de la entrada que ha elegido es de %.2f€ \n"
						,t.calcularPrecio(eleccionEntrada,extra,descuento,opcion));
				break;
				
			case 2:
				System.out.printf("El total recaudado ha sido de %.2f€ \n",t.calcularTotalRecaudado(extra, descuento,opcion));
				break;
				
			case 3:
				System.out.printf("El total recaudado con las entradas de la zona"
						+ " de ariiba es de %.2f€ \n",t.calcularTotalRecaudadoArriba(extra, descuento,opcion));
				break;
				
			case 4:
				t.imprimirEntradasInvitado();
				break;
				
			case 5:
				System.out.println("¿Cuál será el % destinado a donativos?");
				donativos=Leer.datoDouble();
				System.out.printf("En total se recaudarán %.2f€ \n",e1.calcularDonativo(t,extra,descuento,opcion,donativos));
				break;
				
			default:
				System.out.println("Elija una opción correcta.");
			}
		}while(opcion != 0);

	}
	public static void imprimirMenu() {
		System.out.println();
		System.out.println("*****************************************************");
		System.out.println("1. Calcular precio de entrada");
		System.out.println("2. Calcular el total recaudado");
		System.out.println("3. Calcular el total recaudado en la zona de arriba");
		System.out.println("4. Imprimir los tickets de invitado");
		System.out.println("5. Calcular el total de los donativos");
		System.out.println("0. Salir del programa");
		System.out.println("*****************************************************");
		System.out.println();
	}
}
