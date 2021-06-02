package unilim.info.ihm.filRouge.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;


public class ParametrePane extends VBox {
	ComboBox musique=new ComboBox();
	ComboBox theme=new ComboBox();

	Button valider=new Button("valider");
	Button retourMenu=new Button("Menu");
	VBox vbParametre=new VBox();
	

	public ParametrePane() {
		vbParametre.getChildren().addAll(musique,theme,valider);
		this.getChildren().addAll(vbParametre);
		
		musique.setValue("Choix de la musique");
		musique.getItems().addAll("Card","Boing");
		
		theme.setValue("Choix des thèmes");
		theme.getItems().addAll("Covid","Lamborghini");
		

		vbParametre.setMargin(musique, new Insets(0,0,30,0));
		vbParametre.setMargin(theme, new Insets(0,0,30,0));

		vbParametre.setMargin(valider, new Insets(0,0,30,0));
		vbParametre.setMargin(retourMenu, new Insets(10,0,30,0));
		this.setAlignment(Pos.CENTER);
		vbParametre.setAlignment(Pos.CENTER);
		
		
		this.musique.setPrefSize(250, 50);
		this.theme.setPrefSize(250, 50);

		this.valider.setPrefSize(100, 50);
		
		
		
	
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


	
}
