package unilim.info.ihm.filRouge;

import java.nio.file.Paths;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import unilim.info.ihm.filRouge.controller.JavaFXControllerCbTheme;
import unilim.info.ihm.filRouge.view.*;
import javafx.scene.layout.GridPane;

public class FormMemoryFX extends Application {

 
    TopPane topPane;;
    ParametrePane vboxParametre;
    MemoryPane memory;
    MenuPane hboxMenu;
    PrincipalPane principal;
    GagnePane gagne;
    PausePane vboxPause;
    

    @Override
    public void start(Stage primaryStage) throws Exception {
    	this.topPane=new TopPane();
    	this.vboxParametre=new ParametrePane();
        this.memory=new MemoryPane(topPane, "media/covid.png",primaryStage);
        this.hboxMenu=new MenuPane();
        this.principal=new PrincipalPane(topPane, memory);
        this.gagne =  memory.getEcouteur().getGagne();
        this.vboxPause=new PausePane(memory,hboxMenu);
    	
    	
    	
    	
    	JavaFXControllerCbTheme controlTheme = new JavaFXControllerCbTheme(topPane,vboxParametre,primaryStage);
    	Scene scene=new Scene (this.hboxMenu,900,600);
       // Scene scenePrincipale=new Scene (this.principal,900,600);
        Scene sceneParametre=new Scene (this.vboxParametre,900,600);
        Scene scenePause=new Scene (this.vboxPause,900,600);
        //Scene sceneGagne=new Scene (memory.getEcouteur().getGagne(),900,600);
      
        
 
        this.hboxMenu.getJouer().addEventFilter(MouseEvent.MOUSE_PRESSED,controlTheme);
       
        this.hboxMenu.getParametre().setOnAction(e -> primaryStage.setScene(sceneParametre));
        this.principal.getTop().btnPause.setOnAction(e -> primaryStage.setScene(scenePause));
        this.vboxParametre.getRetourMenu().setOnAction(e -> primaryStage.setScene(scene));
        this.vboxParametre.getValider().setOnAction(e -> primaryStage.setScene(scene));
        this.vboxPause.getMenu().setOnAction(e -> primaryStage.setScene(scene));
        this.vboxPause.getContinuer().setOnAction(e -> primaryStage.setScene(new Scene (new PrincipalPane(topPane, controlTheme.getMemory()),900,600)));
        this.memory.getEcouteur().getGagne().getRetourMenu().setOnAction(e -> primaryStage.setScene(scene));//pk le set se fait sur le mauvais retourmenu (bouton qui marche pas)
        this.vboxPause.getReesayer().addEventFilter(MouseEvent.MOUSE_PRESSED,controlTheme);        
        this.hboxMenu.getQuitter().setOnAction(e -> primaryStage.close());
        if(this.memory.getEcouteur().vide()) {
        	Scene sceneFin=new Scene (this.gagne,900,600);
        	primaryStage.setScene(sceneFin);
        	
        }
       this.gagne.getRetourMenu().setOnAction(e -> primaryStage.setScene(scene));
        
        primaryStage.setTitle("Fenêtre de jeu");
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.getIcons().add(topPane.imgSablier);
       
        //RANDOM ET LES PARAMETRES A FAIRE//
    }
 
	
	

    public TopPane getTopPane() {
		return topPane;
	}




	public ParametrePane getVboxParametre() {
		return vboxParametre;
	}




	public GagnePane getGagne() {
		return gagne;
	}




	public MemoryPane getMemory() {
		return memory;
	}




	public MenuPane getHboxMenu() {
		return hboxMenu;
	}




	public PrincipalPane getPrincipal() {
		return principal;
	}




	public PausePane getVboxPause() {
		return vboxPause;
	}




	public static void main(String[] args) {
        Application.launch(args);

    }
}













