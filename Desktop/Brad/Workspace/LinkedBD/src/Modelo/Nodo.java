package Modelo;

import org.json.simple.JSONObject;

public class Nodo {
	private Nodo siguiente;
	private JSONObject valor; 

	public Nodo(JSONObject obj) { 
		this.valor = obj;
		this.siguiente = null;
	}


	public Nodo getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}

	public JSONObject getValor() {
		return valor;
	}

	public void setValor(JSONObject valor) {
		this.valor = valor;
	}
}