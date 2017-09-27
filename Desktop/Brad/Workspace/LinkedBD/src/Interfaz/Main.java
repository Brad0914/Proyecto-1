/**
 * @author Bradly valverde F.
 */

package Interfaz;
import Modelo.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		
		//LLama a Application para que inicie el Metodo start() 
		launch(args);
		
	}
	private void ponerTree(NodoD nodo, Tree tree) {
		NodoD actual = nodo;
		while (actual != null) {
			tree.CreateHoja(actual.getRama(), tree.getRoot());
			actual = actual.getSiguiente();
		}
	}
	private void ponerRamas(NodoCD nodo, Tree tree, ListaD rama, int posicion) {
		int local = 0;
		NodoD ramaActual = rama.getPrimero();
		NodoCD actual = nodo;
		NodoCD actual1 = nodo.getAnterior();
		while (local != posicion) {
			local ++;
			ramaActual = ramaActual.getSiguiente();
		}
		while (actual != actual1) { 
			tree.CreateHoja(actual.getRama(), ramaActual.getRama());
			actual = actual.getSiguiente();
			}
		tree.CreateHoja(nodo.getAnterior().getRama(), ramaActual.getRama());
	}

	

	
	@Override
	public void start (Stage Ventana) throws Exception {
		
		//Nombre de la Ventana
		Ventana.setTitle("LinkedBD");
		
		//Creando Boton
		Button boton = new Button("Commit");
		
		
		//Creando menu
		Menus menu =  new Menus("file");
		MenuItem a = menu.NewItem("dsadasd");
		menu.NewMenu("dasd");
//		a.setOnAction(e -> );
		
		
		//Creacion del BorderPane
		BorderPane borderPane = new BorderPane();
		
		//Creando Escena
		Scene scene = new Scene(borderPane, 1800, 1080);
		
//////////////////////////////////////////////////////////////////////////////////
		//listas
		String user = "{'nombre': Brad, 'apellido': Valverde, 'nacionalidad': Tico, 'edad': 18}";
		ListaD l = new ListaD();
		ListaDC ldc = new ListaDC();
		ListaDC ldc2 = new ListaDC();
		ListaDC ldc3 = new ListaDC();
		ListaDC ldc4 = new ListaDC();
		ListaDC ldc5 = new ListaDC();
		Lista l1 = new Lista();
		Lista l2 = new Lista();
		Lista l3 = new Lista();
		Lista l4 = new Lista();
		Lista l5 = new Lista();
		l1.insertarFinal(user);
		ldc.insertarFinal(l1, "lista doble circular");
		ldc.insertarFinal(l2, "lista doble circular2");
		ldc.insertarFinal(l3, "lista doble circular3");
		ldc.insertarFinal(l4, "lista doble circular4");
		ldc.insertarFinal(l5, "lista doble circular5");
		l.insertarFinal(ldc, "lista doble");
		l.insertarFinal(ldc2, "lista doble2");
		l.insertarFinal(ldc3, "lista doble3");
		l.insertarFinal(ldc4, "lista doble4");
		l.insertarFinal(ldc5, "lista doble5");
//		l.eliminar(5);
//		ldc.eliminar(4);
		 
		
		
		//Creando el arbol
		Tree tree = new Tree();
		ponerTree(l.getPrimero(), tree);
		ponerRamas(ldc.getPrimero(), tree, l, 4);
//		tree.CreateHoja(ldc.getPrimero().getRama(), l.getPrimero().getRama());

		
	

		
		
//////////////////////////////////////////////////////////////////////////////////		
		
		
		
		//Distribucion de los objetos en la ventana
		borderPane.setTop(menu.getMenubar());
		borderPane.setLeft(tree.getTree());
		borderPane.setBottom(boton);
		
		
				
		Ventana.setScene(scene);
		Ventana.show();

		
		
	}


}
