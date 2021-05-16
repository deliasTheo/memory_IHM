package unilim.info.ihm.fileRouge.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class MenuPane extends VBox {
	Button jouer=new Button("Jouer");
	Button parametre=new Button("Paramètres");
	Button quitter=new Button("Quitter");
	public MenuPane() {
		this.getChildren().addAll(jouer,parametre,quitter);
		this.setAlignment(Pos.CENTER);
		this.setMargin(parametre,new Insets(20,0,20,0));
		this.jouer.setPrefSize(130, 50);
		this.parametre.setPrefSize(130, 50);
		this.quitter.setPrefSize(130, 50);
	}
}
