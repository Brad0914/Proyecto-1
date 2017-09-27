package Modelo;
import Interfaz.*;
public class Nodo {
	private Nodo siguiente;
	private String valor; 
	public String nombre;

	public Nodo(String valor) { 
		this.valor = valor;
		this.siguiente = null;
	}

	public Nodo(String valor, Nodo siguiente) {
		this(valor);
		this.siguiente = siguiente;
	}




	public Nodo getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}