package ejercicio;

public class Taquilla {
	
	private General [] lista;
	
	
	
	public Taquilla(General[] lista) {
		super();
		this.lista = lista;
	}

	public double calcularPrecio(int eleccionEntrada, double extra,double descuento, int opcion) {
		return lista[eleccionEntrada].calcularPrecio(lista,eleccionEntrada,extra,descuento,opcion);
	}
	
	public double calcularTotalRecaudado(double extra ,double descuento, int opcion) {
		double total=0;
		
		for(int i=0;i<lista.length && lista[i] != null;i++) {
			total+=lista[i].calcularPrecio(lista, i, extra, descuento, opcion);
		}
		return total;
	}
	
	public double calcularTotalRecaudadoArriba(double extra ,double descuento, int opcion) {
		double total=0;
		
		for(int i=0;i<lista.length && lista[i] != null;i++) {
			if(lista[i].getZona()==2)
				total+=lista[i].calcularPrecio(lista, i, extra, descuento, opcion);
		}
		return total;
		
	}
	
	public void imprimirEntradasInvitado() {
		int cont=1;
		for(int i=0;i<lista.length && lista[i] != null;i++) {
			if(lista[i] instanceof Invitados) {
				System.out.println(cont+". "+lista[i]);
				cont++;
			}	
		}
		
	}
	
	public void imprimirEntradas() {
		for(int i =0;i<lista.length && lista[i] != null;i++) {
			System.out.println((i+1)+". "+lista[i]);
		}
	}
}
