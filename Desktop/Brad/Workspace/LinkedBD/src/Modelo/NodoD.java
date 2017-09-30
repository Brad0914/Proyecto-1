package Modelo;

public class NodoD {
	private NodoD siguiente;
	private NodoD Anterior;
	private ListaDC valor;


	public NodoD(ListaDC valor) {

		this.valor = valor;
	}
	
	public NodoD(ListaDC valor, NodoD siguiente, NodoD Anterior) {
	this.valor = valor;
	this.siguiente = siguiente;  
	this.Anterior = Anterior;

	}

	public NodoD getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(NodoD siguiente) {
		this.siguiente = siguiente;
	}
	public NodoD getAnterior() {
		return Anterior;
	}
	public void setAnterior(NodoD anterior) {
		Anterior = anterior;
	}
	public ListaDC getValor() {
		return valor;
	}
	public void setValor(ListaDC valor) {
		this.valor = valor;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//	private ListaDC valor;
//
//	public NodoD(ListaDC valor) { 
//		this.valor = valor;
//		this.siguiente = null;
//	}
//
//	public NodoD(ListaDC valor, NodoD siguiente) {
//		this(valor);
//		this.siguiente = siguiente;
//	}
//
//	public NodoD getSiguiente() {
//		return siguiente;
//	}
//
//	public void setSiguiente(NodoD siguiente) {
//		this.siguiente = siguiente;
//	}
//
//	public ListaDC getValor() {
//		return valor;
//	}
//
//	public void setValor(ListaDC valor) {
//		this.valor = valor;
//	}

}
