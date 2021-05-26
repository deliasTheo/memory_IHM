package unilim.info.ihm.filRouge.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import unilim.info.ihm.filRouge.controller.MenuControllerJouer;

public class MenuPane extends VBox {
	Button jouer=new Button("Jouer");
	Button parametre=new Button("Paramètres");
	Button quitter=new Button("Quitter");
	Button joueur1 = new Button("1 Joueur");

	Button joueur2 = new Button("2 Joueurs");

	HBox hbJoueur = new HBox();
	
	public MenuPane() {
		hbJoueur.getChildren().addAll(joueur1,jouer,joueur2);
		this.getChildren().addAll(hbJoueur,parametre,quitter);
		
		this.setAlignment(Pos.CENTER);
		hbJoueur.setAlignment(Pos.CENTER);
		this.setMargin(parametre,new Insets(20,0,20,0));
		//this.setMargin(joueur2,new Insets(0,50,0,0));
		
		this.jouer.setPrefSize(130, 50);
		this.jouer.addEventFilter(MouseEvent.MOUSE_PRESSED, new MenuControllerJouer(this));

		this.parametre.setPrefSize(130, 50);
		this.quitter.setPrefSize(130, 50);
		
		this.joueur1.setPrefSize(130, 50);
		this.joueur2.setPrefSize(130, 50);
		
		this.joueur1.setVisible(false);
		this.joueur2.setVisible(false);
		
		
	}
	public Button getJoueur1() {
		return joueur1;
	}
	public Button getJoueur2() {
		return joueur2;
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