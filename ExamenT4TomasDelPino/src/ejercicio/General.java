package ejercicio;

public class General implements IDonativo{

	private int zona,numFila,NumAsiento;

	public General(int zona, int numFila, int numAsiento) {
		super();
		this.zona = zona;
		this.numFila = numFila;
		NumAsiento = numAsiento;
	}

	public int getZona() {
		return zona;
	}

	public void setZona(int zona) {
		this.zona = zona;
	}

	public int getNumFila() {
		return numFila;
	}

	public void setNumFila(int numFila) {
		this.numFila = numFila;
	}

	public int getNumAsiento() {
		return NumAsiento;
	}

	public void setNumAsiento(int numAsiento) {
		NumAsiento = numAsiento;
	}

	@Override
	public String toString() {
		return "General [zona=" + zona + ", numFila=" + numFila + ", NumAsiento=" + NumAsiento + "]";
	}
	
	public double calcularPrecio(General []lista,int eleccionEntrada,double extra, double descuento, int opcion) {
		if(zona == 1) { //ZONA 1 ES ZONA DE ABAJO
			return 5;
		}else { //USARÉ ZONA 2 COMO ZONA DE ARRIBA AUNQUE VALGA CUALQUIER OTRO NÚMERO
			return 3;
		}
	}

	@Override
	public double calcularDonativo(Taquilla t,double extra, double descuento,int opcion,double donativos) {
		return t.calcularTotalRecaudado(extra, descuento, opcion)*donativos/100;
	}
}
