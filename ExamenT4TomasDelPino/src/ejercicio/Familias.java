package ejercicio;

public class Familias extends General{

	private int numHijos;

	public Familias(int zona, int numFila, int numAsiento, int numHijos) {
		super(zona, numFila, numAsiento);
		this.numHijos = numHijos;
	}

	public int getNumHijos() {
		return numHijos;
	}

	public void setNumHijos(int numHijos) {
		this.numHijos = numHijos;
	}

	@Override
	public String toString() {
		return "Familias [numHijos=" + numHijos + ", toString()=" + super.toString() + "]";
	}
	
	public double calcularPrecio(General [] lista,int eleccionEntrada,double extra, double descuento, int opcion){
		return super.calcularPrecio(lista,eleccionEntrada,extra,descuento,opcion)*(1-(descuento/100));
	}
}
