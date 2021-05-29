package unilim.info.ihm.filRouge;
	
import javafx.application.Application;
import javafx.stage.Stage;
import unilim.info.ihm.filRouge.view.PrincipalPane;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class FormMemoryFX extends Application {
	
	PrincipalPane principal = new PrincipalPane();
	
	@Override
	public void start(Stage primaryStage) {
		try {
			
			
			
			Scene scene = new Scene(principal,400,400);
						
			
			
			primaryStage.setScene(scene);
			primaryStage.show();
						
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
