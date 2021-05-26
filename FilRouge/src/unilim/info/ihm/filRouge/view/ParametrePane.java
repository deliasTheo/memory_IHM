package unilim.info.ihm.filRouge.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import unilim.info.ihm.filRouge.controller.MenuControllerJouer;


public class ParametrePane extends VBox {
	ComboBox nombreDeCartes=new ComboBox();
	ComboBox musique=new ComboBox();
	ComboBox theme=new ComboBox();
	ComboBox timer=new ComboBox();
	Button valider=new Button("valider");
	Button retourMenu=new Button("Menu");
	VBox vbParametre=new VBox();
	

	public ParametrePane() {
		vbParametre.getChildren().addAll(nombreDeCartes,musique,theme,timer,valider,retourMenu);
		this.getChildren().addAll(vbParametre);
		nombreDeCartes.setPromptText("nombreDeCartes");
		nombreDeCartes.getItems().addAll("4x4","5x4","6x4");
		
		musique.setPromptText("Choix de la musique");
		musique.getItems().addAll("Symphonie","La méthode","0,0,0,0");
		
		theme.setPromptText("Choix des thèmes");
		theme.getItems().addAll("Language de programmation","MAJ in coming");
		
		timer.setPromptText("Temps pour faire le memory");
		timer.getItems().addAll("1 min ", "2 min","3 min");
		vbParametre.setMargin(nombreDeCartes, new Insets(0,0,30,0));
		vbParametre.setMargin(musique, new Insets(0,0,30,0));
		vbParametre.setMargin(theme, new Insets(0,0,30,0));
		vbParametre.setMargin(timer, new Insets(0,0,30,0));
		vbParametre.setMargin(valider, new Insets(0,0,30,0));
		vbParametre.setMargin(retourMenu, new Insets(10,0,30,0));
		this.setAlignment(Pos.CENTER);
		vbParametre.setAlignment(Pos.CENTER);
		
		
		this.nombreDeCartes.setPrefSize(250, 50);
		this.musique.setPrefSize(250, 50);
		this.theme.setPrefSize(250, 50);
		this.timer.setPrefSize(250, 50);
		this.valider.setPrefSize(100, 50);
		this.retourMenu.setPrefSize(100, 50);
		
		
		
	
	}
	public ComboBox getTheme() {
		return theme;
	}
	public void setTheme(ComboBox theme) {
		this.theme = theme;
	}
	public Button getValider() {
		return valider;
	}
	public void setValider(Button valider) {
		this.valider = valider;
	}
	public Button getRetourMenu() {
		return retourMenu;
	}
	public void setRetourMenu(Button retourMenu) {
		this.retourMenu = retourMenu;
	}
	public VBox getVbParametre() {
		return vbParametre;
	}
	public void setVbParametre(VBox vbParametre) {
		this.vbParametre = vbParametre;
	}
	public ComboBox getNombreDeCartes() {
		return nombreDeCartes;
	}

	public void setNombreDeCartes(ComboBox nombreDeCartes) {
		this.nombreDeCartes = nombreDeCartes;
	}

	public ComboBox getMusique() {
		return musique;
	}

	public void setMusique(ComboBox musique) {
		this.musique = musique;
	}

	public ComboBox getThème() {
		return theme;
	}

	public void setThème(ComboBox thème) {
		this.theme = thème;
	}

	public ComboBox getTimer() {
		return timer;
	}

	public void setTimer(ComboBox timer) {
		this.timer = timer;
	}

	
}
