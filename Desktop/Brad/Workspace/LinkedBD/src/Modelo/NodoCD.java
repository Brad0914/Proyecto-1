 package Modelo;

public class NodoCD {
	private NodoCD siguiente; 
	private NodoCD anterior;
	private Lista valor;


	public NodoCD(Lista valor) {

		this.valor = valor;
	}



	public NodoCD(Lista valor, NodoCD siguiente, NodoCD anterior) {
		this.valor = valor;
		this.siguiente = siguiente;
		this.anterior = anterior;

	}

	public NodoCD getSiguiente() { 
		return siguiente;
	}

	public void setSiguiente(NodoCD siguiente) {
		this.siguiente = siguiente;
	}

	public NodoCD getAnterior() {
		return anterior;
	}

	public void setAnterior(NodoCD anterior) {
		this.anterior = anterior;
	}

	public Lista getValor() {
		return valor;
	}

	public void setValor(Lista valor) {
		this.valor = valor;
	}
}



