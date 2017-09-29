/**
 * @author Bradly valverde F.
 */

package Interfaz;
import Modelo.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
	ListaD l;
	ListaListasD lSuperior;

	public static void main(String[] args) {
		
		//LLama a Application para que inicie el Metodo start() 
		launch(args);
		
	}
	
	private void ponerTree(ListaD l, Tree tree) {
		tree.CreateHoja(l.getRama(), tree.getRoot());
	}
	private void ponerRamas(Tree tree, ListaD l, ListaDC ldc) {
		tree.CreateHoja(ldc.getRama(), l.getRama());
		l.insertarFinal(ldc);
	}

	

	
	@Override
	public void start (Stage Ventana) throws Exception {
		lSuperior = new ListaListasD();
		//Nombre de la Ventana
		Ventana.setTitle("LinkedBD");
		
		//Creando Boton
		Button boton = new Button("Commit");
		
		//Labels
//		Label label1 = new Label("Escriba el nombre el Store");
		
		MenuItem item = new MenuItem("gg");
		MenuItem item1 = new MenuItem("gg1");
		MenuItem item2 = new MenuItem("gg2");

		
		
		//Creacion del BorderPane
		BorderPane borderPane = new BorderPane();
		
		//Creando Escena
		Scene scene = new Scene(borderPane, 1000, 1000);
		
//////////////////////////////////////////////////////////////////////////////////
		//listas
//		String user = "{'nombre': Brad, 'apellido': Valverde, 'nacionalidad': Tico, 'edad': 18}";
//		ListaD l = new ListaD();
//		ListaDC ldc = new ListaDC();
//		ListaDC ldc2 = new ListaDC();
//		ListaDC ldc3 = new ListaDC();
//		ListaDC ldc4 = new ListaDC();
//		ListaDC ldc5 = new ListaDC();
//		Lista l1 = new Lista();
//		Lista l2 = new Lista();
//		Lista l3 = new Lista();
//		Lista l4 = new Lista();
//		Lista l5 = new Lista();
//		l1.insertarFinal(user);
//		ldc.insertarFinal(l1, "lista doble circular");
//		ldc.insertarFinal(l2, "lista doble circular2");
//		ldc.insertarFinal(l3, "lista doble circular3");
//		ldc.insertarFinal(l4, "lista doble circular4");
//		ldc.insertarFinal(l5, "lista doble circular5");
//		l.insertarFinal(ldc, "lista doble");
//		l.insertarFinal(ldc2, "lista doble2");
//		l.insertarFinal(ldc3, "lista doble3");
//		l.insertarFinal(ldc4, "lista doble4");
//		l.insertarFinal(ldc5, "lista doble5");
//		l.eliminar(5);
//		ldc.eliminar(4);
		//context menu
		ContextMenu context = new ContextMenu();
		context.getItems().addAll(item, item1,item2);
		
		
		
		//Creando el arbol
		Tree tree = new Tree();
//		ponerTree(l.getPrimero(), tree);
//		ponerRamas(ldc.getPrimero(), tree, l, 4);
//		tree.CreateHoja(ldc.getPrimero().getRama(), l.getPrimero().getRama());

		//Creando menu
		Menus menu =  new Menus("File");
		MenuItem a = menu.NewItem("New Store...");
		a.setOnAction(e ->{ 
			l = new ListaD(Writebox.display("Nuevo Store", "Escriba el nombre del Store"));
			ponerTree(l, tree);
			lSuperior.insertarFinal(l);
			});
		
		tree.getTree().setContextMenu(context);
		
		item.setOnAction(e -> {
			
			ListaDC ldc = new ListaDC(Writebox.display("Nuevo Store", "Escriba el nombre del Store"));
			ponerRamas(tree, lSuperior.getPrimero().getValor(), ldc);
		});
		
		
//////////////////////////////////////////////////////////////////////////////////		
		
		
		
		//Distribucion de los objetos en la ventana
		borderPane.setTop(menu.getMenubar());
		borderPane.setLeft(tree.getTree());
		borderPane.setBottom(boton);
		
		
				
		Ventana.setScene(scene);
		Ventana.show();

		
		
	}


}
