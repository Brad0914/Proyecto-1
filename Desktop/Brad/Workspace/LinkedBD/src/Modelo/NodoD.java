package Modelo;
import Interfaz.*;
import javafx.scene.control.TreeItem;
public class NodoD {
	private NodoD siguiente;
	private NodoD Anterior;
	private ListaDC valor;
	public TreeItem<String> rama;
	
	
	 
	public TreeItem<String> getRama() {
		return rama;
	}

	public void setRama(TreeItem<String> rama) {
		this.rama = rama;
	}

	public NodoD(ListaDC valor, String rama) {
		this.rama = new TreeItem<String>(rama);
		this.valor = valor;
	}
	
	public NodoD(ListaDC valor, NodoD siguiente, NodoD Anterior, TreeItem<String> rama) {
	this.valor = valor;
	this.siguiente = siguiente;  
	this.Anterior = Anterior;
	this.rama = rama;
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
