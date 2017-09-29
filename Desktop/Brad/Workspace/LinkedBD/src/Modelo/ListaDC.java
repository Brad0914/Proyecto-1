package Modelo;
import Interfaz.*;
import javafx.scene.control.TreeItem;
/**
 * lista doble circular
 * @author Bradly valverde F
 *
 */
public class ListaDC {
	private NodoCD primero;
	private NodoCD ultimo; 
	public TreeItem<String> rama;

	public TreeItem<String> getRama() {
		return rama;
	}

	public void setRama(TreeItem<String> rama) {
		this.rama = rama;
	}

	public ListaDC(String nombre) {
		this.primero = null;
		this.ultimo = null;
		this.rama = new TreeItem<>(nombre);
	}

	public boolean isEmpty() {
		return this.primero == null && this.ultimo == null;
	}

	public NodoCD getPrimero() {
		return primero; 
	}

	public NodoCD getUltimo() {
		return ultimo;
	}

	public void insertarFinal(Lista valor) {
		if (this.ultimo == null) {
			this.ultimo = new NodoCD(valor);
			this.primero = this.ultimo;
		}else
			if (this.primero == this.ultimo) {
				NodoCD actual = this.primero;
				actual.setSiguiente(new NodoCD(valor));
				this.ultimo = this.ultimo.getSiguiente();
				this.ultimo.setAnterior(actual);

								
			}else{
				NodoCD actual = this.ultimo;
				actual.setSiguiente(new NodoCD (valor));
				this.ultimo = this.ultimo.getSiguiente();
				this.ultimo.setAnterior(actual);
				this.ultimo.setSiguiente(this.primero);
				this.primero.setAnterior(this.ultimo);
				
			}

	}
	public void eliminar(int contador) {
		int local = 1;
		NodoCD actual = this.primero;
		NodoCD actual1 = this.primero.getSiguiente();
		NodoCD actual2 = this.ultimo;
		if (contador == 0) {
			this.primero = this.primero.getSiguiente();
			this.primero.setAnterior(this.ultimo);
			this.ultimo.setSiguiente(this.primero); 
		}else{
			while(actual1 != null) {
				
				if (actual1 == actual2) {
					this.ultimo = this.ultimo.getAnterior();
					this.ultimo.setSiguiente(this.primero);
					this.primero.setAnterior(this.ultimo);
					break;
				}else
					if(local == contador) {
						actual.setSiguiente(actual1.getSiguiente());
						actual1.getSiguiente().setAnterior(actual);
						break;
				}else{
					actual = actual.getSiguiente();
					actual1 = actual1.getSiguiente();
					local = local + 1; 
						
					}
			
			}
			
		}
	}

	public void imprimir() {
		NodoCD actual = this.primero;
		while (actual != null) {
			System.out.println(actual.getValor());
			actual = actual.getSiguiente();
		}
	}
	public void imprimirAlreves() {
		NodoCD actual = this.ultimo;
		while (actual != null) {
			System.out.println(actual.getValor());
			actual = actual.getAnterior();
		}
	}
	public void insertarInicio (Lista valor) {
		if (this.primero == null) {
			this.primero = new NodoCD(valor);
			this.ultimo = this.primero;
			
		} else 
			if (this.primero == this.ultimo) {
				NodoCD actual = this.ultimo;	
				actual.setAnterior(new NodoCD(valor));
				this.primero = this.primero.getAnterior(); 
				this.primero.setSiguiente(actual);

				 
		}else { 
			NodoCD actual = this.primero;
			actual.setAnterior(new NodoCD (valor));
			this.primero = this.primero.getAnterior(); 
			this.primero.setSiguiente(actual);
			this.primero.setAnterior(this.ultimo);
			this.ultimo.setSiguiente(this.primero);
			

	}
}
}