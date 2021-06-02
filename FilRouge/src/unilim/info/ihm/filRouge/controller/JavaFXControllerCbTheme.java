package unilim.info.ihm.filRouge.controller;

import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import unilim.info.ihm.filRouge.view.MemoryPane;
import unilim.info.ihm.filRouge.view.MenuPane;
import unilim.info.ihm.filRouge.view.ParametrePane;
import unilim.info.ihm.filRouge.view.PausePane;
import unilim.info.ihm.filRouge.view.PrincipalPane;
import unilim.info.ihm.filRouge.view.TopPane;

public class JavaFXControllerCbTheme implements EventHandler<MouseEvent> {

	MemoryPane memory;
	ParametrePane parametre;
	PrincipalPane principal;
	Scene scene;
	TopPane top;
	Stage primaryStage;

	

	public JavaFXControllerCbTheme(TopPane top, ParametrePane parametre,Stage primaryStage) {
		this.top = top;
		this.parametre=parametre;	
		this.primaryStage=primaryStage;
		top.setNbScore(0);
	}

	@Override
	public void handle(MouseEvent event) {
		if (parametre.getTheme().getValue().equals("Lamborghini")) {
			if (parametre.getMusique().getValue().equals("Card")) {
				
				memory=new MemoryPane(top, "media/lambo.png",primaryStage,"src/media/card.mp4");
				principal=new PrincipalPane(top,memory);
				primaryStage.setScene(new Scene (principal,900,600));
			}
			if(parametre.getMusique().getValue().equals("Boing") || parametre.getMusique().getValue().equals("Choix de la musique")){
				memory=new MemoryPane(top, "media/lambo.png",primaryStage,"src/media/boing.mp4");
				principal=new PrincipalPane(top,memory);
				primaryStage.setScene(new Scene (principal,900,600));
			}
			
		}
		if (parametre.getTheme().getValue().equals("Covid") || parametre.getTheme().getValue().equals("Choix des thèmes") ) {
			if (parametre.getMusique().getValue().equals("Card")) {
				
				memory=new MemoryPane(top,"media/covid.png",primaryStage,"src/media/card.mp4");
				principal=new PrincipalPane(top,memory);
				primaryStage.setScene(new Scene (principal,900,600));
			}
			if(parametre.getMusique().getValue().equals("Boing") || parametre.getMusique().getValue().equals("Choix de la musique")){
				memory=new MemoryPane(top, "media/covid.png",primaryStage,"src/media/boing.mp4");
				principal=new PrincipalPane(top,memory);
				primaryStage.setScene(new Scene (principal,900,600));
			}	
		}
	}

	public MemoryPane getMemory() {
		return memory;
	}
	
	
	
}
