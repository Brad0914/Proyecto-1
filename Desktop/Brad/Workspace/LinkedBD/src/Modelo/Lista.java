package Modelo;
import Interfaz.*;
 /**
  * 
  * @author Bradly Valverde F
  *clase lista
  */
public class Lista {
	private Nodo primero;
 
	/**
	 * constructor 
	 */
	public Lista() {
		this.primero = null;
	}
	
	/**
	 * para verificar que la lista esta vaica
	 * @return boolean de que si la lista es vacia
	 */
	public boolean isEmpty() {
		return this.primero == null;
	}
	/**
	 * obtiene el calor de primero
	 * @return this.primero
	 */
	public Nodo getPrimero() {
		return primero;
	}

	/**
	 * le otorga al primero un valor nodo
	 * @param primero
	 */
	public void setPrimero(Nodo primero) {
		this.primero = primero;
	}

	/**
	 * inserta un valor al final de la lista
	 * @param valor
	 */
	public void insertarFinal(String valor) {
		if (this.primero == null) {
			this.primero = new Nodo(valor);
		} else {
			Nodo actual = this.primero;
			while (actual.getSiguiente() != null) {
				actual = actual.getSiguiente();
			}
			actual.setSiguiente(new Nodo(valor));
		}

	}

	/**
	 * imprime la lista 
	 */
	public void imprimir() {
		Nodo actual = this.primero;
		while (actual != null) {
			System.out.println(actual.getValor());
			actual = actual.getSiguiente();
		}
	}

	/**
	 * inserta un valor al inicio
	 * @param valor
	 */
	public void insertarInicio (String valor) {
		if (this.primero == null) {
			this.primero = new Nodo(valor);
		} else {
			Nodo nuevo = new Nodo(valor);
			nuevo.setSiguiente(this.primero);
			this.primero = nuevo;
		}
	}


}