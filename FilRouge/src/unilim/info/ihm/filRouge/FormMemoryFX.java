package unilim.info.ihm.filRouge;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import unilim.info.ihm.filRouge.view.*;
import javafx.scene.layout.GridPane;

public class FormMemoryFX extends Application {

    PrincipalPane principal=new PrincipalPane();
    TopPane topPane=new TopPane();
    MemoryPane memory=new MemoryPane();
    VBox hboxMenu=new MenuPane();

    @Override
    public void start(Stage primaryStage) throws Exception {

        Scene scene=new Scene (this.principal,900,600);
        primaryStage.setTitle("Fenêtre de jeu");
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.getIcons().add(topPane.imgSablier);

    }


    public static void main(String[] args) {
        Application.launch(args);

    }
}

