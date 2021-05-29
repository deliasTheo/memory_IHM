package unilim.info.ihm.filRouge.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class MenuPane extends VBox {
	Button jouer=new Button("Jouer");
	Button parametre=new Button("Paramètres");
	Button quitter=new Button("Quitter");

	HBox hbJoueur = new HBox();
	
	public MenuPane() {
		hbJoueur.getChildren().addAll(jouer);
		this.getChildren().addAll(hbJoueur,parametre,quitter);
		
		this.setAlignment(Pos.CENTER);
		hbJoueur.setAlignment(Pos.CENTER);
		this.setMargin(parametre,new Insets(20,0,20,0));
		
		this.jouer.setPrefSize(130, 50);

		this.parametre.setPrefSize(130, 50);
		this.quitter.setPrefSize(130, 50);
		
		
	}
	public HBox getHbJoueur() {
		return hbJoueur;
	}
	public Button getJouer() {
		return jouer;
	}
	public Button getParametre() {
		return parametre;
	}
	public Button getQuitter() {
		return quitter;
	}
}