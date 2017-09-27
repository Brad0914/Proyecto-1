 package Modelo;
 import Interfaz.*;
import javafx.scene.control.TreeItem;
public class NodoCD {
	private NodoCD siguiente; 
	private NodoCD anterior;
	private Lista valor;
	public TreeItem<String> rama;

	public NodoCD(Lista valor, String rama) {
		this.rama = new TreeItem<>(rama);
		this.valor = valor;
	}

	public TreeItem<String> getRama() {
		return rama;
	}

	public void setRama(TreeItem<String> rama) {
		this.rama = rama; 
	}

	public NodoCD(Lista valor, NodoCD siguiente, NodoCD anterior, TreeItem<String> rama) {
		this.valor = valor;
		this.siguiente = siguiente;
		this.anterior = anterior;
		this.rama = rama;
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



