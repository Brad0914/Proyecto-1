package Interfaz;

import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;


public class Tree {
	TreeItem<String> root;
	TreeView<String> tree;



	public Tree(){	
		root = new TreeItem<>();
		root.setExpanded(true);
		tree = new TreeView<>(root);
		tree.setShowRoot(false);
		
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
