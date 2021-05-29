package unilim.info.ihm.filRouge.view;


import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import unilim.info.ihm.filRouge.controller.ParametreControllerReessayer;

public class PausePane extends VBox {
	Button continuer=new Button("continuer");
	Button reesayer=new Button("réessayer");
	Button btnMenu=new Button("menu");
	VBox vbPause=new VBox();
	private MemoryPane memory;
	private MenuPane menu;

	public PausePane(MemoryPane memory,MenuPane menu) {
		vbPause.getChildren().addAll(continuer,reesayer,btnMenu);
		this.getChildren().addAll(vbPause);
		this.memory=memory;
		this.menu=menu;
		vbPause.setMargin(continuer, new Insets(0,0,30,0));
		vbPause.setMargin(reesayer, new Insets(0,0,30,0));
		vbPause.setMargin(btnMenu, new Insets(0,0,30,0));
		
		
		this.setAlignment(Pos.CENTER);
		vbPause.setAlignment(Pos.CENTER);
		this.continuer.setPrefSize(200, 50);
		this.reesayer.setPrefSize(200, 50);
		this.btnMenu.setPrefSize(200, 50);
		this.reesayer.addEventFilter(MouseEvent.MOUSE_PRESSED, new ParametreControllerReessayer(memory,memory.getCheminTheme()));
		this.btnMenu.addEventFilter(MouseEvent.MOUSE_PRESSED, new ParametreControllerReessayer(memory,memory.getCheminTheme()));
		
	}



	public Button getContinuer() {
		return continuer;
	}



	public void setContinuer(Button continuer) {
		this.continuer = continuer;
	}



	public Button getReesayer() {
		return reesayer;
	}



	public void setReesayer(Button reesayer) {
		this.reesayer = reesayer;
	}



	public Button getMenu() {
		return btnMenu;
	}



	public void setMenu(Button menu) {
		this.btnMenu = menu;
	}



	public VBox getVbPause() {
		return vbPause;
	}



	public void setVbPause(VBox vbPause) {
		this.vbPause = vbPause;
	}
	
}
