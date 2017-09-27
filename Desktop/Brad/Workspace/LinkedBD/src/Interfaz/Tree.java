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

public class Tree {
	TreeItem<String> root;
	TreeView<String> tree;
	
	public Tree(){
		root = new TreeItem<>();
		root.setExpanded(true);
		tree = new TreeView<>(root);
		tree.setShowRoot(false);
	}
	
	public TreeItem<String> CreateRama(String nombre, TreeItem<String> raizUp){
		TreeItem<String> rama = new TreeItem<>(nombre);
		rama.setExpanded(true);
		raizUp.getChildren().add(rama);
		return rama;
		
	}
	public  TreeItem<String> CreateHoja(TreeItem<String> hoja, TreeItem<String> RamaUp){
		RamaUp.getChildren().add(hoja);
		return hoja;
		
	}

	public TreeItem<String> getRoot() {
		return root;
	}

	public void setRoot(TreeItem<String> root) {
		this.root = root;
	}

	public TreeView<String> getTree() {
		return tree;
	}

	public void setTree(TreeView<String> tree) {
		this.tree = tree;
	}

}
