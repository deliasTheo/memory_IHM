package unilim.info.ihm.filRouge.controller;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import unilim.info.ihm.filRouge.view.MenuPane;

public class MenuControllerJouer implements EventHandler<MouseEvent> {

	private MenuPane menu;
	
	public MenuControllerJouer(MenuPane menu) {
		this.menu=menu;
	}
	
	@Override
	public void handle(MouseEvent event) {
		
		menu.getJouer().setVisible(false);
		menu.getJoueur1().setVisible(true);
		menu.getJoueur2().setVisible(true);
		
		
		
	}

	
	

	
	
	
	
}
