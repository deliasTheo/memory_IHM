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

 
    TopPane topPane=new TopPane();

    MemoryPane memory=new MemoryPane(topPane);
    MenuPane hboxMenu=new MenuPane();
    PrincipalPane principal=new PrincipalPane(topPane, memory);
    ParametrePane vboxParametre=new ParametrePane();
    PausePane vboxPause=new PausePane(memory,hboxMenu);



    @Override
    public void start(Stage primaryStage) throws Exception {

        Scene scene=new Scene (this.hboxMenu,900,600);

        Scene scenePrincipale=new Scene (this.principal,900,600);
        Scene sceneParametre=new Scene (this.vboxParametre,900,600);
        Scene scenePause=new Scene (this.vboxPause,900,600);
      
        this.hboxMenu.getJoueur1().setOnAction(e -> primaryStage.setScene(scenePrincipale));
        this.hboxMenu.getJoueur2().setOnAction(e -> primaryStage.setScene(scenePrincipale));
        this.hboxMenu.getParametre().setOnAction(e -> primaryStage.setScene(sceneParametre));
        this.principal.getTop().btnPause.setOnAction(e -> primaryStage.setScene(scenePause));
        this.vboxParametre.getRetourMenu().setOnAction(e -> primaryStage.setScene(scene));
        this.vboxParametre.getValider().setOnAction(e -> primaryStage.setScene(scenePrincipale));
        this.vboxPause.getMenu().setOnAction(e -> primaryStage.setScene(scene));
        this.vboxPause.getContinuer().setOnAction(e -> primaryStage.setScene(scenePrincipale));
        this.vboxPause.getReesayer().setOnAction(e -> primaryStage.setScene(scenePrincipale));
        this.hboxMenu.getQuitter().setOnAction(e -> primaryStage.close());
        primaryStage.setTitle("Fenêtre de jeu");
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.getIcons().add(topPane.imgSablier);
       
        //RANDOM ET LES PARAMETRES A FAIRE//
    }
 
	
	

    public static void main(String[] args) {
        Application.launch(args);

    }
}













