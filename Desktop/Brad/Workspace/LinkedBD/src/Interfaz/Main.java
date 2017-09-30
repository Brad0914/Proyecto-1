/**
 * @author Bradly valverde F.
 */

package Interfaz;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;


import Modelo.*;
import javafx.application.Application;

import javafx.scene.Scene;

import javafx.scene.control.Button;
import javafx.scene.control.ContextMenu;

import javafx.scene.control.MenuItem;

import javafx.scene.layout.BorderPane;

import javafx.stage.Stage;

public class Main extends Application {
	ListaD l;
	JSONArray JA;

	public static void main(String[] args) {
		
		//LLama a Application para que inicie el Metodo start() 
		launch(args);
		
	}
	
	private void ponerTree(ListaDC l, Tree tree) {
		tree.CreateHoja(l.getRama(), tree.getRoot());
	}
	
	private void ponerRamas(Tree tree, Lista l, ListaD ld, int posicion) {
		int local = 0;
		NodoD actual = ld.getPrimero();
		while (local != posicion) {
			actual = actual.getSiguiente(); 
			local ++; 
		}
		tree.CreateHoja(l.getRama(), actual.getValor().getRama());
		actual.getValor().insertarFinal(l);
	}
	
	private void listaDeAtributos(Lista l, ListaAtributos la, Formulario box) {
		box.display("Atributos");
	if (Formulario.getChoicebox(box.getBoxSalir()) == "Si"){
			return;
			
	}else
		if (Formulario.getChoicebox(box.getChoiceBox1()) == "Integer" && Formulario.getChoicebox(box.getChoiceBox2()) == "Primaria" && Formulario.getChoicebox(box.getChoiceBox3()) == "Si") {
			la.insertarFinalI(Formulario.getTextAtributo(box.getTextAtributo()), 0,  true, false);
			listaDeAtributos(l, la, box);

	}else
		if (Formulario.getChoicebox(box.getChoiceBox1()) == "Integer" && Formulario.getChoicebox(box.getChoiceBox2()) == "Primaria" && Formulario.getChoicebox(box.getChoiceBox3()) == "No") {
			la.insertarFinalI(Formulario.getTextAtributo(box.getTextAtributo()), Formulario.getTextAtributoI(box.getDefault()),  true, false);
			listaDeAtributos(l, la, box);
			
	}else 
		if (Formulario.getChoicebox(box.getChoiceBox1()) == "Integer" && Formulario.getChoicebox(box.getChoiceBox2()) == "Foranea" && Formulario.getChoicebox(box.getChoiceBox3()) == "Si") {
			la.insertarFinalI(Formulario.getTextAtributo(box.getTextAtributo()), 0, false, true);
			listaDeAtributos(l, la, box);
			
	}else 
		if (Formulario.getChoicebox(box.getChoiceBox1()) == "Integer" && Formulario.getChoicebox(box.getChoiceBox2()) == "Foranea" && Formulario.getChoicebox(box.getChoiceBox3()) == "No") {
			la.insertarFinalI(Formulario.getTextAtributo(box.getTextAtributo()), Formulario.getTextAtributoI(box.getDefault()), false, true);
			listaDeAtributos(l, la, box);
			
	}else 
		if (Formulario.getChoicebox(box.getChoiceBox1()) == "Float" && Formulario.getChoicebox(box.getChoiceBox2()) == "Primaria" && Formulario.getChoicebox(box.getChoiceBox3()) == "Si") {
			la.insertarFinalF(Formulario.getTextAtributo(box.getTextAtributo()), 0.0f, true, false);
			listaDeAtributos(l, la, box);
			
	}else 
		if (Formulario.getChoicebox(box.getChoiceBox1()) == "Float" && Formulario.getChoicebox(box.getChoiceBox2()) == "Primaria" && Formulario.getChoicebox(box.getChoiceBox3()) == "No") {
			la.insertarFinalF(Formulario.getTextAtributo(box.getTextAtributo()), Formulario.getTextAtributoF(box.getDefault()), true, false);
			listaDeAtributos(l, la, box);
			
	}else 
		if (Formulario.getChoicebox(box.getChoiceBox1()) == "Float" && Formulario.getChoicebox(box.getChoiceBox2()) == "Foranea" && Formulario.getChoicebox(box.getChoiceBox3()) == "Si") {
			la.insertarFinalF(Formulario.getTextAtributo(box.getTextAtributo()), 0.0f, false, true);
			listaDeAtributos(l, la, box);
			
	}else 
		if (Formulario.getChoicebox(box.getChoiceBox1()) == "Float" && Formulario.getChoicebox(box.getChoiceBox2()) == "Foranea" && Formulario.getChoicebox(box.getChoiceBox3()) == "No") {
			la.insertarFinalF(Formulario.getTextAtributo(box.getTextAtributo()), Formulario.getTextAtributoF(box.getDefault()), false, true);
			listaDeAtributos(l, la, box);
			
	}else 
		if (Formulario.getChoicebox(box.getChoiceBox1()) == "String" && Formulario.getChoicebox(box.getChoiceBox2()) == "Primaria" && Formulario.getChoicebox(box.getChoiceBox3()) == "Si") {
			la.insertarFinalS(Formulario.getTextAtributo(box.getTextAtributo()), "", true, false);
			listaDeAtributos(l, la, box);
			
	}else 
		if (Formulario.getChoicebox(box.getChoiceBox1()) == "String" && Formulario.getChoicebox(box.getChoiceBox2()) == "Primaria" && Formulario.getChoicebox(box.getChoiceBox3()) == "No") {
			la.insertarFinalS(Formulario.getTextAtributo(box.getTextAtributo()), Formulario.getTextAtributoS(box.getDefault()), true, false);
			listaDeAtributos(l, la, box);
			
	}else 
		if (Formulario.getChoicebox(box.getChoiceBox1()) == "String" && Formulario.getChoicebox(box.getChoiceBox2()) == "Foranea" && Formulario.getChoicebox(box.getChoiceBox3()) == "Si") {						
			la.insertarFinalS(Formulario.getTextAtributo(box.getTextAtributo()), "", false, true);
			listaDeAtributos(l, la, box);
			
	}else 
		if (Formulario.getChoicebox(box.getChoiceBox1()) == "String" && Formulario.getChoicebox(box.getChoiceBox2()) == "Foranea" && Formulario.getChoicebox(box.getChoiceBox3()) == "No") {
			la.insertarFinalS(Formulario.getTextAtributo(box.getTextAtributo()), Formulario.getTextAtributoS(box.getDefault()), false, true);
			listaDeAtributos(l, la, box);
			
		}
		
		l.setLA(la);
	}
	
	@SuppressWarnings("unchecked")
	private JSONObject createJson(int CListaD, int CListaDC, ListaD l, Writebox box){
		int local1 = 0;
		int local2 = 0;
		JSONObject obj = new JSONObject();
		NodoD actual = l.getPrimero();
		NodoCD actual2 = actual.getValor().getPrimero();
		NodoAtributos actual3 = actual2.getValor().getLA().getPrimero();
		Lista actual4 = actual2.getValor();
		while (local1 != CListaD) {
			actual = actual.getSiguiente();
			local1 ++;
		}
		while (local2 != CListaDC) {
			actual2 = actual2.getSiguiente();
			local2 ++;
		}while (actual3 != null) {
			box.display("Escriba el atributo", actual3.getNombre());
			obj.put(actual3.getNombre(), Writebox.getTextName(box.getText()));
//			obj.put("Llave Primaria", actual3.isLlaveP());
//			obj.put("Llave Foranea", actual3.isLlaveF());
		
			actual3 = actual3.getSiguiente();
		}
		actual4.insertarFinal(obj);
		this.JA.add(actual4.getPrimero().getValor());
		return obj;
	}
	
	private void UbicarJson(int CListaD, int CListaDC, ListaD l){
		int local1 = 0;
		int local2 = 0; 
		NodoD actual = l.getPrimero();
		NodoCD actual2 = actual.getValor().getPrimero();
		Nodo actual3 = actual2.getValor().getPrimero();
		while (local1 != CListaD) {
			actual = actual.getSiguiente();
			local1 ++;
		}
		while (local2 != CListaDC) {
			actual2 = actual2.getSiguiente();
			local2 ++;
		}
		while(actual3 != null) {
			ShowJSON json = new ShowJSON();
			json.display("Json", actual3.getValor().toString());
			actual3 = actual3.getSiguiente();
			
		}

	}
	
	private void EliminarJson(int CListaD, int CListaDC, ListaD l){
		int local1 = 0;
		NodoD actual = l.getPrimero();
		ListaDC actual1 = actual.getValor();
		while (local1 != CListaD) {
			actual = actual.getSiguiente();
			local1 ++;
		}
		actual1.eliminar(CListaDC);

		}
	
			

	@Override
	public void start (Stage Ventana) throws Exception {
		
		JA = new JSONArray();
		l = new ListaD("Stores");

		//Nombre de la Ventana
		Ventana.setTitle("LinkedBD");
		
		//Creando Boton
		Button boton = new Button("Commit");
		boton.setOnAction(e ->{
			try {
			FileWriter archivo = new FileWriter("C:\\Users\\Ba\\Desktop\\Brad\\Workspace\\LinkedBD\\bin\\JSON\\JSONS.json");
			archivo.write(JA.toString());
			archivo.flush();
			archivo.close();
			}catch(IOException ex) {
				System.out.println("no sirvio");
			}
		});
		
		//items del menu contextual
		MenuItem item = new MenuItem("Listado");
		MenuItem item1 = new MenuItem("Agregar Json");
		MenuItem item2 = new MenuItem("Eliminar todo");

		
		item.setOnAction(e -> {
			Ubicacion u = new Ubicacion();
			u.display("Ubicacion");
			UbicarJson(Ubicacion.getTextInteger(u.getText1()), Ubicacion.getTextInteger(u.getText2()), l);

		});

		
		item1.setOnAction(e -> {
			Ubicacion u = new Ubicacion();
			u.display("Ubicacion");
			Writebox box = new Writebox();
			createJson(Ubicacion.getTextInteger(u.getText1()), Ubicacion.getTextInteger(u.getText2()), l, box);
		});
		
		item2.setOnAction(e -> {
			Ubicacion u = new Ubicacion();
			u.display("Ubicacion");
			EliminarJson(Ubicacion.getTextInteger(u.getText1()), Ubicacion.getTextInteger(u.getText2()), l);

		});
		
		//Creacion del BorderPane
		BorderPane borderPane = new BorderPane();
		
		//Creando Escena
		Scene scene = new Scene(borderPane, 400, 400);
		
		//context menu
		ContextMenu context = new ContextMenu();
		context.getItems().addAll(item, item1, item2);

		
		//Creando el arbol
		Tree tree = new Tree();

		//Creando menu
		Menus menu =  new Menus("File");
		MenuItem a = menu.NewItem("New Store...");
		MenuItem b = menu.NewItem("New Doc...");

		a.setOnAction(e -> { 
			Writebox box = new Writebox();
			box.display("Nuevo Store", "Nombre:");
			ListaDC ldc = new ListaDC(Writebox.getTextName(box.getText()));
			ponerTree(ldc, tree);
			l.insertarFinal(ldc);
			});
		 
		b.setOnAction(e -> {
			WriteDoc box1 = new WriteDoc();
			box1.display("Nuevo Documento");
			Formulario box = new Formulario();
			Lista l = new Lista(WriteDoc.getTextName(box1.getText()));
			ListaAtributos la = new ListaAtributos();
			try { 
				listaDeAtributos(l, la, box);
				ponerRamas(tree, l, this.l, WriteDoc.getTextInteger(box1.getTextInt()));
			}catch (Exception e1) {
				AlertBox.display("Error", "No se completó el formulario o hay valores inconsistentes");
			}			
			});
	
		tree.getTree().setContextMenu(context);
		
		
		//Distribucion de los objetos en la ventana
		borderPane.setTop(menu.getMenubar());
		borderPane.setLeft(tree.getTree());
		borderPane.setBottom(boton);

						
		Ventana.setScene(scene);
		Ventana.show();

		
		
	}


}
