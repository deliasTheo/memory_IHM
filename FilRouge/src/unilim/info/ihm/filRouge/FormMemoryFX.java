package unilim.info.ihm.filRouge;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import unilim.info.ihm.filRouge.view.MenuPane;
import unilim.info.ihm.filRouge.view.PrincipalPane;

public class FormMemoryFX extends Application {
	
	PrincipalPane principal=new PrincipalPane();
	VBox hboxMenu=new MenuPane();
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Scene scene=new Scene (this.principal,600,250);
		primaryStage.setTitle("Première fenêtre");
		primaryStage.setScene(scene);
		primaryStage.show();
	
	}
	
	
	public static void main(String[] args) {
		Application.launch(args);

	}
}


