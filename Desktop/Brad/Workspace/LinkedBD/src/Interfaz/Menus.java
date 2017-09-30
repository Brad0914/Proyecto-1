package Interfaz;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;


public class Menus {
	Menu menu;
	MenuBar menubar;
	
	public Menus(String nombreMenu) {
		menu = new Menu(nombreMenu);
		menubar = new MenuBar();
		menubar.getMenus().addAll(menu);
	}
	
	public MenuItem NewItem(String nombreItem) {
		MenuItem item = new MenuItem(nombreItem);
		menu.getItems().add(item);
		return item;
		
		
	}
	
	public Menu NewMenu(String nombreMenu) {
		Menu menus = new Menu(nombreMenu);
		this.menubar.getMenus().addAll(menus);
		return menus;
		
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public MenuBar getMenubar() {
		return menubar;
	}

	public void setMenubar(MenuBar menubar) {
		this.menubar = menubar;
	}

}
