package ejercicio;

public class Invitados extends General{

	private String nombre;

	public Invitados(int zona, int numFila, int numAsiento, String nombre) {
		super(zona, numFila, numAsiento);
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Invitados [nombre=" + nombre + ", toString()=" + super.toString() + "]";
	}
	
	public double calcularPrecio(General [] lista,int eleccionEntrada,double extra, double descuento, int opcion) {
		Invitados aux;
		String nombre;
		
		if(lista[eleccionEntrada] instanceof Invitados && opcion ==1) {
			aux = (Invitados)lista[eleccionEntrada];
			nombre=aux.getNombre();
			aux.imprimirVale(nombre);
		}
		
		return super.calcularPrecio(lista,eleccionEntrada,extra, descuento,opcion)+extra;
	}
	
	public void imprimirVale(String nombre) {
		System.out.println("Incluye 1 consumición. Exclusivo para "+ nombre);
	}
	
}
