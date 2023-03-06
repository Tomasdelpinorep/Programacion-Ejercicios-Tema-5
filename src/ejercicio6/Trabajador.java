package ejercicio6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Trabajador {
	private String nombre, dni;
	private int horas;
	private float sueldoFinal, pagoHora;
	
	
	public Trabajador(String nombre, String dni, int horas, float pagoHora) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.horas = horas;
		this.pagoHora = pagoHora;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	public float getSueldoFinal() {
		return sueldoFinal;
	}
	public void setSueldoFinal(float sueldoFinal) {
		this.sueldoFinal = sueldoFinal;
	}
	
	
	public float getPagoHora() {
		return pagoHora;
	}
	public void setPagoHora(float pagoHora) {
		this.pagoHora = pagoHora;
	}
	
	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + ", dni=" + dni + ", horas=" + horas + ", sueldoFinal=" + sueldoFinal
				+ "]";
	}
	
	public void calcularSueldoFinal(Map<Integer,Trabajador> lista) {
		for(Trabajador t : lista.values()) {
			t.setSueldoFinal(t.getPagoHora() * t.getHoras());
		}
	}
	
	public void imprimirTree(Map<Integer,Trabajador> tree) {
		for(Trabajador t : tree.values()) {
			System.out.println(t);
		}
	}
	
	public Map<Integer,Trabajador> ordenarHorasAscendente(Map<Integer,Trabajador> lista) {
		Map<Integer,Trabajador> tree = new TreeMap<>();
		tree.putAll(lista);
		return tree;
	}
	
	public Map<Integer,Trabajador> ordenarHorasDescendente(Map<Integer,Trabajador> lista) {
		Map<Integer,Trabajador> tree = new TreeMap<>(new ordenarHorasDescendente());
		tree.putAll(lista);
		return tree;
	}
	
	public List<Trabajador> ordenarSueldo(Map<Integer,Trabajador> lista) {
		List<Trabajador> ordenadoSueldo = new ArrayList<>(lista.values());
		Collections.sort(ordenadoSueldo, new ordenarPorSueldo());
		return ordenadoSueldo;
	}
}
