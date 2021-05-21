package unilim.info.ihm.filRouge;

import java.nio.file.Paths;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import unilim.info.ihm.filRouge.view.*;
import javafx.scene.layout.GridPane;

public class FormMemoryFX extends Application {

    PrincipalPane principal=new PrincipalPane();
    TopPane topPane=new TopPane();
    MemoryPane memory=new MemoryPane();
    MenuPane hboxMenu=new MenuPane();

    @Override
    public void start(Stage primaryStage) throws Exception {

        Scene scene=new Scene (this.hboxMenu,900,600);
        Scene scene2=new Scene (this.principal,900,600);
        this.hboxMenu.getJoueur1().setOnAction(e -> primaryStage.setScene(scene2));
        this.hboxMenu.getJoueur2().setOnAction(e -> primaryStage.setScene(scene2));
        primaryStage.setTitle("Fenêtre de jeu");
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.getIcons().add(topPane.imgSablier);
  

    }
	
	

    public static void main(String[] args) {
        Application.launch(args);

    }
}
















